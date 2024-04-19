package juso;

import java.util.*;
import java.io.*;

public class JusoDAO { //DAO = Data Access Object
	File file = new File ("C:\\Users\\KOSMO\\Desktop\\java\\ex05\\juso.txt");
	//주소목록
	public  ArrayList<Juso> list(){ // list라고 하는것은 보통 입력받는것들을... list 오류는 리턴하는게 있는데 리턴값이 없으니 그렇다.
		ArrayList<Juso> array = new ArrayList<Juso>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = ""; // while 안에 있는 line의 타입을 지정해주는것임.
			while((line=reader.readLine()) !=null) {
				String[] items = line.split(",");
				Juso juso = new Juso();
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setAddress(items[2]);
				juso.setPhone(items[3]);
//				System.out.println("\t\t 번호 : " + juso.getNo());
//				System.out.println("\t\t 이름 : " + juso.getName());
//				System.out.println("\t\t 주소 : " + juso.getAddress());
//				System.out.println("\t\t 전화번호 : " + juso.getPhone());
//				System.out.println("\t\t ────────────────");
				array.add(juso);
			}//while
		} catch(Exception e) {
			System.out.println("\t\t 오류 - " + e.toString());
		}//try-catch
		return array;  //리턴에서의 타입과 메소드의 리턴타입과 같아야한다.
	}//method
	
	
	
//////////////////////////////////////////////////////////주소찾기
	public Juso read(String name) { //read는 name을 받아서 해당되는 juso를 리턴하겠다.
		Juso juso = new Juso();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			while((line = reader.readLine()) != null) {
				String[] items = line.split(",");
				if(items[1].equals(name) || items[0].equals(name)) {
						juso.setNo(Integer.parseInt(items[0]));
						juso.setName(items[1]);
						juso.setAddress(items[2]);
						juso.setPhone(items[3]);
				}//if
			}//while
		} catch ( Exception e) {
			System.out.println("\t\t 주소 조회 - " + e.toString());
		}//try - catch
		return juso;
	
	}//method
	//////////////////////////////////////////////주소등록하기
	public void insert(Juso juso) { // 등록하는 메소드이름 insert
		try {
			FileWriter writer = new FileWriter(file, true); // 추가는 true 새로만들기 false
			writer.write(juso.getNo()+","+juso.getName()+","+juso.getAddress()+","+juso.getPhone()+"\n");
			writer.close();
		}catch(Exception e) {
			System.out.println("\t\t 주소등록 오류 - " + e.toString());
		}
	}//method
	///////////////////////////////////////////////////////////////////////주소삭제
	public void delete(int no) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			String lines = "";
			while((line = reader.readLine()) != null){
				String[] items = line.split(",");
				if(no != Integer.parseInt(items[0])){
//					System.out.println("\t\t " + line);
					lines = lines + line + "\n";
				}//if
			}//while
			FileWriter writer = new FileWriter(file, false);
			writer.write(lines);
			writer.close();
		} catch(Exception e) {
			System.out.println("\t\t 주소삭제 - " + e.toString());
		}//try - catch
	}//method
}//class




