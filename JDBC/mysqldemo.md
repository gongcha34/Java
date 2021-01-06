1. MySql JDBC 생성하기
```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Main {

	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			String driverURL = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC"; // word 데이터베이스 + 타임존 추가하기 8.0에러 해결방법(?serverTimezone=UTC)
			
			conn = DriverManager.getConnection(driverURL,"root","1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT name, countrycode, district, population FROM city");
			
			while(rs.next()) {
				String name = rs.getString(1); //getInt
				String countrycode = rs.getString(2);
				String district = rs.getString(3);
				int population = rs.getInt(4);
				System.out.println(name + " " + countrycode + " " + district+ " " + population);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(stmt != null)
					stmt.close();
			}
			catch(SQLException e) {}
		}
		
	}
}
```
