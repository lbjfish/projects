package API_day04;
/**
 * 从集合中删除元素
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo5 {
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);
		c.remove("a"); //删除元素
		System.out.println(c); //[a,c]
	}

}
