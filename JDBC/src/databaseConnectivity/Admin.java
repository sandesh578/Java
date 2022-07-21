package databaseConnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class Admin {

	// create connection
	public static Connection getConnection() throws Exception {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Sujan@578");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// add user
	public static int registerUser(String uname, String uemail, String upass, String udeg) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO crud VALUES (?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, uemail);
			ps.setString(3, upass);
			ps.setString(4, udeg);
			i = ps.executeUpdate();
			return i;

		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	// read the database
	public static ResultSet report() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT UNAME,UEMAIL,UPASS,UDEG FROM crud";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	public static ResultSet fetchUserDetails(String uemail) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT UNAME,UEMAIL,UPASS,UDEG FROM crud WHERE UEMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, uemail);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	// update
	public static int updateUserDetails(String uname, String uemail, String upass, String udeg, String uemailhidden)
			throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "UPDATE crud SET UNAME=?,UEMAIL=?,UPASS=?,UDEG=? WHERE UEMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, uemail);
			ps.setString(3, upass);
			ps.setString(4, udeg);
			ps.setString(5, uemailhidden);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	// delete
	public static int deleteUserDetails(String uemail) throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "DELETE FROM crud WHERE UEMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, uemail);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}
	
	public static void main(String args[]) {
//		int val;
		try {
//			val = registerUser("Rakesh","rakesh@gmail.com","rakesh@123","88");
//			System.out.println(val);
//			ResultSet rs=fetchUserDetails("sangam@gmail.com");
//			int res=updateUserDetails("Sandesh Parajuli","abc@gmail.com","sandesh@578","99","abc@gmail.com");
			int res=deleteUserDetails("abc@gmail.com");
			System.out.println(res);
			ResultSet rs=report();
			while(rs.next()) {
				System.out.println(rs.getString("uemail"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
