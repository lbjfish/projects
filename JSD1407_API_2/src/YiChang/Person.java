package YiChang;

public class Person {
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age) throws IllegalAgeException{
		if(age<=0||age>100){
			throw new IllegalAgeException("�������������");
		}
		this.age = age;
	}
	public static void main(String[] args){
		Person p = new Person();
		try{
			p.setAge(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
}