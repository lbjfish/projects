package API_2day_02;

import java.io.Serializable;
import java.util.List;
/**
 * һ����������ͨ��ObjectOutputStream�������л�����ô�ö���������
 * �����ʵ��Serializable�ӿڣ��ýӿ�û�ж����κγ��󷽷���ʵ�ָýӿ�
 * �������ڱ�ʶ��ǰ���ʵ�����Ա����л�
 * @author soft01
 *
 */
public class Person implements Serializable{
	/**
	 * ������������ӻ��޸��ˣ����汾�Ų���
	 * ��ô�����л�ʱ�ᾡ���ܼ������а汾
	 * ���汾�ŷ����˸ı䣬��ô�����л�ʱ���׳��쳣
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private char gender;
	private double  salary; //���л������� transient���ùؼ������ε����������л�ʱ��ֵ�������ԣ�
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
