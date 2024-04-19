package ex02am;

import java.util.Scanner;

public class Main {

	public static void main1(String[] args) {
		System.out.println("JAVA....0409");
		Scanner s=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("┌─────────────────────────────┐");
			System.out.println("\t\t 1. 성적관리 | 2. 매출관리 | 3. 주소관리 | 0. 종료");
			System.out.println("└─────────────────────────────┘");
			System.out.println("메뉴를 선택하세요.");
			String menu = s.nextLine();
			switch(menu) {
			case "1":
				Sub01.run();
				break;
			case "2":
				Sub02.run();
				break;
			case "3":
				Sub03.run();
				break;
			case "0":
				run = false;
				break;
			default:
				System.out.println("0, 1, 2, 3 중에서 선택하세요.");
			}
		}//while
		System.out.println("....종료합니다....");
	}
}
