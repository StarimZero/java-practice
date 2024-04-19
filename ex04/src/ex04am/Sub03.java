package ex04am;

import java.util.*;


public class Sub03 {
	public static void run() {
				boolean run = true;
				Scanner scan = new Scanner(System.in);
				ArrayList<Car> cars = new ArrayList<>(); // <>안에는 클래스네임이다.
				Car car = new Car("1", "현대", "그랜저", "검정", 34820, "2022-07");
				cars.add(car);
				car = new Car("2", "현대", "소나타", "흰색", 88573, "2021-05");
				cars.add(car);
				car = new Car("3", "기아", "스팅어", "빨강", 36505, "2018-01");
				cars.add(car);
				car = new Car("4", "제네", "GV80", "초록", 130870, "2020-03");
				cars.add(car);

				while(run) {
					System.out.println("\n┌────────────────────────────────────────────────────┐");
					System.out.println("\t\t\t\t\t1.차량등록 | 2. 차량목록 | 3. 차량조회 | 4. 차량삭제 | 0. 종료");
					System.out.println("└────────────────────────────────────────────────────┘");
					System.out.print("\t\t선택하세요. ");
					String menu = scan.nextLine();  //nextLine  Scanner는 클래스다 = nextLine은 메소드다 
					switch(menu) {
					case "1":
						car=new Car();
						Car last = cars.get(cars.size()-1);
						int next = Integer.parseInt(last.getNo()) + 1; // String -> int
						car.setNo(Integer.toString(next));
						System.out.println("\t\t관리번호를 입력하세요." + car.getNo());
//						String no = scan.nextLine();
//						car.setNo(no);
						System.out.print("\t\t차종을 입력하세요");
						String model = scan.nextLine();
						car.setModel(model);
						System.out.print("\t\t제조회사를 입력하세요.");
						String company = scan.nextLine();
						car.setCompany(company);
						System.out.print("\t\t색깔을 입력하세요.");
						String color = scan.nextLine();
						car.setColor(color);
						while(true) {
							System.out.print("\t\t주행거리를 입력하세요.");
							String distance = scan.nextLine();
							if(checkNumber(distance)) {
								car.setDistance(Integer.parseInt(distance));
								break;
							}//if
						}//while
//						System.out.print("\t\t주행거리를 입력하세요");
//						String distance = scan.nextLine();
//						car.setDistance(Integer.parseInt(distance));
						System.out.print("\t\t연식을 입력하세요");
						String date = scan.nextLine();
						car.setDate(date);
						cars.add(car);
						System.out.println("\t\t등록 되었습니다.");
						System.out.println("\t\t" + car.toString() + "\n" + "\t\t등록완료");
						System.out.println("\t\t등록된 데이터는 " + cars.size() + "개 입니다.");
						break;
					case "2":
						System.out.println("\t\t관리번호\t\t차종\t\t제조회사\t\t색깔\t\t주행거리\t\t연식");
						for(Car c:cars) {
							System.out.printf("\t\t%s\t\t\t%s\t%s\t\t\t%s\t\t%,d\t\t%s\n", c.getNo(), c.getModel(), c.getCompany(), c.getColor(), c.getDistance(), c.getDate());
						}//for
						System.out.println("\t\t등록된 데이터 개수는 " + cars.size() + "개 입니다.");
						break;
					case "3":
						while(true) {
							System.out.print("\t\t조회할 이름이나 번호를 입력하세요.");
							String sname=scan.nextLine();
							if(sname =="") {
								System.out.print("\t\t검색을 취소합니다.");
								break;
							}//if
							boolean find=false;
							for(Car c:cars) {
								if(sname.equals(c.getNo()) || sname.equals(c.getModel())) {
									System.out.println("\t\t관리번호 :" + c.getNo());
									System.out.println("\t\t차종 :" + c.getModel());
									System.out.println("\t\t색깔 :" + c.getColor());
									System.out.println("\t\t주행거리 :" + c.getDistance());
									System.out.println("\t\t연식 :" + c.getDate());
									find=true;//찾았을경우 find를 true로 바꿔주는거임
								}//if
							}//for
							if(!find) System.out.print("\t\t검색하신 이름과 전화번호는 존재 하지 않습니다.\n");
							System.out.println("\t\t──────────────────────");
						}//while
						break;
					case "4":
						System.out.print("\t\t삭제할 차종이나 관리번호를 입력하세요.");
						String sname=scan.nextLine();
						boolean find=false;
						for(Car c:cars) {
							if(sname.equals(c.getModel()) || sname.equals(c.getNo())) {
								find=true;//찾았을경우 find를 true로 바꿔주는거임
								System.out.print("\t\t정말 삭제하시겠습니까?(Y/y)");
								String ans = scan.nextLine();
								if(ans.equals("Y") || ans.equals("y")) {
									cars.remove(c);
									System.out.println("\t\t삭제 되었습니다.");
									break;
								} else {
									System.out.println("\t\t삭제 취소 되었습니다.");
									break;
								}//else
							}//if
						}//for
						if(!find) System.out.print("\t\t검색하신 차종과 관리번호는 존재 하지 않습니다.\n");
						System.out.println("\t\t──────────────────────");
						break;
					case "0":
						System.out.println("\t\t....종료합니다....");
						run=false;
						break;
					default:
						System.out.println("\t\t메뉴에서 선택하세요..");
					}//switch
				}//while
			}//method

	private static boolean checkNumber(int distance) {

		return false;
	}
	public static boolean checkNumber(String str) { // 문자로 입력받아서 숫자로변경하는데 try해서 맞으면 true리턴 안되면 catch - false로간다. 
		try {
			int num=Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("\t\t!!!!숫자를 입력하세요.");
			return false;
		} // catch
	} // method
		}	//class
