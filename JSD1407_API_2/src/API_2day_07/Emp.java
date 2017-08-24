package API_2day_07;
/**
 * 该类用于描述emp.xml文件中表示的员工
 */
public class Emp {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	
	@Override
	public String toString() {
		return id+".age=" + age + ", gender=" + gender + ", id=" + id
				+ ", name=" + name + ", salary=" + salary;
	}
	public Emp(int id, String name, int age, String gender, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public Emp(){
		
	}
	/**
	 * 无参的构造方法：
	 * 当我们没有定义构造方法时，编译器会自动帮我们添加一个默认的构造方法。
	 * 默认构造方法：
	 * 无参数，且每一任何实现代码。如下。
	 * 若我们定义过任何构造方法，编译器不会为我们添加该默认构造方法，若需要
	 * ，则手动书写
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
