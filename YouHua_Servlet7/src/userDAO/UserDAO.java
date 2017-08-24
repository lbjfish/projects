package userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import emplo.Employee;

import use.User;
import util.DBUtil;

public class UserDAO {

   //查ID（跟update联系在一起,要根据id修改）
	private static final String FIND_Username = "select * from user_lee where username=?";
	//插入数据
	private static final String INSERT_USER = "insert into user_lee(username,pwd,name,gender) values(?,?,?,?)";
	/**
	 * 查用户名（username）
	 * @param username
	 * @return
	 * @throws Exception 
	 */
	public static User findByUsername(String username) throws Exception{
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(FIND_Username);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String usernm = rs.getString("username");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				user = new User(id,usernm,pwd,name,gender);
			}
			ps.close();
			return user;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally{
				DBUtil.closeConnection(conn);
		}	
	}
	
	public static List<User> findAll() throws Exception{
		List<User> users = new ArrayList<User>();
		Connection conn = DBUtil.getConnection();
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select * from user_lee");
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setName(rs.getString("name"));
			users.add(user);
		}
		DBUtil.closeConnection(conn);
		return users;
	}
	
	/**
	 * 插入数据
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public static boolean insert(User user) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(INSERT_USER);
		   ps.setString(1, user.getUsername());
		   ps.setString(2, user.getPwd());
		   ps.setString(3, user.getName());
		   ps.setString(4, user.getGender());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.closeConnection(conn);
		}
	}
}
