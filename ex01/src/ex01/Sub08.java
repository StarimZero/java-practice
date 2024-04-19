package ex01;

public class Sub08 {
	public static void run() {
//		int[] scores=new int[] {90, 80, 75, 77};
//		for(int i=0; i<scores.length; i=i+1);{
//			System.out.println(scores[i]);
//		}
		 // 학생 정보 배열
	    int[] no = new int[] { 1, 2, 3 };
	    String[] name = new String[] { "홍길동", "심청이", "강감찬" };
	    String[] juso = new String[] { "인천", "서울", "대구" };
//	    for (int i = 0; i < no.length; i++) {
//		      System.out.println(no[i] + "\t" + name[i] + "\t" + juso[i]);
//		      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		    }
	    // 성적 정보 배열
	    int[] kor = new int[] { 80, 90, 99 };
	    int[] eng = new int[] { 62, 77, 78 };
	    int[] mat = new int[] { 88, 87, 94 };
	    System.out.println("번호\t\t이름\t\t지역\t\t총점\t\t평균\t\t학점");

	    // 성적 정보 출력
	    for (int i = 0; i < no.length; i++) {
	      int tot = kor[i] + eng[i] + mat[i];
	      double avg = tot / 3.;
	      String grade="";
	      if(avg>=90) {
	    	  if(avg>=95) {
	    		  grade = "A+";
	    	  }else {
	    		  grade = "A0";
	    	  }
	      }else if(avg>=80) {
	    	  if(avg>=85) {
	    		  grade = "B+";
	    	  }else {
	    		  grade = "B0";
	    	  }
	      }else if(avg>= 70) {
	    	  if(avg>=75) {
	    		  grade = "C+";
	    	  }else {
	    		  grade = "C";
	    	  }
	      }else {
	    	  grade = "D";
	      }
	      //System.out.println(no[i] + "\t" + name[i] + "\t" + tot + "\t" + avg);

	      System.out.printf("%d\t\t%s\t%s\t\t%d\t\t%.2f\t%s\n", no[i], name[i], juso[i], tot, avg, grade); //%d = 정수형데이터 , %s = 문자열 데이터, %d = 정수형데이터, %.3f = 실수형 소수3자까지
//	      System.out.println(""); 이렇게 써도 뒤에 \n과 같다.
	    }
	  }
	}
