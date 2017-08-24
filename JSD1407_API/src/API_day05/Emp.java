package API_day05;

import java.util.Comparator;

public class Emp implements Comparator<Emp>{
	private String name;
	private int age;
	private char gender;
	private int salary; 
	
	
	public Emp(){
		
	}
	public Emp(String name, int age, char gender, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

   public String toString(){
	   return "("+name+","+age+","+gender+","+salary+")";
   }

@Override
public int compare(Emp o1, Emp o2) {
	// TODO Auto-generated method stub
	
	return o1.salary-o2.salary;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Emp other = (Emp) obj;
	if (age != other.age)
		return false;
	if (gender != other.gender)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (salary != other.salary)
		return false;
	return true;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + gender;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + salary;
	return result;
}
   
//	@Override
//	public int compareTo(Emp o) {
//		// TODO Auto-generated method stub
//		
//		return this.salary>o.salary? 1:(this.salary==o.salary? 0:-1);	
//	}

}
