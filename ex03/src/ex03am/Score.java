package ex03am;

public class Score { // name, kor, eng, mat 가 필드이다.
	String name;
	int kor;
	int eng;
	int mat;
	
	public Score() { // 생성자
		
	}
	
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public double total() { //method ///// void 는 돌려줄값이 없을때 쓰는거, 그러므로 int로간다. 여기에 double을 쓰면 double을 돌려준다. 과연 double이 돌아갈까 int가 돌아갈까?-> 메소드에 쓴게 돌아가는값이다. 똑같이 맞춰준다 보통.		
		int total = kor + eng + mat; // 정의는 int로 했지만 메소드에 double을 하면 double로 돌아간다.
		return total; // total 값을 정의했으니까 리턴해라 // 정수+정수는 정수다
	}
	public double avg() {
		return (kor+eng+mat)/3.; //변수 없어도 그냥 해도된다. (.)은 float이나 double이다.
	}
	
	public void print() { // 메소드 실행은 메소드 에 적힌대로 해야한다.
		
		System.out.printf("\t%s\t%d\t\t%d\t\t%d\t\t%.2f\t%.2f\t%s\n", name, kor, eng, mat, total(), avg(), grade()); // name은 변수이고 grade는 함수이다.
	}
	public String grade() {
		String grade = "F";
		if(avg()>=90) {
			if(avg()>=95) {
				grade = "A+";
			}else {
				grade = "A0";
			}
		}else if(avg()>=80) {
				if(avg()>=85) {
					grade = "B+";
				} else {
					grade = "B0";
				}
		} else if (avg()>= 70) {
			if(avg()>=75) {
				grade = "C+";
			} else {
				grade = "C0";
			}
		}
		return grade;
	}//method
	
	
}
