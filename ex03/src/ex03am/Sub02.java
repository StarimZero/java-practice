package ex03am;

import java.util.*;

public class Sub02 {
	public static void run() {
//		System.out.println("\tCLASS란?");
//		System.out.println("\t───────────");
//		Student s1= new Student(); // s1이라는 학생한명이 만들어진것. //클래스 s1 = new 생성자; 생성된 객체는 s1
//		s1.no = "100";
//		s1.name = "김민지";
//		s1.juso = "인천 송도";
//		s1.phone = "010-0000-0000";
//		s1.print();
//		System.out.println("\t───────────");
//		Student s2 = new Student("101", "팜하니"); //Student 괄호안에( 생성자 2의 매개변수와 같이 설정해라.)
//		s2.juso = "서울 고덕";
//		s2.phone = "010-1111-1111";
//		s2.print();
//		System.out.println("\t───────────");
//		Student s3 = new Student("102", "유지민", "서울 화곡", "010-2222-2222"); // 생성자3으로 만든것.
//		s3.print();
//		
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("100", "유지민", "서울 화곡", "010-0000-0000"));
		students.add(new Student("101", "김민지", "인천 송도", "010-1111-1111"));
		students.add(new Student("102", "팜하니", "서울 고덕", "010-2222-2222"));
		for(Student s : students) {
			s.print();
		}
		System.out.println(" ∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬∬ ");
		for(int i=0; i<students.size(); i++) {
			Student s=students.get(i);
			s.print();
		}
		
	}//method
}
