package ex04pm;

import java.io.*;
import java.util.*;

import ex04am.Car;

public class Sub01 {
	public static void run() {
		File file = new File("C:\\Users\\KOSMO\\Desktop\\java\\car.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file)); //버퍼는 메모리의 임시기억장소 -===> 파일리더에 파일을 넣고 - 파일에서 읽어온 데이터를 버퍼에 넣어놈 그의 이름은 reader
			System.out.println("\t\t파일을 읽어오는중......");
			String line = "";//
			StringTokenizer st = null; // 스플릿하기
			while((line = reader.readLine()) != null) { // 반복할껀데, line이라는 변수에 reader함수 - 한줄마다 -> null이 아닌동안에
//				System.out.println(line);
				st = new StringTokenizer(line, ",");
				String no = st.nextToken();
				String company = st.nextToken();
				String model = st.nextToken();
				String color = st.nextToken();
				String distance = st.nextToken();
				String date = st.nextToken();
				Car car = new Car(no, company, model, color, Integer.parseInt(distance), date);
//				System.out.println(car.toString());
				System.out.println("\t\t관리번호 : " + car.getNo());
				System.out.println("\t\t제조회사 : " + car.getCompany());
				System.out.println("\t\t차량이름 : " + car.getModel());
				System.out.println("\t\t색상 : " + car.getColor());
				System.out.printf("\t\t주행거리 : %,dkm\n", + car.getDistance());
				System.out.println("\t\t연식 : " + car.getDate() + "\n");

			}
		}catch(Exception e) {
			System.out.println("\t\t오류 -  " + e.toString());
		}//try catch
	}
}
