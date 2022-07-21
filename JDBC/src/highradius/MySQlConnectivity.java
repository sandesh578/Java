package highradius;
import java.sql.*;

public class MySQlConnectivity {

	public static void main(String[] args) {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Sujan@578");
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery("SELECT * FROM DEPARTMENT");
			while(resultset.next()) {
				System.out.println(resultset.getString("dept_name"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	
}
