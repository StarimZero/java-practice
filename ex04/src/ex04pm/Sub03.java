package ex04pm;

import java.io.*;
import java.util.*;

import ex04am.Juso.*;



public class Sub03 {
	static Scanner scan = new Scanner(System.in);
	public static void read() {
		File file = new File("C:\\Users\\KOSMO\\Desktop\\java\\juso.txt");
		System.out.println("\t\t주소 조회를 선택하셨습니다.");
		boolean find=false;
		while(true) {
			System.out.print("\t\t조회할 이름이나 전화번호를 입력하세요.");
			String sname=scan.nextLine();
			
			if(sname =="") {
				System.out.print("\t\t검색을 취소합니다.");
				break;
			}//if
			
			try {
					BufferedReader reader = new BufferedReader(new FileReader(file));
					String line ="";
					String[] items = new String[4];
				
					while((line=reader.readLine()) != null) {
						items = line.split(",");
						if(sname.equals(items[1]) || sname.equals(items[0])) {
							System.out.println("\t\t 번호 : " + items[0]);
							System.out.println("\t\t 이름 : " + items[1]);
							System.out.println("\t\t 주소 : " + items[2]);
							System.out.println("\t\t 전화번호 : " + items[3]);
							find = true;
						}//if
					}//while
					
					if(!find)  System.out.print("\t\t검색하신 이름과 전화번호는 존재 하지 않습니다.\n");
					System.out.println("\t\t──────────────────────");
			} catch (Exception e) {
					System.out.println("오류:" + e.toString());
			}//try catch
		}//while
	}//read
}//class

		

			
			
			
			
			
//			if(sname =="") {
//				System.out.print("\t\t검색을 취소합니다.");
//				break;
//			}//if
//			boolean find=false;
//			for(Juso j:jusoes) {
//				if(sname.equals(j.getName()) || sname.equals(j.getPhone())) {
//					System.out.println("\t\t이름 :" + j.getName());
//					System.out.println("\t\t주소 :" + j.getAddress());
//					System.out.println("\t\t전화번호 :" + j.getPhone());
//					find=true;//찾았을경우 find를 true로 바꿔주는거임
//				}//if
//			}//for
//			if(!find) System.out.print("\t\t검색하신 이름과 전화번호는 존재 하지 않습니다.\n");
//			System.out.println("\t\t──────────────────────");
//		}//while
//		break;
//		
		
		
		
		




