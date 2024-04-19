package ex04pm;

import java.util.Scanner;

public class Main {

//	public static void main(String[] args) {
//		System.out.println("\t\tJAVA....0412pm");
//		Sub02.run();
////		Sub02.insert();
//	}

		public static void main(String[] args) {
			boolean run=true;
			Scanner scan = new Scanner(System.in);
			while(run) {
				System.out.println("\n┌────────────────────────────────────────────────────┐");
				System.out.println("\t\t\t\t\t1.주소등록 | 2. 주소목록 | 3. 주소조회 | 4. 주소삭제 | 0. 종료");
				System.out.println("└────────────────────────────────────────────────────┘");
				System.out.print("\t\t선택하세요. ");
				String menu = scan.nextLine();  //nextLine  Scanner는 클래스다 = nextLine은 메소드다 
				switch(menu) {
				case "1":
					Sub02.insert();
					break;
				case "2":
					Sub02.run();
					break;
				case "3":
					Sub03.read();
					break;
				case "4":
					break;
				case "0":
					System.out.println("\t\t....종료합니다....");
					run=false;
					break;
					default:
						System.out.println("\t\t메뉴에서 선택하세요..");
				}
				
				
			}//while
		}//method
	}//class
