package ex01;

public class Sub06 {
	public static void run() {
		//반복문 (for, while)
		int sum = 0;
		for (int i = 1; i <= 100; i++) { // 1씩 증가해서 i에 저장
			//System.out.println(i); 
			sum = sum + i ; //sum 은 sum 더하기 i 를 100번반복 = i에대한 합계를 sum에 저장
//			System.out.println(sum); ==>> 더한값이 한번씩 계속 나옴.
		}
		System.out.println("1부터 100까지의 합계 = " + sum);
		
		sum = 0;
		for (int i = 1; i<=100; i+=2) { //i = i+2로 써도된다.
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 홀수 합계 = " + sum);
		
		sum = 0;
		for (int i = 0; i<=100; i+=2) { 
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 짝수 합계 = " + sum);
		
		int i = 1; // (for문에 int를 선언해서 다시 선언 할 수 있다.)
		sum = 0;
		while(i<=100) { //while은 조건만 쓴다. while = ~동안에 
			sum = sum + i;
			i = i+1;
		}
		System.out.println("w1부터 100까지의 합계 = " + sum);
		
		i = 1;
		sum = 0;
		while(i <= 100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("w1부터 100까지의 홀수 합계 = " + sum);
		
		i = 0;
		sum = 0;
		while( i <= 100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("w1부터 100까지의 짝수 합계 = " + sum);
	}
}



