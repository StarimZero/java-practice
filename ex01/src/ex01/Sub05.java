package ex01;

public class Sub05 {
	public static void run() {
		//제어문 (if, switch)
		double score = 83;
		String grade = "";
		if(score >= 90) { 								//스코어가 90이상이면 중괄호껄해라
			if(score >= 95) {
				grade = "A+";
			}	else {
				grade = "A0";
			}
		} else if(score >= 80) {
			if(score >=85) {
				grade = "B+";
			} else {
				grade = "B0";
			}
		} else if(score >= 70) {
			grade = "C+";
		} else if(score >= 60) {
			grade = "D+";
		} else {
			grade = "F";
		}
		System.out.println(score + "의 학점은 " + grade + " 입니다.");
		
		
		
		int time = 6; //왜 double은 안될까? switch자체가 정수 값을 설정한다. // 
		switch(time) {
		case 6:
			System.out.println("기상");
			break;
		case 9:
			System.out.println("출근");
			break;
		case 12:
			System.out.println("점심식사");
			break;
		case 18:
			System.out.println("퇴근");
			break;
		default:
			System.out.println("...............");
		}
	}
}
