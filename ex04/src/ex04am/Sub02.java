package ex04am;

import java.util.*;

public class Sub02 {
	public static void run() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArrayList<Juso> jusoes = new ArrayList<>(); // <>안에는 클래스네임이다.
		Juso juso1 = new Juso("김민지", "인천 송도", "010-0000-0000");
		jusoes.add(juso1);
		juso1 = new Juso("팜하니", "서울 종로", "010-1111-1111");
		jusoes.add(juso1);
		juso1 = new Juso("이지은", "서울 한남", "010-2222-2222");
		jusoes.add(juso1);
		while(run) {
			System.out.println("\n┌────────────────────────────────────────────────────┐");
			System.out.println("\t\t\t\t\t1.주소등록 | 2. 주소목록 | 3. 주소조회 | 4. 주소삭제 | 0. 종료");
			System.out.println("└────────────────────────────────────────────────────┘");
			System.out.print("\t\t선택하세요. ");
			String menu = scan.nextLine();  //nextLine  Scanner는 클래스다 = nextLine은 메소드다 
			switch(menu) {
			case "1": 
				Juso juso=new Juso();
				System.out.print("\t\t이름을 입력하세요.");
				String name = scan.nextLine();
				juso.setName(name);
				System.out.print("\t\t주소를 입력하세요.");
				String address = scan.nextLine();
				juso.setAddress(address);
				System.out.print("\t\t전화번호를 입력하세요.");
				String phone = scan.nextLine();
				juso.setPhone(phone);
				jusoes.add(juso);
				System.out.println("\t\t등록 되었습니다.");
				System.out.println("\t\t" + juso.toString() + "\n" + "\t\t등록완료");
				System.out.println("\t\t등록된 데이터는 " + jusoes.size() + "개 입니다.");
				break;
			case "2":
				System.out.println("\t\t이름\t\t주소\t\t\t전화번호");
				for(Juso j:jusoes) {
					System.out.printf("\t\t%s\t%s\t\t%s\n", j.getName(), j.getAddress(), j.getPhone());
				}//for
				System.out.println("\t\t등록된 데이터 개수는 " + jusoes.size() + "개 입니다.");
				break;
			case "3":
				while(true) {
					System.out.print("\t\t조회할 이름이나 전화번호를 입력하세요.");
					String sname=scan.nextLine();
					if(sname =="") {
						System.out.print("\t\t검색을 취소합니다.");
						break;
					}//if
					boolean find=false;
					for(Juso j:jusoes) {
						if(sname.equals(j.getName()) || sname.equals(j.getPhone())) {
							System.out.println("\t\t이름 :" + j.getName());
							System.out.println("\t\t주소 :" + j.getAddress());
							System.out.println("\t\t전화번호 :" + j.getPhone());
							find=true;//찾았을경우 find를 true로 바꿔주는거임
						}//if
					}//for
					if(!find) System.out.print("\t\t검색하신 이름과 전화번호는 존재 하지 않습니다.\n");
					System.out.println("\t\t──────────────────────");
				}//while
				break;
			case "4":
				System.out.print("\t\t삭제할 이름이나 전화번호를 입력하세요.");
				String sname=scan.nextLine();
				boolean find=false;
				for(Juso j:jusoes) {
					if(sname.equals(j.getName()) || sname.equals(j.getPhone())) {
						find=true;//찾았을경우 find를 true로 바꿔주는거임
						System.out.print("\t\t정말 삭제하시겠습니까?(Y/y)");
						String ans = scan.nextLine();
						if(ans.equals("Y") || ans.equals("y")) {
							jusoes.remove(j);
							System.out.println("\t\t삭제 되었습니다.");
							break;
						} else {
							System.out.println("\t\t삭제 취소 되었습니다.");
							break;
						}//else
					}//if
				}//for
				if(!find) System.out.print("\t\t검색하신 이름과 전화번호는 존재 하지 않습니다.\n");
				System.out.println("\t\t──────────────────────");
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
