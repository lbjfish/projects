package API_day04;
/**
 * �Ӽ�����ɾ��Ԫ��
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
		c.remove("a"); //ɾ��Ԫ��
		System.out.println(c); //[a,c]
	}

}
