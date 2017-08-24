package ²âÊÔ´úÂë;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test20{
  public static void main(String[] args){
	List<Integer> list = new ArrayList<Integer>();
	System.out.println(list);
	for(int i=0;i<10;i++)
	{
		list.add((int)(Math.random()*100));
	}
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
  }
}