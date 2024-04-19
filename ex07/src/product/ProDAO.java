package product;

import java.sql.*;
import java.util.*;

public class ProDAO implements ProductInter{ // implements = 구현체 
	Connection con = Database.CON;
	
	//override = 재정의 
	@Override // 목록 표출하기 
	public ArrayList<ProVO> list() {
		ArrayList<ProVO> array = new ArrayList<ProVO>();
		try {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ProVO vo = new ProVO();
				vo.setCode(rs.getString("code")); // "code"는 sqld에 있는 code와 같아 야한다. 
				vo.setName(rs.getString("name")); // "code"는 sqld에 있는 code와 같아 야한다. 
				vo.setPrice(rs.getInt("price")); // "code"는 sqld에 있는 code와 같아 야한다. 
				array.add(vo);
			}//while
		}catch(Exception e) {
			System.out.println("\t\t 상품목록 오류 - " + e.toString());
		}//try-catch
		return array;
	}//interface
	
	@Override // 상품 등록하기
	public void insert(ProVO vo) {
		try {
			String sql = "insert into product(code, name, price) values(?, ?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCode());
			ps.setString(2, vo.getName());
			ps.setInt(3, vo.getPrice());
			ps.execute();
		}catch(Exception e) {
			System.out.println("\t\t 상품등록 오류 " + e.toString());
		}//try - catch
	}//method

	@Override //삭제하는거
	public boolean delete(String code) {
		try {
			String sql = "delete from product where code =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, code);
			ps.execute();
			return true;
		}catch(Exception e) {
//			System.out.println("\t\t상품삭제를 실패 했습니다.");
			return false;
		}//try - catch
	}//method

	@Override
	public void update(ProVO vo) {
		try {
			String sql = "update product set name=?, price=? where code=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(3, vo.getCode());
			ps.setString(1, vo.getName());
			ps.setInt(2, vo.getPrice());
			ps.execute();
		}catch(Exception e) {
			System.out.println("\t\t상품수정 오류 -" + e.toString());
		}
		
	}

	@Override //찾기
	public ProVO read(String code) {
		ProVO vo = new ProVO();
		try {
			String sql = "select * from product where code=?"; // 코드가 뭔지 몰라.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setCode(rs.getString("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
			}//if
		}catch(Exception e){
			System.out.println("\t\t 상품 찾기 오류 - " + e.toString());
		}//try - catch
		return vo;
	}//method

	@Override //코드+1해주는거
	public String getCode() {
		String code = "";
		try {
			String sql = "select max(code) +1 as code from product";
			PreparedStatement ps = con.prepareStatement(sql);//?가없으니까 실행해주자.
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				code = rs.getString("code");
			}//if
		}catch(Exception e){
			System.out.println("\t\t코드 불러오기 오류 -" + e.toString());
		}//try-catch
		return code;
	}//method
}//class
























