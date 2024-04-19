package professor;

import java.util.*;

import java.sql.*;

public class ProDAO { 
	Connection con = Database.CON;
	//목록
	public ArrayList<ProVO> list(){ // 목록보기
		ArrayList<ProVO> array = new ArrayList<ProVO>(); // 어레리스트에 VO가 들어간다 = 여러개의 VO가 들어간다.
		try {
			String sql = "select * from professors order by pcode"; // order by pcode는 오름차순 정렬이다.
			PreparedStatement ps = con.prepareStatement(sql); // sql문을 ps에 넣어주고
			ResultSet rs = ps.executeQuery(); // ps 실행결과를 rs에 넣는다.  slect만 executeQuery이다.
			while(rs.next()) {// rs에서 다음거를 꺼내올건데 while로 반복해라. 여기는 결과로 나오는 행이 여러개니까 반복해야지.
				ProVO vo = new ProVO();
				vo.setPcode(rs.getString("pcode")); //filed name이랑 똑같아야한다. rs.값은
				vo.setPname(rs.getString("pname")); //filed name이랑 똑같아야한다. rs.값은
				vo.setDept(rs.getString("dept")); //filed name이랑 똑같아야한다. rs.값은
				vo.setHiredate(rs.getString("hiredate")); //filed name이랑 똑같아야한다. rs.값은
				vo.setTitle(rs.getString("title")); //filed name이랑 똑같아야한다. rs.값은
				vo.setSalary(rs.getInt("salary")); //filed name이랑 똑같아야한다. rs.값은
				array.add(vo);
			}//while
		}catch (Exception e){ // Exception -> 오류가 e에 있는거다.
			System.out.println("교수목록 오류 - " + e.toString());
		}//try - catch
		return array;	
	}// method
	
	
	//등록
	public void insert (ProVO vo) {  // 등록하기.
		try {
			String sql = "insert into professors(pcode,pname,dept,hiredate,title,salary)";  sql += "values(?, ?, ?, ?, ?, ?)"; // 뭐가 들어올지 모르니 ? 로 설정.
			PreparedStatement ps = con.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();   -> 리턴이 없어서 받을 필요가 없다.
			ps.setString(1, vo.getPcode());
			ps.setString(2, vo.getPname());
			ps.setString(3, vo.getDept());
			ps.setString(4, vo.getHiredate());
			ps.setString(5, vo.getTitle());
			ps.setInt(6, vo.getSalary());
			ps.execute(); //execute = 입력하겠다. 어디에? table에.
		} catch(Exception e ) {
			System.out.println("\t\t 교수등록 오류 - : " + e.toString());
		} //try - catch
	}//method
	
	
	
	public int getCode() { // 리턴값이 int인  이름이 getCode인 메소드를 하나 만든다.
		int code = 0;
		try {
			String sql = "select max(pcode)+1 as code from professors";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				code = rs.getInt("code"); //꺼내온 결과중에서 code값을 code라는 이름에 넣어준다.
			}
		}catch(Exception e) {
			System.out.println("\t\t새로운 코드 오류 -" + e.toString());
		}
		return code;
	}//method
	
	
	// 찾기
	public ProVO read(String pcode) {
		ProVO vo = new ProVO();
		try {
			String sql = "select * from professors where pcode = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, pcode);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setPcode(rs.getString("pcode")); //filed name이랑 똑같아야한다. rs.값은
				vo.setPname(rs.getString("pname")); //filed name이랑 똑같아야한다. rs.값은
				vo.setDept(rs.getString("dept")); //filed name이랑 똑같아야한다. rs.값은
				vo.setHiredate(rs.getString("hiredate")); //filed name이랑 똑같아야한다. rs.값은
				vo.setTitle(rs.getString("title")); //filed name이랑 똑같아야한다. rs.값은
				vo.setSalary(rs.getInt("salary")); //filed name이랑 똑같아야한다. rs.값은
			}
		}catch(Exception e){
			System.out.println("\t\t교수 찾기 오류 - " + e.toString());
		}
		return vo; //최종적으로 찾은 값들을 vo에 넣어준거를 리턴시켜주는거임 -> read를 실행하면 이 리턴된 vo가 보일것.
	}//method
	
	
	//삭제하기 
	public void delete(String pcode) {
		try {
			String sql = "delete from professors where pcode = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, pcode);
			ps.execute();
		}catch(Exception e) {
			System.out.println("\t\t 교수삭제 오류 - " + e.toString());
		}
		
	}//method
	
	
	//수정하기
	public void update(ProVO vo) {
		try {
			String sql = "update professors set pname =?, dept =?, hiredate=sysdate, title=?, salary=? where pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setString(2, vo.getDept());
//			ps.setString(3, vo.getHiredate());
			ps.setString(3, vo.getTitle());
			ps.setInt(4, vo.getSalary());
			ps.setString(5, vo.getPcode());
			ps.execute();
		}catch(Exception e) {
			System.out.println("\t\t교수 수정 오류 - " + e.toString());
		}
		
		
		
	}//method
	
	
	
	
}//class

























