package ex04pm;

import java.io.*;
import java.util.*;
import ex04am.Juso;

public class Sub02 {
	public static void run() {
		File file = new File("C:\\Users\\KOSMO\\Desktop\\java\\juso.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			System.out.println("\t\t파일을 읽어오는중......\n");
			String line = "";
			String[] items =  new String[4];
			while((line = reader.readLine()) != null) {
				items = line.split(",");
				Juso juso = new Juso();
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setPhone(items[3]);
				juso.setAddress(items[2]);
				System.out.println("\t\t번호 : " + juso.getNo());
				System.out.println("\t\t이름 : " + juso.getName());
				System.out.println("\t\t주소 : " + juso.getAddress());
				System.out.println("\t\t전화번호 : " + juso.getPhone());
				System.out.println("\t\t────────────────");
			}
		}catch(Exception e){
			System.out.println("오류 - " + e.toString());
		}//try catch
	}// method1
	
	public static void insert() {
		System.out.println("\t\t──────주소등록───────");
		File file = new File("C:\\Users\\KOSMO\\Desktop\\java\\juso.txt");
		Scanner scan = new Scanner(System.in);
		try {
			FileWriter writer = new FileWriter(file, true);
			Juso juso = new Juso();
			System.out.print("\t\t번호를 입력하세요.");
			juso.setNo(Integer.parseInt(scan.nextLine()));
			System.out.print("\t\t이름을 입력하세요");
			juso.setName(scan.nextLine());
			System.out.print("\t\t주소를 입력하세요");
			juso.setAddress(scan.nextLine());
			System.out.print("\t\t전화번호를  입력하세요");
			juso.setPhone(scan.nextLine());
			writer.write(juso.getNo() + "," + juso.getName() + "," + juso.getAddress() + "," + juso.getPhone() + "\n"); // 메모장에 저장이 다음줄에서 저장이끝나야해서다음줄로  넘겨줘야함 
			writer.flush();
			writer.close();
			System.out.println("\t\t등록이 완료되었습니다.");
			
		} catch (IOException e) {
			System.out.println("\t\t오류 -");
			e.printStackTrace();
		} // true는 기존데이터 밑으로 false아에 싹다지우고
	}//method2
}// class
