package ex01;

import java.util.Scanner;

public class Sub07 {
	public static void run() {
		Scanner s=new Scanner(System.in); // new: 생성자 = 스캐너를 생성하겠다.(system.in인) 그걸 s에 저장 => 그럼 스캐너이름이 s이다. class= 붕어빵틀  s는 붕어빵, class는 붕어빵틀  scanner는 내장이라 import를 해야함. jre라이브러리에 있다.
		boolean run = true;
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1 : 1부터 100까지의 홀수의 합 | 2: 1부터 100까지의 짝수의 합 | 3: 1부터 100까지의 전체합 | 0 : 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택? ");
			String menu=s.nextLine(); // s.메소드();  nextLine은 string임.->그래서 string으로 설정 int는 nextint는 int,// 만약 문자가들어오면 오류나니까 그냥 string으로 받음 이걸 menu에 저장 -> 
			switch(menu) {
			case "1": //메뉴에 들어있는건 string 이니까 ""에 넣어줌
				int sum = 0;
				for(int i = 1; i<=100; i+=2) {
					sum = sum + i;
				}
				System.out.println(sum);
				break;
			case "2":
				sum = 0;
				for(int i = 0; i<=100; i+=2) {
					sum = sum + i;
				}
				System.out.println(sum);
				break;
			case "3":
				sum = 0;
				for(int i =1; i<=100; i++) {
					sum = sum + i;
				}
				System.out.println(sum);
				break;
			case "0":
				System.out.println("종료합니다.");
				run = false;
				break;
				default:
					System.out.println("0부터 3까지 입력해주세요");
				break;
			}//switch
		}//while
	}//method
}//class