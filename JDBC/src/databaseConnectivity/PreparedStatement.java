package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class PreparedStatement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:‪C:\\sqlite\\univ.db");
		
		PreparedStatement stm=(PreparedStatement) con.prepareStatement("SELECT * FROM student WHERE deptno=?");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the dept no:");
		int dno=scan.nextInt();
		
		ResultSet rs=null;//stm.execute();
		while(rs.next())
		{
			System.out.println(rs.getInt("roll")+" ");
			System.out.println(rs.getString("name")+" ");
			System.out.println(rs.getString("city")+" ");
			System.out.println(rs.getInt("deptno")+" ");
		}
		
		con.close();

	}

}
