package ≤‚ ‘¥˙¬Î;

import java.util.Collection;
import java.util.HashSet;

public class test11 {
	public static void main(String[] args){
		Collection<String> c = new HashSet<String>();
		System.out.println(c.isEmpty());
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objecttive-c");
		System.out.println("isEmpty:"+c.isEmpty()+",size:"+c.size());
		c.clear();
		System.out.print("isEmpty:"+c.isEmpty()+",size:"+c.size());
	}

}
