package sale;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		System.out.println("JAVA...0415");
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		SaleDAO dao =  new SaleDAO();
		while(run) {
			
			System.out.println("\t\t┌───────────────────────────────────┐");
			System.out.println("\t\t 		   1. 판매등록 | 2. 판매조회 | 3. 상품찾기 | 4. 판매삭제 | 0. 종료");
			System.out.println("\t\t└───────────────────────────────────┘");
			
			
			System.out.print("\t\t메뉴를 선택하세요. ");
			String menu = scan.nextLine();
			switch(menu) {
			case "1":
				SaleVO sa = new SaleVO();
				//새로운 번호구하기
				ArrayList<SaleVO> list = dao.list();
				SaleVO lastSale = list.get(list.size()-1);
				int newCode = lastSale.getCode() + 1;
				System.out.println("\t\t코드를 입력하세요 " + newCode );
//				String no = scan.nextLine();
//				if(no == "")
//					break;
//				sa.setCode(Integer.parseInt(code));
				sa.setCode(newCode);
				System.out.print("\t\t상품명을 입력하세요 ");
				String name = scan.nextLine();
				if(name == "")
					break;
				sa.setName(name);
				while(true) {
					System.out.print("\t\t가격을 입력하세요 ");
					String price = scan.nextLine();
//					if(price == "")
//						break;
					if(check(price)) {
						sa.setPrice(Integer.parseInt(price));
						break;
					}//if
				}//while
//				sa.setPrice(Integer.parseInt(price));
				while(true) {
					System.out.print("\t\t판매대수를 입력하세요 ");
					String qnt = scan.nextLine();
//					if(qnt == "")
//						break;
					if(check(qnt)) {
						sa.setQnt(Integer.parseInt(qnt));
						break;
					}//if
				}//while
//				System.out.print("\t\t판매대수를 입력하세요 ");
//				String qnt = scan.nextLine();
//				if(qnt == "")
//					break;				
//				sa.setQnt(Integer.parseInt(qnt));
				dao.insert(sa);
				System.out.println("\t\t등록이 완료되었습니다.");
				break;
			case "2":
				ArrayList<SaleVO> array = dao.list();
				System.out.println("\t\t코드\t\t상품명\t\t상품가격\t\t\t판매대수\t\t총매출액");
				for(SaleVO s:array) {
					System.out.printf("\t\t%d\t\t%s\t\t%,d원\t\t%d대\t\t%,13d원\n", s.getCode(), s.getName(), s.getPrice(), s.getQnt(), s.getPrice() * s.getQnt());
				}//for
				System.out.println("\t\t" + array.size() + "개 상품이 존재합니다.");
				break;
			case "3":
				while(run) {
					System.out.print("\t\t검색할 코드를 입력하세요. ");
					String code = scan.nextLine();
					if(code == "") {
						System.out.println("\t\t찾기를 종료합니다.");
						break;
					}
						
					if(check(code)) {
					SaleVO sale = dao.read(Integer.parseInt(code));
						if(sale.getCode() == 0) {
							System.out.println("\t\t검색하신 코드는 존재하지 않습니다.");
						}else {
						System.out.println("\t\t코드 : " + sale.getCode());
						System.out.println("\t\t상품명 : " + sale.getName());
//						System.out.println("\t\t 상품가격 : " + sale.getPrice() + "원");
						System.out.printf("\t\t상품가격 : %,d 원\n" ,sale.getPrice());
						System.out.println("\t\t판매대수 : " + sale.getQnt());
						}//if
					}//if
				}//while
				break;
			case "4":
				while(run) {
					System.out.print("\t\t삭제할 코드를 입력하세요 ");
					String rco = scan.nextLine();
					if(rco == "") {
						System.out.println("\t\t삭제를 취소합니다.");
						break;
					}
					if(check(rco)) {
						sa = dao.read(Integer.parseInt(rco));
						if(sa.getName()==null) {
							System.out.println("\t\t" + rco + "번은 존재하지 않습니다.");
						}else {
							System.out.println("\t\t상품명 : " + sa.getName());
							System.out.printf("\t\t상품가격 : %,d원\n" ,sa.getPrice());
							System.out.println("\t\t판매대수 : " + sa.getQnt());
							System.out.print("\t\t삭제하시겠습니까?(Y/y)");
							String sel = scan.nextLine();
							if(sel.equals("Y") || sel.equals("y")) {
								dao.delete(Integer.parseInt(rco));
								System.out.println("\t\t" + sa.getName() + "의 상품정보가 삭제 되었습니다.");
							}else {
								System.out.println("\t\t삭제를 취소합니다.");
								break;
							}
						}
					}//if
				}//while
//				sa = dao.read(Integer.parseInt(rco));
//				if(sa.getCode() == 0) {
//					System.out.println("\t\t" + rco + "번은 존재하지 않습니다.");
//				}else {
//					String sel = scan.nextLine();
//					if(sel.equals("Y") || sel.equals("y")) {
//						dao.delete(Integer.parseInt(rco));
//						System.out.println("\t\t" + sa.getName() + "의 상품정보가 삭제 되었습니다.");
//					}else {
//						System.out.println("\t\t삭제를 취소합니다.");
//					}
//					
//				}
				
				break;
			case "0":
				run = false;
				break;
			default:
				System.out.println("\t\t메뉴중에서 선택하세요.");
				break;
			}//switch
		}//while
		System.out.println("\t\t ....종료합니다....");
	}//method
	public static boolean check(String str) { // 문자로 입력받아서 숫자로변경하는데 try해서 맞으면 true리턴 안되면 catch - false로간다. 
		try {
			int num=Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("\t\t!!!!숫자를 입력하세요.");
			return false;
		} // catch
	} // method
}//class
