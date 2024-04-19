package ex02pm;

import java.util.*;

public class Sub02 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>(); // Interger만 된다.
		while(true) {
			System.out.println("숫자를 입력하세요");
			String num=scan.nextLine();
			if(num=="") {
				System.out.println("입력을 종료합니다.");
				break;
			} else{
				nums.add(Integer.parseInt(num));
			}//if
		}//while
		System.out.printf("현재 바구니에 들어있는 데이터 개수는 " + nums.size() +"개 입니다.\n");
		int sum = 0;
		for(int i=0; i<nums.size(); i++) {
			sum = sum + nums.get(i);
		}
		System.out.printf("현재 바구니의 내용물은" + nums + "입니다.\n");
		System.out.printf("바구니의 합계는 " + sum + " 입니다.\n");
		System.out.printf("바구니의 평균은 " + sum/(double)nums.size() + " 입니다.\n");
		
	}//method
}//class
