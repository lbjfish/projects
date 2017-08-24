package API_2day_02;

import java.io.Serializable;
import java.util.List;

public class Emp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private char gender;
	private double  salary; //序列化后瘦身 transient（该关键字修饰的属性在序列化时其值将被忽略）
	private List<String> otherInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Emp(String name, int age, char gender, double salary,
			List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.otherInfo = otherInfo;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", gender=" + gender + ", name=" + name
				+ ", otherInfo=" + otherInfo + ", salary=" + salary + "]";
	}
	
}
