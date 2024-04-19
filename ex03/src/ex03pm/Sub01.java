package ex03pm;

import java.util.*;

import ex03am.Student;

public class Sub01 { 
	public static void run() { //static의 역할 = 객체를 만들지 않고도 실행할 수 있다. (메인에서 sub01 sub=new sub01(); ->객체를 만들고 sub.run(); 해야함.
		//public <-> private => private를 쓰면 이 class내에서만 쓸 수 있다. private 쓰면 main에서 오류날것. 아무것도 없으면 같은 패키지에서만 사용가능.
			boolean run = true;
			Scanner scan = new Scanner(System.in);
			ArrayList<Sale> sales = new ArrayList<>(); //처음<sale>은 class이름이다.
			Sale s1 = new Sale(); //기본생성자로 생성하기. 
			s1.code = "100";
			s1.name = "냉장고";
			s1.price = 3500000;
			s1.qnt = 15;
			
			sales.add(s1);
			
			Sale s2 = new Sale("101", "세탁기", 2700000, 25); // 생성자2로 생성해보기.
			sales.add(s2);
			
			
			while(run) {
				System.out.println("\n┌────────────────────────────────────────────────────┐");
				System.out.println("\t\t\t\t 1.매출등록 | 2. 매출목록 | 3. 상품검색 | 4. 매출삭제 | 0. 종료");
				System.out.println("└────────────────────────────────────────────────────┘");
				System.out.print("\t\t선택하세요. ");
				String menu = scan.nextLine();
				switch(menu) {
				case "1":
					Sale s3 = new Sale();
					Sale last=sales.get(sales.size()-1);
					int code = Integer.parseInt(last.code) + 1; // String -> int
					s3.code = code + ""; //int -> String Why? 문자열더하면 그냥 문자열이된다/////다른방법 =>  String.valueof(code)라고 써도된다.
					System.out.println("\t\t상품 코드을 입력하십시오." + s3.code);
//					s3.code = scan.nextLine();  => 입력받을때 
					System.out.print("\t\t상품 이름을 입력하십시오.");
					s3.name = scan.nextLine();
					if(s3.name=="") break;
					while(true) {
						System.out.print("\t\t상품 가격을 입력하십시오.");
						String price = scan.nextLine();
						if(checkNumber(price)) {
							s3.price=Integer.parseInt(price);
							break;
						}//if
					}//while
//					s3.price = Integer.parseInt(scan.nextLine());
					while(true) {
						System.out.print("\t\t판매 수량을 입력하십시오.");
						String qnt = scan.nextLine();
						if(checkNumber(qnt)) {
							s3.qnt=Integer.parseInt(qnt);
							break;
						}//if
					}//while
//					s3.qnt = Integer.parseInt(scan.nextLine());
					sales.add(s3);
					System.out.println("\t\t상품등록 완료!");
					break;
				case "2":
					System.out.println("\t\tcode\t\t상품이름\t\t상품가격\t\t\t판매대수\t\t총판매액");
					int totVol = 0;
					int totQnt = 0;
					for(Sale s:sales) {
						s.print_land();
						totVol = totVol + s.vol();
						totQnt = totQnt + s.qnt;
					}
					System.out.println("\t\t" + sales.size() + "개의 상품이 존재합니다.");
					System.out.printf("\t\t총 매출액은 %,d원입니다.\n", totVol);
					System.out.printf("\t\t총 판매대수는 %,d개 입니다.", totQnt);
					
					break;
				case "3":
					while(true) {
						System.out.print("\t\t조회할 상품명이나 코드를 입력하세요.");
						String sname=scan.nextLine();
						if(sname =="") {
							System.out.print("\t\t상품검색을 취소합니다.");
							break;
						}
						boolean find=false;
						for(Sale s:sales) {
							if(s.name.equals(sname) || s.code.equals(sname)) {
								s.print_port();
								find=true;//찾았을경우 find를 true로 바꿔주는거임
							}
						}//for
						if(!find) System.out.print("\t\t검색하신 상품은 존재 하지 않습니다.\n");
						System.out.println("\t\t──────────────────────");
					}//while

					break;
				case"4":
					System.out.print("\t\t삭제할 상품명이나 코드를 입력하세요.");
					String sname=scan.nextLine();
					boolean find=false;
					for(Sale s:sales) {
						if(s.name.equals(sname) || s.code.equals(sname)) {
							s.print_port();
							System.out.print("\t\t정말 삭제하시겠습니까?(Y/y)");
							String ans = scan.nextLine();
							if(ans.equals("Y") || ans.equals("y")) {
								sales.remove(s);
								System.out.println("\t\t삭제 되었습니다.");
								break;
							} else {
								System.out.println("\t\t삭제 취소 되었습니다.");
							}
							find=true;//찾았을경우 find를 true로 바꿔주는거임
						}
					}//for

					System.out.println("\t\t──────────────────────");
					break;
				case "0":
					run=false;
					break;
				default:
					System.out.println("\t\t.... 메뉴중에서 선택하세요.....");
				}//switch
			}//while
				System.out.println("\t\t....종료합니다....");
	}//method
	//숫자인지 아닌지 판별하는 Method
	public static boolean checkNumber(String str) { // 문자로 입력받아서 숫자로변경하는데 try해서 맞으면 true리턴 안되면 catch - false로간다. 
		try {
			int num=Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("\t\t숫자를 입력하세요.");
			return false;
		} // catch
	} // method
	
}//class
