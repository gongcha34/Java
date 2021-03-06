# 오라클 JDBC
## 오라클 JDBC 생성하기
1. tnsnames에 LISTENER,HOS,PORT 찾기
2. 19c는 oracle_db_home\network\admin에 위치함

### Statement 인터페이스

+ SELECT 사용
> executeQuery() 메서드
```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import oracle.jdbc.driver.OracleDriver;

public class Main {

	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// DriverManager.registerDriver(new OracleDriver()); // 생략가능
			String driverURL = "jdbc:oracle:thin:@localhost:port/사용자";
			
			conn = DriverManager.getConnection(driverURL,"scott","비밀번호");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT EMPNO, ENAME, JOB, HIREDATE FROM EMP");
			
			while(rs.next()) {
				int empNo = rs.getInt(1); // coulmn을 줄 수 있다 rs.getInt("empno"); //orai19n.jar 추가해야한다.
				String empName = rs.getString(2);
				String empJob = rs.getString(3);
				Date hireDate = rs.getDate(4);
				System.out.println(empNo + " " + empName + " " + empJob+ " " + hireDate);
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

+ INSERT, UPDATE, DELETE 사용
> executeUpdate() 메서드
```

public class Main {

	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		
		try {
			String driverURL = "jdbc:oracle:thin:@localhost:port/사용자";
			
			conn = DriverManager.getConnection(driverURL,"scott","비밀번호");
			stmt = conn.createStatement();
			
//			int count1 = stmt.executeUpdate("insert into dept values (60, 'network', 'soule')");
//			System.out.println("insert row: " + count1);
//			int count2 = stmt.executeUpdate("update dept set loc = 'busan' where deptno = 60");
//			System.out.println("update row: " + count2);
			int count3 = stmt.executeUpdate("delete dept where deptno = 60");
			System.out.println("delete row: " + count3);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
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


+ SELECT(질의), INSERT, UPDATE, DELETE 사용
> execute() 메서드
```
public class Main {

	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			String driverURL = "jdbc:oracle:thin:@localhost:port/사용자";
			
			conn = DriverManager.getConnection(driverURL,"scott","비밀번호");
			stmt = conn.createStatement();

			//boolean isQuery = stmt.execute("SELECT EMPNO, ENAME, JOB, HIREDATE FROM EMP"); // select
			boolean isQuery = stmt.execute("insert into dept values (60, 'network', 'soule')"); // insert, update, delete
			if(isQuery) {
				rs = stmt.getResultSet();
				while(rs.next()) {
					int empNo = rs.getInt(1);
					String empName = rs.getString(2);
					String empJob = rs.getString(3);
					Date hireDate = rs.getDate(4);
					System.out.println(empNo + " " + empName + " " + empJob+ " " + hireDate);
				}
			}
			else {
				int count = stmt.getUpdateCount(); //영향을 받은 row의 갯수가 몇개인가?
				System.out.println("row: " + count);
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

### prepareStatement
+ executeQuery() 메서드
```
public class Main {

	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// DriverManager.registerDriver(new OracleDriver()); // 생략가능
			String driverURL = "jdbc:oracle:thin:@localhost:포트/사용자";
			
			conn = DriverManager.getConnection(driverURL,"scott","비밀번호");

			stmt = conn.prepareStatement("SELECT EMPNO, ENAME, JOB, HIREDATE FROM emp" 
											+ " where empno = ? and hiredate < ?" );
			stmt.setInt(1,7369);
			stmt.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
			rs = stmt.executeQuery();
			while(rs.next()) {
				int empNo = rs.getInt("EMPNO"); 
				String empName = rs.getString("ENAME");
				String empJob = rs.getString("JOB");
				Date hireDate = rs.getDate("HIREDATE");
				System.out.println(empNo + " " + empName + " " + empJob+ " " + hireDate);
			}
			stmt.setInt(1,7698);
			stmt.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
			rs = stmt.executeQuery();
			while(rs.next()) {
				int empNo = rs.getInt("EMPNO"); 
				String empName = rs.getString("ENAME");
				String empJob = rs.getString("JOB");
				Date hireDate = rs.getDate("HIREDATE");
				System.out.println(empNo + " " + empName + " " + empJob+ " " + hireDate);
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
+ executeUpdate() 메서드
```
public class Main {

	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// DriverManager.registerDriver(new OracleDriver()); // 생략가능
			String driverURL = "jdbc:oracle:thin:@localhost:포트/사용자";
			
			conn = DriverManager.getConnection(driverURL,"scott","비밀번호");

			stmt = conn.prepareStatement("delete from dept where deptno = ?");
			stmt.setInt(1, 60);
			int count = stmt.executeUpdate();
			System.out.println("row : " + count);
			
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
+ 자동 커밋 해제
> conn.setAutoCommit(false);
```

public class Main {

	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// DriverManager.registerDriver(new OracleDriver()); // 생략가능
			String driverURL = "jdbc:oracle:thin:@localhost:포트/사용자";
			
			conn = DriverManager.getConnection(driverURL,"scott","비밀번호");

			conn.setAutoCommit(false);
//			stmt = conn.prepareStatement("insert into dept values(?,?,?)");
//			stmt.setInt(1, 50);
//			stmt.setString(2, "web");
//			stmt.setString(3, "inchen");
//			int count = stmt.executeUpdate();
//			System.out.println("row : " + count);
			
			stmt = conn.prepareStatement("update dept set loc = ? where deptno = ?");
			stmt.setString(1, "busan");
			stmt.setInt(2, 50);
			int count = stmt.executeUpdate();
			System.out.println("row : " + count);
			
			stmt = conn.prepareStatement("delete from dept where deptno = ?");
			stmt.setInt(1, 50);
			count = stmt.executeUpdate();
			System.out.println("row : " + count);
			if(count == 0)
				conn.rollback();
			else
				conn.commit();
			
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
