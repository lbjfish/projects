package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ��Ԫ�������ṩ�еıȽϹ������������Ƕ������������ʱ�� ���ǿ��Զ�����ṩһ�ֱȽϹ���
 * 
 * @author soft01
 * 
 */
public class ListDemo8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("������");
        list.add("����");
        list.add("����");
        list.add("���");
        list.add("����");
        list.add("����ʦ");
        System.out.println(list);
        /**
         * ��Ԫ�������ṩ�ıȽϹ���������������
         * ���ǿ����ṩ����ıȽϹ���
         */
        MyComparator com = new MyComparator();
        Collections.sort(list,com);
        System.out.println(list);
	}
}

class MyComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		// �ĸ��ַ������ĸ��ַ�����
		return o1.length() - o2.length();
	}
}
