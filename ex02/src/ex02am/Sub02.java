package ex02am;

import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println("매출현황");
		boolean run=true;
		String[] names = new String[100];
		int[] prices = new int[100];
		int[] qnts = new int[100];
		names[0] = "냉장고"; prices[0] = 3500000; qnts[0] = 3;
		names[1] = "세탁기"; prices[1] = 2500000; qnts[1] = 6;
		int count = 2;
		while(run) {
			System.out.println("\n┌─────────────────────────────┐");
			System.out.println("\t\t\t1. 매출등록 | 2. 매출현황 | 0.종료");
			System.out.println("└─────────────────────────────┘");
			System.out.println("★메뉴를 선택하세요. ");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				System.out.println("\t상품명을 입력하세요.");
				String name=scan.nextLine();
				System.out.println("\t가격을 입력하세요.");
				String price=scan.nextLine();
				System.out.println("\t판매수량을 입력하세요.");
				String qnt=scan.nextLine();
				names[count]=name; 
				prices[count]=Integer.parseInt(price);
				qnts[count]=Integer.parseInt(qnt);
				System.out.println("★상품이 등록되었습니다.");
				count = count+1; // ++은 안넘어감.
				break;
			case "2":
				System.out.println("\t상품이름\t\t가격\t\t\t\t대수\t\t총판매액");
				int totS=0;
				int totQ=0;
				for(int i=0; i<count; i++) {
					int sum = prices[i] * qnts[i];
					System.out.printf("\t%s\t\t%,d원\t\t%,d대\t\t%,d원\n", names[i], prices[i], qnts[i], sum );
					totS = totS + sum; // sum을 다합쳐서 tot에 넣어라.
					totQ = totQ + qnts[i];
				}
				System.out.println("───────────────────────────────");
				System.out.printf("\t총 매출액은 %,d원 입니다.\n", totS);
				System.out.printf("\t총 판매대수는 %,d대 입니다.\n", totQ);
				System.out.println("───────────────────────────────");
				System.out.println("\t등록 개수는 " + count + "개 입니다.");
				break;
			case "0":
				run=false;
				break;
			default:
				System.out.println("★0, 1, 2를 선택하세요.");
			}//switch
		}//while false이후 빠져나오는곳1
		System.out.println("....종료합니다....");
	}//method
}//class
