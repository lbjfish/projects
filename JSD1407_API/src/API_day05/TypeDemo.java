package API_day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����java5֮���Ƴ���һ��������
 * �������е�Ӧ��������Լ�����Ԫ�����͵�
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
