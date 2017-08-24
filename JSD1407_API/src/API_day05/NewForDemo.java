package API_day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 新循环
 * 用来便利集合或数组
 * @author soft01
 *
 */
public class NewForDemo {
	public static void main (String[] args){
		String[] array = {"a","b","c","d","e"};
		for(int i=0;i<array.length;i++)  //传统方法遍历数组 ，下面传统方法遍历集合
		{
			String str = array[i];
			System.out.print(str+" ");
		}
		System.out.println();
		//新循环遍历
		for(String str : array)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		Iterator it = c.iterator();
		while(it.hasNext())       //传统方法遍历集合
		{
			String str = (String)it.next();
			System.out.print(str+" ");
		}
		System.out.println();
		for(Object str : c)      //新方法遍历集合
		{
			System.out.print(str+" ");
		}
	}
}
