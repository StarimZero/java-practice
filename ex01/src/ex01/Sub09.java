package ex01;

import java.util.Scanner;

public class Sub09 {
	public static void run() {
		boolean run=true;
		Scanner s=new Scanner(System.in);
		String[] name = new String[100]; // 배열을 일단 만들어준다.
		String[] juso = new String[100];
		String[] phone = new String[100];
		name[0] = "홍길동";
		juso[0] = "인천 송도";
		phone[0] = "010-0000-0000";
		name[1] = "김경서";
		juso[1] = "부천 심곡";
		phone[1] = "010-1111-1111";
		int count=2;  //
		
		while(run) {
			System.out.println("\n\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 주소등록 | 2.주소출력 | 0.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 > ");
			String menu=s.nextLine();
			switch(menu) {
			case "1" :
				System.out.println("이름을 입력하세요.");
				String name1=s.nextLine();
				System.out.println("주소를 입력하세요.");
				String juso1=s.nextLine();
				System.out.println("전화번호를 입력하세요");
				String phone1=s.nextLine();
				name[count]=name1;
				juso[count]=juso1;
				phone[count]=phone1;
				count = count+1;
				System.out.println("※등록되었습니다※");
				break;
			case "2" :
				System.out.println("이름\t\t\t주소\t\t\t전화번호");
				for(int i = 0; i<count; i++) {
				System.out.printf("%s\t\t%s\t\t%s\t\t\n", name[i], juso[i], phone[i]);
				}
				break;
			case "0":
				System.out.println("...종료합니다...");
				run=false;
				break;
			default:
				System.out.println("0부터 2까지를 선택해주세요.");
			}//switch
		}//while
	}//method
}//class
