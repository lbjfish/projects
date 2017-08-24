package API_day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo8 {
	public static void main(String[] args){
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("***");
		c.add("two");
		c.add("***");
		c.add("three");
		c.add("***");
		c.add("four");
		
		//java.util.Iterator
		/**
		 * 使用迭代器遍历集合的步骤
		 * 必须遵循：
		 * 问取删 其中删除操作不是必须的
		 */
		Iterator it = c.iterator();
		
		while(it.hasNext())
		{
			Object o = it.next();
			String str = (String)o;
			if("***".equals(str))
			{
				/*
				 * 在迭代过程中不能通过集合的remove删除元素,
				 * 只能通过迭代器提供的remove方法，删除刚刚next（）出来的
				 * 元素，并且在下一次next（）方法调用后，方可再次调用
				 * remove（）
				 * c.remove(str);
				 */
				it.remove();
			}
			System.out.println(str);
		}
		System.out.println(c);
	}

}
