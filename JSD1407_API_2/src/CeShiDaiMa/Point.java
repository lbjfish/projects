package CeShiDaiMa;

import java.io.Serializable;
import java.util.List;

public class Point implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private char sex;
	private int age;
	private int salary;
	private List<String> OtherInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getOtherInfo() {
		return OtherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		OtherInfo = otherInfo;
	}
	public Point(String name, char sex, int age, int salary,
			List<String> otherInfo) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.salary = salary;
		OtherInfo = otherInfo;
	}
	@Override
	public String toString() {
		return "[其它信息=" + OtherInfo + ", 年龄" + age + ", 姓名="
				+ name + ", 薪水=" + salary + ", 性别=" + sex + "]";
	}
	

}
