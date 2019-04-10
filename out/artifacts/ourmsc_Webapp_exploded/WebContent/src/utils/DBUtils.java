package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	public static Connection conn;
	public static String url;
	public static String user;
	public static String password;
	public static String driver;

	static{
		InputStream is=DBUtils.class.getClassLoader().getResourceAsStream("config/db.Properties");
		Properties prop=new Properties();
		
	
			try {
				prop.load(is);
				driver=prop.getProperty("driver");
				user=prop.getProperty("user");
				password=prop.getProperty("password");
				url=prop.getProperty("url");
				Class.forName(driver);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         }
      public static Connection getConnection(){
			try {
				conn=DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
           }
	}
