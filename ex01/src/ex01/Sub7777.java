package ex01;

public class Sub7777 {
	public static void run() {
		double workTime = 10;
		double work = 80;
		double perPay = 70000;
		double pay = workTime * perPay ;
		double eff = (work/pay) * 100;
		String grade = "";
		String name = "제임스";
		System.out.println("급여는 " + (int)workTime*(int)perPay + "원입니다.");
		System.out.println(name + "님의 일의 효율은" + eff + "%입니다." );
		if(eff > 0.030) {
			if(eff>0.035) {
				grade = "최우수";
			} else {
				grade = "우수";
			}
		} 
		else if(eff > 0.020) {
			if(eff > 0.025) {
				grade = "중상";
			}else if(eff > 0.023) {
				grade = "중중";
			}else {
				grade = "중하";
			}
		}
		else if(eff > 0.010) {
			if(eff > 0.015) {
				grade = "하상";
			}else if (eff > 0.013) {
				grade = "하중";
			}else {
				grade = "하하";
			}
		}
		else {
			grade = "등외";
		}
		System.out.println(name + "님의 일 효율은 " + grade + " 입니다.");
	}
}
