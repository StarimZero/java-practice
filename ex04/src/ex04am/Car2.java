package ex04am;

import java.util.*;

public class Car2 { //자바빈이라고 한다.
	//필드 (속성)
	String company;
	private String model;
	String color;
	int distance;
	private String date;

	//생성자 기본생성자( 생성자1은 매개변수가없는데 생성자2에는 매개변수를 써서 ,,, 매개변수가 틀리면 같은 변수로 쓸수있다 = 오버로딩)
	public Car2() { 
	}
	
	public Car2(String company, String model, String color, int distance) { //생성자2 source - generate constructor using fields
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.distance = distance;
	}//생성자2
	
	
	//게터, 세터 메소드
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	//게터, 세터 메소드
	
	
	@Override //객체에 어떤 값이 들어있는지 한꺼번에 출력해보는것. source - generate To string
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", distance=" + distance
				+ ", date=" + date + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	// method
	public void print_land() {
		System.out.printf("\t\t회사명 : %s\t 모델명 : %s\t 색깔 : %s\t 주행거리 : %,d\t 연식 : %s\n", company, model, color, distance, date);
	}
	
	
	
	
	
	
}//class
