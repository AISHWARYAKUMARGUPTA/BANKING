import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class jdbcdemo {
	public static void main(String[]args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
		
		String userName="scott";
		
		String password="tiger";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from BankingSystem");
		 while (rs.next()) {
			 System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
