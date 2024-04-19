package ex03am;

import java.util.*;

public class Sub03 {
	public static void run() {
		System.out.println("\t이름\t\t국어점수\t영어점수\t수학점수\t총점\t\t평균\t\t학점");
		ArrayList<Score> scores = new ArrayList<>();
		Score s1 = new Score("유지민", 97, 93, 95);
		Score s2 = new Score("김민지", 96, 93, 95);
		Score s3 = new Score("팜하니", 91, 80, 92);
		Score s4 = new Score("김민정", 85, 81, 88);
		
		scores.add(s1);
		scores.add(s2);
		scores.add(s3);
		scores.add(s4);
		
		for(Score s:scores) {
			s.print();
		}
	}
}
