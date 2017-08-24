package ²âÊÔ´úÂë;

import java.util.ArrayList;
import java.util.Collection;

public class test21 {
	public static void main(String[] args){
		Collection<String> c = new ArrayList<String>();
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("ios");
		for(String str:c)
		{
			System.out.print(str.toUpperCase()+" ");
		}
	}

}
