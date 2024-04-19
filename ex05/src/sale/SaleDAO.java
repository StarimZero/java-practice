package sale;

import java.util.*;

import java.io.*; //io는 input output이다. 


public class SaleDAO {
	File file = new File("C:\\Users\\KOSMO\\Desktop\\java\\ex05\\sale.txt");
	public ArrayList<SaleVO> list(){
		ArrayList<SaleVO> array = new ArrayList<SaleVO>(); //어레이리스트를 새로만들어서 어레이에 정의호 어레이를 리턴해주는것.
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file)); // 파일을 파일리더에 넣어서 생성후 버퍼리더를 생성해서 리더에 넣어준거임.
			String line = "";
			while((line = reader.readLine()) !=null) {
				String[] items = line.split(",");
				SaleVO sale = new SaleVO();
				sale.setCode(Integer.parseInt(items[0]));
				sale.setName(items[1]);
				sale.setPrice(Integer.parseInt(items[2]));
				sale.setQnt(Integer.parseInt(items[3]));
				array.add(sale);
			} // while
		}catch(Exception e) {
			System.out.println("\t\t 매출목록오류 - " + e.toString());
		}// try - catch
		return array;
	}//list method
	
	////매출등록하기
	public void insert (SaleVO sale) { 
		try {
			FileWriter writer = new FileWriter(file, true);
//			writer.write(sale.getCode() + "," + sale.getName() + "," + sale.getPrice() + "," + sale.getQnt() + "\n");
			writer.write(String.format("%d,%s,%d,%d\n", sale.getCode(), sale.getName(), sale.getPrice(), sale.getQnt()));
			writer.close();
		} catch(Exception e ) {
			System.out.println("\t\t 매출등록 : " + e.toString());
		}
	}

	//// 상품찾기
	public SaleVO read(int code) {
		SaleVO sale = new SaleVO();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			while((line = reader.readLine()) !=null) {
				String[] items = line.split(",");
				if(code == Integer.parseInt(items[0])) {
					sale.setCode(code);
					sale.setName(items[1]);
					sale.setPrice(Integer.parseInt(items[2]));
					sale.setQnt(Integer.parseInt(items[3]));
				}//if
			}//while
		}catch(Exception e) {
		}//try - catch
	return sale;
	}
	////주소삭제 
	public void delete(int code) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			String lines = "";
			while((line = reader.readLine()) != null){
				String[] items = line.split(",");
				if(code != Integer.parseInt(items[0])){
//					System.out.println("\t\t " + line);
					lines = lines + line + "\n";
				}//if
			}//while
			FileWriter writer = new FileWriter(file, false);
			writer.write(lines);
			writer.close();
		} catch(Exception e) {
			System.out.println("\t\t 매출삭제 - " + e.toString());
		}//try - catch
	}//method
}//class
