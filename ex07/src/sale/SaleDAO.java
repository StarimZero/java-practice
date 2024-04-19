package sale;

import java.sql.*;
import java.util.*;

import product.Database;

public class SaleDAO {
	Connection con = Database.CON;
	
	// 목록 표출하기
	public ArrayList<SaleVO> list(){
		ArrayList<SaleVO> array = new ArrayList<SaleVO>();
		try {
			String sql = "select sale_date, code, name, sum(qnt), sum(qnt*price) price  ";
			sql+="from view_sale  ";
			sql+="group by sale_date, code, name  ";
			sql+="order by sale_date, code";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setName(rs.getString("name"));
				vo.setSale_date(rs.getString("sale_date"));
				vo.setCode(rs.getString("code"));
				vo.setQnt(rs.getInt("sum(qnt)")); // 이거 sum(qnt)로 바꿔야 될수도.
				vo.setPrice(rs.getInt("price")); // sum(qnt*price)가 아니고 total로 해야한다 = > getint는 정수형값만 처리 곱셉의 결과는 실수로 반환..
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("\t\t매출현황 오류 - " + e.toString());
		}
		return array;
	}//method
	
	// 판매찾기
	
	// 판매 등록
	public void insert(SaleVO vo) {
		try {
			String sql = "insert into sale(seq, code, sale_date, qnt, price)";
						sql += "values(seq_sale.nextval, ?, ?, ?, ?)";
						PreparedStatement ps = con.prepareStatement(sql);
						ps.setString(1, vo.getCode());
						ps.setString(2, vo.getSale_date());
						ps.setInt(3, vo.getQnt());
						ps.setInt(4, vo.getPrice());
						ps.execute();
		}catch(Exception e){
			System.out.println("\t\t 판매등록 오류 - " + e.toString());
			
		}
		
		
		
		
		
	}
	
	
	
	
	
}//class
