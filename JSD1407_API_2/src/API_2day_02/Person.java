package API_2day_02;

import java.io.Serializable;
import java.util.List;
/**
 * 一个对象若想通过ObjectOutputStream进行序列化，那么该对象所属的
 * 类必须实现Serializable接口，该接口没有定义任何抽象方法，实现该接口
 * 仅仅用于标识当前类的实例可以被序列化
 * @author soft01
 *
 */
public class Person implements Serializable{
	/**
	 * 当类的属性增加或修改了，若版本号不变
	 * 那么反序列化时会尽可能兼容现有版本
	 * 若版本号发生了改变，那么反序列化时会抛出异常
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private char gender;
	private double  salary; //序列化后瘦身 transient（该关键字修饰的属性在序列化时其值将被忽略）
	private List<String> otherInfo;
	
	@Override
	public String toString() {
		return "age=" + age + ", gender=" + gender + ", name=" + name
				+ ", otherInfo=" + otherInfo + ", salary=" + salary ;
	}

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

	public Person(String name, int age, char gender, double salary,
			List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.otherInfo = otherInfo;
	}
	
	
	

}
