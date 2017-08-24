package API_day02;
/**
 * toString是Object类里面的方法 如果直接调用emp，将得出的是一个地址，
 * 因此必须重写toString方法才能返回值
 * @author soft01
 *
 */
public class Emp {
	private String name;
	private int age;
	private char gender;
	private double salary;
	public Emp(String name, int age, char gender, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	/*public static void main(String[] args){
		Emp emp = new Emp("张三",22,'男',4000);
		System.out.println(emp);*/
	
	
	public String toString(){
		return name+","+age+","+gender+","+salary;
	}
	public boolean equals(Object o){
		if(o==null)
		{
			return false;
		}
		if(this==o)
		{
			return true;
		}
		if(o instanceof Emp)
		{
			Emp e = (Emp)o;
			return e.name==this.name;
		}
		return false;
	}
	public static void main(String[] args){
		Emp emp = new Emp("张三",22,'男',4000);
		Emp emp1 = new Emp("张三",22,'男',4000);
		System.out.println(emp);
		System.out.println(emp.equals(emp1));
	}
	

}
