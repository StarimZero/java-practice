package ex01;

public class Sub03 {
	public static void run() {
		//정수타입(소수점없는수) java는 다 설정해줘야한다.
		int num0 = 10;
		int num1 = 10; //변수이름은 소문자로시작한다. 10.5로하면 오류다.
		
		
		//실수타입(float, double 2개있따. 32비트,64비트)
		float num2 = 10.5313212412341f; //10.5하면 안된다. float과 double은 유효숫자가 다르다. float 는 7자리 double은 15자리
		double num3 = 10.7131234124124123123431244; // double은 그냥 쓰면된다.
		double num4 = 18.283;
		float num5 = 13.5980f;
		
		System.out.println("num1 = " + num1); //+는 연결임.
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		//문자타입 (char은 한글자만 ''안에 한글자만,  String은 여러글자 ""  여기서는 대문자다)
		char str1 = 'A';
		String str2 = "제임스";
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		//논리타입 (boolean) 값은 소문자로만 해야한다. 변수설정후 사용안하면 노란색 밑줄이다.
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		//형변환(정수를 -> 실수로) 위에서 타입을 선언해놓았기 때문에 또선언하면 오류가난다. 실수가크니까 정수를 담을수 있다.
		num2 = num1;
		System.out.println(num2);
		num3 = num1;
		System.out.println(num3);
		//강제 형변환(실수 -> 정수 ) // 큰걸 작은거에 넣을 수 없지만 강제로는가능하다.
		num0 = (int)num4;
		System.out.println(num0);
		num0 = (int)num5;
		System.out.println(num0);
	}
}
