package emploDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;
import emplo.Employee;

/**
 * 用于操作数据库表Employee.java的DAO
 * @author soft02
 *
 */
public class EmployeeDAO {
	//查所有
	private static final String FIND_ALL = "select * from emp_lee";
   //查ID（跟update联系在一起,要根据id修改）
	private static final String FIND_ID = "select * from emp_lee where id=?";
	//根据查到的ID，更改数据
	private static final String UPDATE_EMP = "update emp_lee set name=?,salary=?,age=? where id=?";
	//删除数据
	private static final String DELETE_EMP = "delete from emp_lee where id=?";
	//插入数据
	private static final String INSERT_EMP = "insert into emp_lee(name,salary,age) values(?,?,?)";
	/*
	 * 查
	 */
	public static List<Employee> findAll() throws Exception{
		List<Employee> list = new ArrayList<Employee>();
		Employee emp;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				int age = rs.getInt("age");
			   emp = new Employee(id,name,salary,age);
				list.add(emp);
			}
			ps.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.closeConnection(conn);
		}
		return list;
	}
	
	/**
	 * 查ID（跟update联系在一起,要根据id修改）
	 * @throws Exception 
	 */
	//public static boolean find(int id)这个方法和下个方法一样，看你怎么用
	public static Employee findId(int id) throws Exception{
		Employee emp = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(FIND_ID);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				int i = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				int age = rs.getInt("age");
				emp = new Employee(i,name,salary,age);
			}
			ps.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.closeConnection(conn);
		}
		return emp;
	}
	/**
	 * 根据查到的ID，更改数据
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public static boolean update(Employee emp) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(UPDATE_EMP);
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			ps.setInt(3, emp.getAge());
			ps.setInt(4, emp.getId());
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
	/**
	 * 删除数据
	 * @throws Exception 
	 */
	public static boolean delete(int id) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(DELETE_EMP);
			ps.setInt(1, id);
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
	/**
	 * 插入数据
	 * @param emp
	 * @return
	 * @throws Exception
	 */
	public static boolean insert(Employee emp) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(INSERT_EMP);
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			ps.setInt(3, emp.getAge());
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
