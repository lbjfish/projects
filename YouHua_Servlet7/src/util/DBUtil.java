package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() throws Exception{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			/*
			 * 对于有些mysql的jdbc驱动默认情况下，，会使用"iso-8859-1"来编码和解码，所以，通常
	       * jdbc:mysql://localhost:3306/jsd1407?useUnicode=true&characterEncoding=utf8;
	         * 这两个选项参数的作用是告诉jdbc驱动使用"utf-8"来编码和解码。
			 */
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd1407?useUnicode=true&characterEncoding=utf8","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}		
		return conn;
	}
	public static void closeConnection(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
