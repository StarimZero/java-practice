package product;

import java.sql.*;

public class Database { //오라클에서만든 데이터를 커넥션하자.
	public static Connection CON;  // ojdbc를 가져오자. 프로젝트 - 프로퍼티 - 라이브러리 - C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib 
	static { // 접속을 이렇게 해야한다. 접속정보는 CON이라는 곳에 들어있다.
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "product";
			String password = "pass";
			Class.forName(driver);
			CON = DriverManager.getConnection(url, user, password);
			System.out.println("\t\t 접속성공");
		}catch(Exception e) {
			System.out.println("\t\t 접속실패 - " + e.toString());
		}
	}
		
		

}
