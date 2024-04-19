package ex02pm;

import java.util.*;

public class Sub03 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> jusoes = new ArrayList<>();
		ArrayList<String> phones = new ArrayList<>();
		
		names.add("김민지"); jusoes.add("인천 계양"); phones.add("010-0000-0000");
		names.add("팜하니"); jusoes.add("경기 광주"); phones.add("010-1111-1111");
		
		while(run) {
			System.out.println("\n┌───────────────────────────────────┐");
			System.out.println("\t\t 1. 주소등록 | 2. 이름검색 | 3. 주소목록 | 4. 주소삭제 | 0. 종료");
			System.out.println("└───────────────────────────────────┘");
			System.out.print("\t\t메뉴를 선택하세요 - ");
			String menu=scan.nextLine();
			switch(menu) {
			case "1" :
				System.out.print("\t\t성함을 입력하세요.");
				names.add(scan.nextLine());
				System.out.print("\t\t주소을 입력하세요.");
				jusoes.add(scan.nextLine());
				System.out.print("\t\t휴대폰 번호를 입력하세요.");
				phones.add(scan.nextLine());
				break;
			case "2" :
				while(true) {
					System.out.print("\n\t\t검색할 이름은?");
					String sname=scan.nextLine();
					if(sname=="") {
						System.out.println("\n\t\t ☞ 검색을 종료합니다.");
						break;
					}//if
					boolean find=false;
					for(int i = 0; i < names.size(); i++) {
						String name = names.get(i);
						if (sname.equals(name)) {
							System.out.println("\t\t☞ " + sname + " 님의 주소는 " + jusoes.get(i) + "이고, 핸드폰 번호는 " + phones.get(i) + " 입니다.");
							find=true;
						}//if
					}//for
					if(!find) {
						System.out.println("\t\t☞ " + sname + " 님은 등록되어 있지 않습니다.");
					}//if
				}//while
				break;
			case "3" :
				System.out.println("\n\t\t이름\t\t\t주소\t\t\t핸드폰번호");
				for(int i=0; i<names.size(); i++) {
					System.out.printf("\t\t%s\t\t%s\t\t%s\t\t\n", names.get(i), jusoes.get(i), phones.get(i)); //get은 괄호입니다.
				}
				System.out.println("\t\t주소록에 " + jusoes.size() + "명이 존재합니다.");
				break;
			case "4" :
				System.out.print("\t\t삭제하실 이름을 입력하세요.");
				String rname = scan.nextLine();
				boolean find = false;
				for(int i=0; i<names.size(); i++) {
					String name=names.get(i);
					if(rname.equals(name)) {
						System.out.println("\t\t입력하신 성함은 " + rname + "입니다.\n" );
						find = true;
						System.out.print("\t\t정말 삭제 하시겠습니까?(Y/y)");
						String answer=scan.nextLine();
						if(answer.equals("Y") || answer.equals("y")) {
							names.remove(i); jusoes.remove(i); phones.remove(i);
							System.out.println("\t\t☞ 삭제 되었습니다.");
							break;
						}else{
							System.out.println("\t\t☞ 삭제 취소 되었습니다.");
						}//if
					}//if
				}//for
				if(!find) {
					System.out.println("\t\t" + rname + " 님은 주소록에 존재 하지 않습니다.");
				}
				break;
			case "0" :
				run=false;
				System.out.println("\t\t....종료하였습니다....");
				break;
			default:
				System.out.println("\t\t☞메뉴에서 선택하십시오.");	
			}
		}//while
	}
}