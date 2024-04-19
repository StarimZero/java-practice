package ex01;

import java.util.Scanner;

public class Sub10 {
	public static void run() {
		boolean run=true;
		Scanner s=new Scanner(System.in);
		String[] name = new String[100];
		int[] price = new int[100];
		int[] qnt = new int[100];
		int count = 0;
		
		while(run) { 
			System.out.println("\n\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("\t1. 매출등록 | 2. 매출현황 | 0. 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("번호를 입력하세요");
			String menu=s.nextLine();
			switch(menu) {
			case "1":
				System.out.println("상품명 ");
				String name1=s.nextLine();
				name[count]=name1;
				System.out.println("단가 ");
				int price1=Integer.parseInt(s.nextLine());
				price[count]=price1;
				System.out.println("수량 ");
				int qnt1=Integer.parseInt(s.nextLine());
				qnt[count]=qnt1;
				System.out.println("★등록되었습니다★");
				count++;
				break;
			case "2":
				if(count == 0) {
					System.out.println("★등록된 상품이 없습니다★");
				} else {
						System.out.println("상풍명\t단가\t\t수량\t\t총매출액");
					for(int i=0; i<count; i++) {
						int sum = price[i] * qnt[i];
						System.out.printf("%s\t\t%,d원\t%d개\t\t%,d원", name[i], price[i], qnt[i], sum);
						System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					}
				}
				break;
			case "0":
				run=false;
				System.out.println("... 종료합니다 ...");
				break;
			default:
				System.out.println("0,1,2중에서 선택하세요");
					
			}
			
			
			
			
			
		}//while
	}//method
}//class
