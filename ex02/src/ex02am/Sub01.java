package ex02am;

import java.util.Scanner;

public class Sub01 {
	public static void run() {
		System.out.println("성적관리 프로그램");
		boolean run=false;
		Scanner s=new Scanner(System.in);
		String[] names=new String[100];
		int[] kors=new int[100];
		int[] engs=new int[100];
		int[] mats=new int[100];
//		int[] tots=new int[100];
//		double[] avgs=new double[100];
//		String[] grades=new String[100];
		names[0] = "유민서"; kors[0]=97; engs[0]=93; mats[0]=91; //tots[0] = kors[0] + engs[0] + mats[0]; avgs[0] = tots[0]/3;  같은라인에 해도 상관없다.
		names[1] = "이지은"; kors[1]=55; engs[1]=77; mats[1]=93; //tots[1] = kors[1] + engs[1] +mats[1]; avgs[1] = tots[1]/3;
		
		int count = 2;
		while(!run){ // while(run)뒤에 자꾸 세미콜론을 붙이는 습관이있음. 
			System.out.println("┌─────────────────────────────┐");
			System.out.println("\t\t\t1. 성적등록 | 2. 성적출력 | 0. 종료");
			System.out.println("└─────────────────────────────┘");
			System.out.print("선택? ");
			String menu=s.nextLine(); 
			switch(menu){
			case "1":
				System.out.print("이름을 입력하세요.");
				String name=s.nextLine();
				System.out.print("국어점수를 입력하세요");
				String kor=s.nextLine();
				System.out.print("영어점수를 입력하세요");
				String eng=s.nextLine();
				System.out.print("수학점수를 입력하세요");
				String mat=s.nextLine();
				names[count] = name;
				kors[count] = Integer.parseInt(kor);
				engs[count] = Integer.parseInt(eng);
				mats[count] = Integer.parseInt(mat);
				System.out.println(name + "학생이 등록되었습니다.");
				count = count+1;
				break;
			case "2":
				System.out.println("\t성명\t\t\t국어점수\t영어점수\t수학점수\t총점\t\t평균\t\t\t학점");
				int sumKor=0;int sumEng=0;  int sumMat=0;  
				for(int i = 0; i < count; i++) {
					double tots = kors[i] + engs[i] + mats[i];
					double avgs = tots/3.;
					String grade="";
					if(avgs>=90) {
						if(avgs>=95) {
							grade="A+";
						}else {
							grade="A0";
						}
					}else if(avgs>=80) {
						if(avgs>=85) {
							grade="B+";
						}else {
							grade="B0";
						}
					}else if(avgs>=70) {
						if(avgs>=75) {
							grade="C+";
						}else {
							grade="C0";
						}
					}else if(avgs>=60) {
						if(avgs>=65) {
							grade="D+";
						}else {
							grade="D0";
						}
					}else {
						grade="F";
					}
					System.out.printf("\t%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%s\n", names[i], kors[i], engs[i], mats[i], tots, avgs, grade);
					sumKor = sumKor + kors[i];
					sumEng = sumEng + engs[i];
					sumMat = sumMat + mats[i];
				}
				System.out.println("─────────────────────────");
				System.out.println("\t국어평균 \t영어평균 \t수학평균");
				System.out.printf("\t%.2f\t%.2f\t%.2f\n", sumKor/(float)count, sumEng/(float)count, sumMat/(float)count);
				System.out.println("\t" + count + "명의 학생이 존재합니다.");
				break;
			case "0":
				run=true;
				System.out.println("....종료합니다....");
				break;
			default:
				System.out.println("★ 1, 2, 0 중에서 선택하세요.");
			}//switch
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//method
}//class
