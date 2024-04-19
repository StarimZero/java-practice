package ex02am;

import java.util.Scanner;

public class 혼자해보기 {
	public static void run() {
		System.out.println("주소관리");
		boolean run=true;
		Scanner s=new Scanner(System.in);
		String[] names = new String[100];
		String[] jusoes = new String[100];
		String[] phones = new String[100];
		int count = 0;
		while(run) {
			System.out.println("───────────────────────────");
			System.out.println(" \t\t\t1. 주소등록하기 | 2. 주소현황보기 | 0. 종료하기");
			System.out.println("───────────────────────────");
			String menu = s.nextLine();
			switch(menu) {
			case"1":
				System.out.println("성함을 입력하세요");
				String name = s.nextLine();
				System.out.println("주소를 입력하세요");
				String juso = s.nextLine();
				System.out.println("휴대폰 번호를 입력하세요");
				String phone = s.nextLine();
				names[count] = name;
				jusoes[count] = juso;
				phones[count] = phone;
				count++;
				break;
			case"2":
				if(count == 0) {
					System.out.println("등록된 정보가 없습니다.");
				} else {
					for(int i=0; i<count; i++) {
						System.out.printf("\t\t%s\t\t%s\t\t%s", names[i], jusoes[i], phones[i]);
					}
				}
				break;
			case"0":
				run= false;
				break;
			default:
					System.out.println("메뉴중에서 골라주세요.");
			}
		}// while
		System.out.println("....종료합니다....");
	}//method
}//class
