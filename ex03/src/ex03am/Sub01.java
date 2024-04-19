package ex03am;


import java.util.*;

public class Sub01 {
	public static void run() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> kors=new ArrayList<>();
		ArrayList<Integer> engs=new ArrayList<>();
		ArrayList<Integer> mats=new ArrayList<>();
		
		names.add("김민지"); kors.add(99); engs.add(88); mats.add(97);
		names.add("팜하니"); kors.add(78); engs.add(87); mats.add(82);
		
		
		while(run) {
			System.out.println("\n┌────────────────────────────────────────────────────┐");
			System.out.println("\t\t1.성적등록 | 2. 성적목록 | 3. 성적조회 | 4. 성적삭제 | 0. 종료");
			System.out.println("└────────────────────────────────────────────────────┘");
			System.out.print("\t\t선택하세요. ");
			String menu = scan.nextLine();
			switch(menu) {
			case "1":
				System.out.print("\t\t이름을 입력하세요.");
				names.add(scan.nextLine());
				System.out.print("\t\t국어 점수를 입력하세요.");
				kors.add(Integer.parseInt(scan.nextLine()));
				System.out.print("\t\t영어 점수를 입력하세요.");
				engs.add(Integer.parseInt(scan.nextLine()));
				System.out.print("\t\t수학 점수를 입력하세요");
				mats.add(Integer.parseInt(scan.nextLine()));
				System.out.print("\t\t,,,,등록 되었습니다....");
				break;
			case "2":
				int sumKor = 0;
				int sumEng = 0;
				int sumMat = 0;
				System.out.println("\t\t이름\t\t국어점수\t영어점수\t수학점수\t총점수\t평균점수");
				for(int i=0; i<names.size(); i++) {
					int tot = kors.get(i) + engs.get(i) + mats.get(i);
					double avg = tot/3.;
					System.out.printf("\t\t%s\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\n", names.get(i), kors.get(i), engs.get(i), mats.get(i), tot, avg);
					sumKor = sumKor + kors.get(i);
					sumEng = sumEng + engs.get(i);
					sumMat = sumMat + mats.get(i);
				}//for
				System.out.println("\t\t현재 " + names.size() + "명이 존재합니다.");
				System.out.println("─────────────────────────────────────────────────────");
				System.out.printf("\t\t국어 평균 : %.2f\t영어 평균 : %.2f\t수학 평균 : %.2f\n", sumKor/(double)kors.size(), sumEng/(double)engs.size(), sumMat/(double)mats.size());
				break;
			case"3":
				System.out.print("\t\t확인 할 이름을 입력하세요.");
				String sname=scan.nextLine();
				boolean find = false;
				for(int i=0; i < names.size(); i++) {
					if(names.get(i).equals(sname)) {
						System.out.println("\t\t국어 : " + kors.get(i));
						System.out.println("\t\t영어 : " + engs.get(i));
						System.out.println("\t\t수학 : " + mats.get(i));
						int tot = kors.get(i) + engs.get(i) + mats.get(i);						
						System.out.println("\t\t총점 : " + tot);
						System.out.printf("\t\t평균 : %.2f\n", + tot/3.);
						find = true;
					}//if
				}//for
				if(!find) System.out.println("\t\t" + sname + "님은 등록되어 있지 않습니다.");
				break;
//			case"3": 위case와 다른점을 찾아보시오.
//				System.out.print("\t\t확인 할 이름을 입력하세요.");
//				String sname=scan.nextLine();
//				boolean find = false;
//				for(int i=0; i < names.size(); i++) {
//					if(names.get(i).equals(sname)) {
//						System.out.println("\t\t국어 : " + kors.get(i));
//						System.out.println("\t\t영어 : " + engs.get(i));
//						System.out.println("\t\t수학 : " + mats.get(i));
//						int tot = kors.get(i) + engs.get(i) + mats.get(i);						
//						System.out.println("\t\t총점 : " + tot);
//						System.out.printf("\t\t평균 : %.2f\n", + tot/3.);
//						find = true;
//					}//if
//					if(!find) {
//						System.out.println("\t\t" + sname + "님은 등록되어 있지 않습니다.");
//						break;
//					}//if
//				}//for
			case"4":
				System.out.print("\t\t삭제할 이름을 입력하세요.");
				String rname = scan.nextLine();
				find = false;
				for(int i=0; i<names.size(); i++) {
					String name=names.get(i);
					if(rname.equals(name)) {
						System.out.print("\t\t입력하신 이름은 " + rname + "입니다.\n");
						find = true;
						System.out.print("\t\t정말 삭제 하시겠습니까?(Y/y)");
						String answer = scan.nextLine();
						if(answer.equals("Y") || answer.equals("y")) {
							names.remove(i); kors.remove(i); engs.remove(i); mats.remove(i);
							System.out.println("\t\t삭제 되었습니다.");
							break;
						}else {
							System.out.println("\t\t삭제 취소되었습니다.");
						}
					}
				}
				if(!find) {
					System.out.println("\t\t" + rname + "님은 등록되어 있지 않습니다.");
					break;
				}
				break;
			case"0":
				run=false;
				break;//swithch를 빠져나오겠다.
			default:
					System.out.println("....메뉴에서 선택하세요....");
			}//switch
		}//while
		System.out.println("....종료합니다....");
	}//method
}//class
