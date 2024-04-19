package product;

import java.util.*;

import sale.Sub;

import java.sql.*; // OJDBC가 없으면 이거못쓴다.

public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ProDAO dao = new ProDAO();
		Connection con = Database.CON;
		while(run) {
			System.out.println("\n┌────────────────────────────────────────────────────┐");
			System.out.println("\t\t\t\t\t1.상품등록 | 2. 상품목록 | 3. 상품찾기 | 4. 상품삭제 | 5. 상품수정 | 6.매출관리 | 0. 종료");
			System.out.println("└────────────────────────────────────────────────────┘");
			System.out.print("\t\t선택하세요. ");
			String menu = scan.nextLine();  //nextLine  Scanner는 클래스다 = nextLine은 메소드다 
			switch(menu) {
			case "1":
				ProVO vo1 = new ProVO();
				vo1.setCode(dao.getCode());
				System.out.println("\t\t상품 코드를 입력하세요." + vo1.getCode());
				System.out.print("\t\t상품 이름을 입력하세요.");
				String name1 = scan.nextLine();
				if(name1 == "") {
					System.out.println("\t\t상품 등록이 취소되었습니다.");
					break;
				}else {
					vo1.setName(name1);
				}
				while(true) {
					System.out.print("\t\t상품 가격을 입력하세요.");
					String price1 = scan.nextLine();
					if(price1 == "") {
						System.out.println("\t\t상품 등록이 취소되었습니다.");
						break;
					}//if
					if(isNumber(price1)) {
						vo1.setPrice(Integer.parseInt(price1));
						System.out.println("\t\t" + vo1.toString());
						dao.insert(vo1);
						System.out.println("\t\t상품등록이 완료되었습니다.");
						break;
					}//if
//					else {
//						vo1.setPrice(Integer.parseInt(price1));
//					}
				}//while
				break;
			case "2":
				ArrayList<ProVO> array = dao.list();
				for(ProVO vo2:array) {
					System.out.println("\t\t" + vo2.toString());
				}
//				for(ProVO vo2:dao.list()) {}
				break;
			case "3":
				while(true) {
					System.out.print("\t\t찾을 상품의 코드를 입력하세요.");
					String code3 = scan.nextLine();
					if(code3 == "") {
						System.out.println("\t\t찾기를 취소합니다.");
						break;
					}//if
					ProVO vo3 = dao.read(code3);
					if(vo3.getCode()==null) {
						System.out.println("\t\t" + code3 + "의 상품이 존재하지 않습니다.");
					}else {
						System.out.println("\t\t" + vo3.toString());
					}//if
				}//while
				break; // switch의 브레이크
				
			case "4":
				System.out.print("\t\t삭제할 코드를 입력하세요.");
				String code4 = scan.nextLine();
				ProVO vo4 = dao.read(code4);
				if(vo4.getCode() == null) {
					System.out.println("\t\t" + code4 + "번의 상품이 존재하지 않습니다.");
				}else {
					System.out.println("\t\t" + vo4.toString());
					System.out.print("\t\t삭제 하시겠습니까?(Y/y)");
					String sel = scan.nextLine();
					if(sel.equals("Y") || sel.equals("y")) {
						if(dao.delete(code4)) {
							System.out.println("\t\t상품정보 삭제완료.");
						}else {
							System.out.println("\t\t상품정보 삭제에 실패하였습니다.");
						}//if
					}else {
						System.out.println("\t\t삭제를 취소합니다.");
					}//if
				}//if
				break;
			case "5":
				System.out.print("\t\t수정할 상품코드를 입력하세요.");
				String code5 = scan.nextLine();
				ProVO vo5 = dao.read(code5);
				if(vo5.getCode()==null) {
					System.out.println("\t\t수정을 취소합니다.");
				}else {
					System.out.println("\t\t" + code5 + " 코드의 상품이름은 " + vo5.getName() + "입니다.");
					System.out.print("\t\t새로운 상품이름을 입력해주세요");
					String name5 = scan.nextLine();
					if(!name5.equals("")) {
						vo5.setName(name5);
						while(true) {
							System.out.println("\t\t" + code5 +"코드의 상품가격은 " +vo5.getPrice() + "입니다.");
							System.out.print("\t\t새로운 상품가격을 입력해주세요.");
							String price5 = scan.nextLine();
							if(price5.equals("")) {
								System.out.println("\t\t수정을 취소하였습니다.");
								break;
							}
							if(isNumber(price5)){
								vo5.setPrice(Integer.parseInt(price5));
								System.out.println("\t\t" + vo5.toString());
								System.out.print("\t\t수정 하시겠습니까?(Y/y)");
								String sel5 = scan.nextLine();
								if(sel5.equals("Y") || sel5.equals("y")) {
									System.out.println("\t\t" + vo5.toString());
									dao.update(vo5);
									System.out.println("\t\t상품정보 수정이 완료되었습니다.");
								}else {
									System.out.println("\t\t수정을 취소합니다.");
								}
								break;
							}
						}//while
					}else{
						System.out.println("\t\t수정을 취소합니다.");
						break;
					}
				}//if
				break;
			case "6":
				Sub.run();
				break;
			case "0":
				System.out.println("\t\t....종료합니다....");
				run=false;
				break;
			default:
				System.out.println("\t\t메뉴에서 선택하세요..");
			}//switch
		}//while
	}//method
	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("\t\t숫자만 입력해주세요.");
			return false;
		} 
	}//method
}//class



