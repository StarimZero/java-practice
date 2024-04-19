package 나혼자해보기;

import java.util.Scanner;

public class Sub01 {
	public static void run() {
		boolean run = true;
		Scanner s=new Scanner(System.in);
		int[] kors = new int[100];
		int[] engs = new int[100];
		int[] mats = new int[100];
		int count=0;
		while(run) {
			System.out.println("1. 성적입력하기 | 2. 성적 확인하기 | 0. 종료하기");
			
			String menu = s.nextLine();
			switch(menu) {
			case"1":
				while(run){
				System.out.println("국어점수를 입력하세요.");
				String kor = s.nextLine();
				if(kor == "") {
					System.out.println("입력을 종료합니다.");
					break;
				}
				System.out.println("영어점수를 입력하세요.");
				String eng = s.nextLine();
				if(eng =="") {
					System.out.println("입력을 종료합니다.");
					break;
				}
				System.out.println("수학점수를 입력하세요.");
				String mat = s.nextLine();
				if(mat == "") {
					System.out.println("입력을 종료합니다.");
					break;
				}
				kors[count] = Integer.parseInt(kor);
				engs[count] = Integer.parseInt(eng);
				mats[count] = Integer.parseInt(mat);
				count++;
				}
			case"2":
				for(int i = 0; i<count; i++) {
					double tot = kors[i] + engs[i] + mats[i];
					double avg = tot/3.;
				System.out.printf("\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f", kors[i], engs[i], mats[i], tot, avg);
				}
				break;
			case"0":
				System.out.println("...종료합니다...");
				break;
			default:
					System.out.println("012중에 고르세요");
			}//switch
		}//while
	}//method
}//class
