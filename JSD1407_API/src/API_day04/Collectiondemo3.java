package API_day04;
/**
 * �鿴�������Ƿ����ָ����Ԫ��
 */
import java.util.ArrayList;
import java.util.Collection;

public class Collectiondemo3 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		/**
		 * boolean contains(Object o)
		 * �鿴��ǰ�������Ƿ����������Ԫ��o
		 */
		boolean contains = c.contains("a");
		System.out.println("�����Ƿ������"+contains);
		String str = new String("a");
		/**
		 * �жϼ����Ƿ��������Ԫ�صı�׼�ǿ�������Ԫ���Ƿ��ڼ�������
		 * ��ĳ��Ԫ��equals�Ƚ�true�������ʾtrue
		 */
	}

}
