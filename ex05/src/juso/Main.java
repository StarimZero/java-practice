package juso;

import java.util.*;

public class Main {

	public static void main1(String[] args) {
		System.out.println("JAVA...0415");
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		JusoDAO dao = new JusoDAO();
		while(run) {
			
			System.out.println("\t\t┌───────────────────────────────────┐");
			System.out.println("\t\t 		   1. 주소등록 | 2. 주소조회 | 3. 주소찾기 | 4. 주소삭제 | 0. 종료");
			System.out.println("\t\t└───────────────────────────────────┘");
			
			System.out.print("\t\t 메뉴를 선택하세요. ");
			String menu = scan.nextLine();
			switch(menu) {
			case "1":
				Juso ju = new Juso();
				//새로운 번호구하기
				ArrayList<Juso> list = dao.list();
				Juso juso1 = list.get(list.size()-1);
				int newNo = juso1.getNo() + 1;
				System.out.println("\t\t 번호를 입력하세요 " + newNo );
//				String no = scan.nextLine();
//				if(no == "")
//					break;
//				ju.setNo(Integer.parseInt(no));
				ju.setNo(newNo);
				System.out.print("\t\t 이름를 입력하세요 ");
				String name = scan.nextLine();
				if(name == "")
					break;
				ju.setName(name);
				System.out.print("\t\t 주소를 입력하세요 ");
				String address = scan.nextLine();
				if(address == "")
					break;
				ju.setAddress(address);
				System.out.print("\t\t 전화번호를 입력하세요 ");
				String phone = scan.nextLine();
				if(phone == "")
					break;				
				ju.setPhone(phone);
				dao.insert(ju);
				System.out.println("\t\t 등록이 완료되었습니다.");
				break;
			case "2":
				ArrayList<Juso> array = dao.list();
				for(Juso j:array) {
					System.out.println("\t\t" + j.toString());
				}//for
				break;
			case "3":// 주소조회
				while(run) {
					System.out.print("\t\t 검색할 이름이나 번호를 입력하세요. ");
					name = scan.nextLine();
					if(name == "")
						break;
					Juso juso = dao.read(name);
					if(juso.getNo() == 0) {
						System.out.println("\t\t 검색하신 이름과 번호는 존재하지 않습니다.");
					}else {
					System.out.println("\t\t 번호 : " + juso.getNo());
					System.out.println("\t\t 이름 : " + juso.getName());
					System.out.println("\t\t 주소 : " + juso.getAddress());
					System.out.println("\t\t 전화번호 : " + juso.getPhone());
					}
				}//while
				break;
			case "4":
				System.out.print("\t\t 삭제할 번호를 입력하세요 ");
				String sno = scan.nextLine();
				if(sno == "") 
					break;
				juso1 = dao.read(sno);
				if(juso1.getNo() == 0) {
					System.out.println("\t\t " + sno + "번은 존재하지 않습니다.");
				}else {
					dao.delete(Integer.parseInt(sno));
					System.out.println("\t\t " + juso1.getName() + "님의 정보가 삭제 되었습니다.");
				}
				
				break;
			case "0":
				run = false;
				break;
			default:
				System.out.println("\t\t 메뉴중에서 선택하세요.");
				break;
			}//switch
		}//while
		System.out.println("\t\t ....종료합니다....");
	}//method
}//class
