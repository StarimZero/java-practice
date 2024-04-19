package ex03am;

public class Student {
	//필드 = (공통)속성이다.
	String no;
	String name;
	String juso;
	String phone;
	
	
	//생성자 기본생성자
	public Student() {
	}//생성자
	public Student(String no, String name) { //생성자2
		super(); // 생략가능(상위 객체를 생성하라는뜻?
		this.no = no; // this 는 필드속성을 뜻한다.
		this.name = name;
	}//생성자2
	public Student(String no, String name, String juso, String phone) { //생성자3
		super(); // 상위 생성자를 우선권 주기
		this.no = no;
		this.name = name;
		this.juso = juso;
		this.phone = phone;
	}
	//Method
	public void print() {
		System.out.println("\t─────────────────────────────");
		System.out.printf("\t학번 : %s\n\t이름 : %s\n\t주소 : %s\n\t전화 : %s\n", no, name, juso, phone);
	}//Method
}//class
