package gui;
import java.sql.DriverManager;
import java.sql.Connection;

import javax.swing.JOptionPane;;

public class SQLConnection {
	Connection conn = null;
	
	public static Connection DBConnect()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bt_lon","root","sadface");
			return conn;
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "An error occurs while starting application ","Error",JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
}
