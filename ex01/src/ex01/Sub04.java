package ex01;

public class Sub04 {
	public static void run(){
		//산술연산자 
		int num1 = 77;
		int num2 = 3;
		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + sum);
		int sub = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + sub);
		int mul = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + mul);
		double div = num1 / (double)num2; //정수나누기 정수하면 정수가된다... 그렇다면 둘중하나만 강제형변환해서 하면 가능  float과 double를 혼용하면 에러남. 
		System.out.println(num1 + "/" + num2 + "=" + div);
		
		//관계연산자(비교연산자)
		boolean result = num1 > num2;
		System.out.println(num1 + "이 " + num2 +  "보다 큽니까? " + result);
		result = num1 < num2;
		System.out.println(num1 + "이 " + num2 + "보다 작습니까? " + result);
		result = num1 == num2;
		System.out.println(num1 + "이 " + num2 + "과 같습니까?  " + result);
		result = num1 != num2;
		System.out.println(num1 + "이 " + num2 + "과 다릅니까? " + result);
		
		//논리연산자(and, or, not)
		boolean bool1 = true;
		boolean bool2 = false;
		result = bool1 && bool2;
		System.out.println(result);
		result = bool1 || bool2;
		System.out.println(result);
		result = bool1 && !bool2;
		System.out.println(result);
		result = !bool1 || bool2;
		System.out.println(result);
		result = !bool2;
		System.out.println(result);
	}
}
