package API_day02;
/**
 * toString��Object������ķ��� ���ֱ�ӵ���emp�����ó�����һ����ַ��
 * ��˱�����дtoString�������ܷ���ֵ
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
		Emp emp = new Emp("����",22,'��',4000);
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
		Emp emp = new Emp("����",22,'��',4000);
		Emp emp1 = new Emp("����",22,'��',4000);
		System.out.println(emp);
		System.out.println(emp.equals(emp1));
	}
	

}
