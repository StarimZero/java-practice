package ex02am;

import java.util.Scanner;

public class Sub03 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println("주소관리");
		String[] names = new String[100];
		String[] jusoes = new String[100];
		String[] phones = new String[100];
		int count = 0;
		boolean run=true;
		while(run) {
			System.out.println("\n┌─────────────────────────────┐");
			System.out.println("\t\t\t1. 주소등록 | 2.주소현황 | 0.종료");
			System.out.println("└─────────────────────────────┘");
			System.out.println("★메뉴를 선택하세요. ");
			String menu=scan.nextLine();
			switch(menu) {
			case "1" :
				while(true) {
					System.out.println("성함을 입력해주세요");
					String name=scan.nextLine();
					if(name=="") {
						System.out.println("★입력을 종료합니다.");
						break;
					}
					System.out.println("주소를 입력해 주세요.");
					String juso=scan.nextLine();
					if(juso=="") {
						System.out.println("★입력을 종료합니다.");
						break;
					}
					System.out.println("전화번호를 입력해주세요.");
					String phone=scan.nextLine();
					if(phone=="") {
						System.out.println("★입력을 종료합니다.");
						break;
					}
					names[count] = name;
					jusoes[count] = juso;
					phones[count] = phone;
					System.out.println("\t\t"+ name + "님의 주소가 등록되었습니다.");
					count++;
					}
				break;
			case "2" :
				System.out.println("\t\t이름\t\t\t주소\t\t\t전화번호");
				if(count==0) {
					System.out.println("★등록된 주소가 없습니다.");
				}else {
					for(int i=0; i < count; i++) {
						System.out.printf("\t\t%s\t\t%s\t\t%s\n", names[i], jusoes[i], phones[i]);
					}
					System.out.println("현재" + count + "개의 주소가 존재합니다.");
				}
				break;
			case "0":
				run=false;
				break;
			default:
				System.out.println("0, 1, 2중에서 선택하세요");
			}//switch
		}//while
		System.out.println("....종료합니다....");
	}//method
}//class
