package ex04am;

import java.util.*;

public class Sub01 {
	public static void run() { //run은 출력하는 메소드를 만들어놓은거다.
//		System.out.println("첫번째 프로그램입니다.");
		ArrayList<Car2> cars = new ArrayList<>();
		
//		Car c1 = new Car() ; //기본생성자랑 똑같이 써야지
//		c1.company = "현대";
//		c1.model = "그랜저";
//		c1.color = "검정";
//		c1.distance = 23897;
//		c1.date = "2022-05";
////		c1.print_land();
//		cars.add(c1);
//		
//		c1 = new Car();
//		c1.company = "기아";
//		c1.model = "K3";
//		c1.color = "흰색";
//		c1.distance = 30414;
//		c1.date = "2018-02";
//		c1.model = "엥"; //데이타를 쉽게 바꿀수가있다... => 그럴러면 class에 private를 해주면되지않을까? 그렇게되면 여기서 설정 불가
////		c1.print_land();
//		cars.add(c1);
		
		Car2 c1 = new Car2("BMW", "i5", "카본", 69434); // 이렇게만 써야 pravate를 뚫고 생성가능  -> 연식은 어케바꿀건데 => Car에서 get, setting 을 만들어서 .... 값을 넣어주는것은  set으로 가자 = 세터로 변경가능 = 캡슐화 = 자바빈이라고 한다.
		c1.setColor("흰색"); // Car Class에 있는 세터로 색깔을 바꾼거다.
		c1.setDistance(84567);
		c1.setDate("2019-06");
		cars.add(c1);
		
		for(Car2 car:cars) {//for (class 변수 : 어레이이름
			car.print_land(); // 변수.print
			System.out.println("\t\t" + car.toString()); 
			System.out.printf("\t\t%s\t\t%s\t\t%s\t\t%,dkm\t\t%s\n", car.getCompany(), car.getModel(), car.getColor(), car.getDistance(), car.getDate()); //d는 decimal이다.
		}
	}//method
}//class
