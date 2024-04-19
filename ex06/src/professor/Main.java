package professor;

import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		Connection con = Database.CON;
		ProDAO dao = new ProDAO();
		while(run) {
			System.out.println("\n┌────────────────────────────────────────────────────┐");
			System.out.println("\t\t\t\t\t1.등록 | 2. 목록 | 3. 찾기 | 4. 삭제 | 5. 수정 | 0. 종료");
			System.out.println("└────────────────────────────────────────────────────┘");
			System.out.print("\t\t선택하세요. ");
			String menu = scan.nextLine();  //nextLine  Scanner는 클래스다 = nextLine은 메소드다 
			switch(menu) {
			case "1":
				ProVO vo1 = new ProVO();
				int code = dao.getCode(); // 코드 자동설정할때 넣기
				System.out.println("\t\t교수 코드 >" + code);
				vo1.setPcode(String.valueOf(code)); // 인티저를 스트링으로 바꿧다 왜냐 VO에 Pcode를 String으로 해놨으니까
				
				
//				System.out.print("\t\t코드를 입력하십시오.");
//				String pcode = scan.nextLine();
//				if(pcode == "") {
//					System.out.println("\t\t등록을 취소합니다.");
//					break;
//				} //if
//				vo1.setPcode(pcode);
				
				System.out.print("\t\t이름을 입력하십시오.");
				String pname = scan.nextLine();
				if(pname == "") {
					System.out.println("\t\t등록을 취소합니다.");
					break;
				} //if
				vo1.setPname(pname);

				
//				System.out.print("\t\t학과를 입력하십시오.");
//				String dept = scan.nextLine();
//				if(dept == "") {
//					System.out.println("\t\t등록을 취소합니다.");
//					break;
//				} //if
//				vo1.setDept(dept);
				
//				System.out.print("\t\t임용날짜를 입력하십시오.");
//				String hiredate = scan.nextLine();
//				if(hiredate == "") {
//					System.out.println("\t\t등록을 취소합니다.");
//					break;
//				} //if
//				vo1.setHiredate(hiredate);
				
//				System.out.print("\t\t기본급을 입력하십시오.");
//				String salary = scan.nextLine();
//				if(salary == "") {
//					System.out.println("\t\t등록을 취소합니다.");
//					break;
//				} //if
//				vo1.setSalary(Integer.parseInt(salary));
				
				dao.insert(vo1);
				System.out.println("\t\t등록완료!");
				break;
			case "2":
				System.out.println("\t\t코드\t\t이름\t\t\t학과\t\t\t임용일\t\t\t직위\t\t\t\t주급");
				for(ProVO vo : dao.list()) {
//					System.out.println("\t\t" + vo.toString());
						String date = "";
						if(vo.getHiredate() != null) {
						date = vo.getHiredate().substring(0, 10);
						}else {
							date = "미등록";
						}
						String dept = "미등록";
						if(vo.getDept() != null) {
							dept = vo.getDept();
						}
						String title = "미등록";
						if(vo.getTitle() != null) {
							title = vo.getTitle();
						}
						System.out.printf("\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s\t\t%,d원\n", vo.getPcode(), vo.getPname(), dept, date, title, vo.getSalary());
				}
				break;
			case "3":
				while(true) {
					System.out.print("\t\t찾고싶은 코드를 입력하세요.");
					String code3 = scan.nextLine();
					if(code3 =="") {
						System.out.println("\t\t찾기를 취소합니다.");
						break;
					}
					ProVO vo3 = dao.read(code3);
					if(vo3.getPcode() == null) {
						System.out.println("\t\t검색하신 " + code3 + "은 없는 코드입니다.");
					}else {
						System.out.println("\t\t" + vo3.toString());
					}
				}
				
			case "4":
				System.out.println("\t\t삭제할 코드를 입력해주세요");
				String code4 = scan.nextLine();
				ProVO vo4 = dao.read(code4);
				if(vo4.getPcode()==null) {
					System.out.println("\t\t입력하신 " + code4 +"는 존재하지 않습니다.");
				}else {
					System.out.println("\t\t" + vo4.toString());
					System.out.println("\t\t " + vo4.getPname() + " 님의 정보를 삭제하시겠습니까? (Y/y)");
					String sel = scan.nextLine();
					if(sel.equals("Y") || sel.equals("y")) {
						dao.delete(code4);
						System.out.println("\t\t삭제 완료되었습니다.");
					}else {
						System.out.println("\t\t삭제취소 되었습니다.");
					}
				}
				break;
			case "5":
				System.out.print("\t\t수정할 코드를 입력해주세요");
				String code5 = scan.nextLine();
				ProVO vo5 = dao.read(code5);
				if(vo5.getPcode()==null) {
					System.out.println("\t\t입력하신 " + code5 +"의 코드번호는 존재하지 않습니다.");
				}else {
//					System.out.println("\t\t" + vo5.toString());
					System.out.println("\t\t" + vo5.getPname() + "님의 정보를 수정합니다.");
					System.out.print("\t\t수정할 이름을 입력하세요.");
					String pname5 = scan.nextLine();
					if(!pname5.equals("")){
						vo5.setPname(pname5);
						System.out.print("\t\t수정할 학과를 입력하세요.");
						String dept5 = scan.nextLine();
						if(!dept5.equals("")) {
							vo5.setDept(dept5);
							System.out.print("\t\t수정할 직급을 입력하세요.");
							String title5 = scan.nextLine();
							if(!title5.equals("")) {
								vo5.setTitle(title5);
								System.out.print("\t\t수정할 주급을 입력하세요.");
								int salary5 = Integer.parseInt(scan.nextLine());
//								if(salary5 != ) {
									vo5.setSalary(salary5);
									System.out.print("\t\t정말 수정하시겠습니까?(Y/y)");
									String sel = scan.nextLine();
									if(sel.equals("Y") || sel.equals("y")) {
										dao.update(vo5);
										System.out.println("\t\t수정완료!");
//									}
									}
							}
						}
					}else {
						System.out.println("\t\t수정을 취소합니다.");
					}
//					System.out.println(vo5.toString());
				}
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
}//class
