package API_day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型java5之后推出的一个新特性
 * 将集合中的应用是作用约束结合元素类型的
 * @author soft01
 *
 */
public class TypeDemo {
	public static void main(String[] args){
	    Collection<String> c = new ArrayList<String>();
	    c.add("one");
	    c.add("two");
	    c.add("three");
	    
	    for(String str : c)
	    {
	    	System.out.println(str);
	    }
	}
}
