package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DatabaseDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:‪C:\\sqlite\\univ.db");
		
		Statement stm=con.createStatement();
		
		stm.executeUpdate("insert into dept values(60,'Chem')");
		
		stm.close();
		con.close();

	}

}
