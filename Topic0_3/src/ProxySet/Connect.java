package ProxySet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Connect {
	public void connect() {
		String user = "root";
		String pwd  = "masterkey";
		String url  = "jdbc:mysql://localhost:3306/personas?useSSL=false&serverTimezone=UTC";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection Succesful");
		} catch (SQLException se) {
			System.out.println("Exception Ocurred " + se);
			}
	}

}
