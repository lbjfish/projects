package API_day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����
 * ���Ա���һ�����ݣ������ϱ�����ǿ
 * �����д����������Ԫ��
 * �����д�ŵ���Ԫ�صĵ�ַ������Ԫ�ض�����
 */
public class CollectionDemo {
	public static void main(String[] args){
     Collection c = new ArrayList();
     /*
     *boolean add(E e)
      * �÷��������򼯺�����Ӹ���Ԫ��
      * ����ֵ��true��ʾ��ӳɹ�
     * false��ʾ���ʧ�� 
      */
     Element e1 = new Element();
     e1.setRow(1);
     e1.setCol(2);
     Element e2 = new Element();
     /**
      * ����ʵ�ʴ������e1������ñ�����ֵ
      * Ҳ���ǽ���ַ�����˼���
      */
     e2.setRow(3);
     e2.setCol(4);
     c.add(e1);
     c.add(e2);
     //�������
     /**
      * ����toString�ĸ�ʽ
      * [Ԫ��1.toString(),Ԫ��2.toString(),.....]
      */
     System.out.println(c);
     e1.setRow(5);
     e1.setCol(6);
     System.out.println(c);
	}

}
