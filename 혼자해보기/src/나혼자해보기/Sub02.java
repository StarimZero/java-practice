package 나혼자해보기;

import java.util.ArrayList;

public class Sub02 {
	public static void run() {
		System.out.println("\t\t작업자\t\t유닛당수당\t\t작업유닛\t\t작업량\t\t총수당\t\t\t수당비효율\t\t등급");
		ArrayList<Pay> payeff=new ArrayList<>();
		
		Pay p1 = new Pay("유지민", 10000, 10, 10);
		Pay p2 = new Pay("김민정", 20000, 20, 30);
		Pay p3 = new Pay("팜하니", 15000, 15, 20);
		Pay p4 = new Pay("김민지", 10000, 9, 5);
		
		
		payeff.add(p1);
		payeff.add(p2);
		payeff.add(p3);
		payeff.add(p4);
		
		
		for(Pay p:payeff) {
			p.print();
		}
		
	} //method
} //class
