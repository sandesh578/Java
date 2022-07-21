package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Database {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:‪C:\\sqlite\\univ.db");
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from dept");
		
		int dno;
		String dname;
		while(rs.next())
		{
			dno=rs.getInt("deptno");
			dname=rs.getString("dname");
			
			System.out.println(dno+"    "+dname);
		}
		stm.close();
		con.close();

	}

}
