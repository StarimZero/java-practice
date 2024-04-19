package 나혼자해보기;

public class Pay {
	String name;
	int pay;
	int time;
	int work;
	
	public Pay(String name, int pay, int time, int work) {
		super();
		this.name = name;
		this.pay = pay;
		this.time = time;
		this.work = work;
	}
	public double perPay() {
		double perPay = pay * time; 
		return perPay;
	}
	
	public double eff() {
		double eff = work/perPay() *10000;
		return eff;
	}
	
	public String grade() {
		String grade = "최하";
		if(eff()>=0.9) {
			if(eff()>=0.95) {
				grade = "최상";
			}else {
				grade = "상급";
			}
		}else if(eff()>=0.8) {
				if(eff()>=0.85) {
					grade = "중상급";
				} else {
					grade = "중급";
				}
		} else if (eff()>= 0.7) {
			if(eff()>=0.75) {
				grade = "하상급";
			} else {
				grade = "하급";
			}
		}
		return grade;
	}//method
	
	
	public void print() {
		
		System.out.printf("\t\t%s\t\t%d\t\t\t%d\t\t\t%d\t\t\t%.0f\t\t\t%.3f\t\t\t%s\n", name, pay, time, work, perPay(), eff(), grade());
	}
}

