package API_day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��ΪList����
 * @author soft01
 *
 */
public class ListDemo5 {
	public static void main(String[] args){
		String[] array = {"a","b","c","d"};
		//Arrays.asList(array);
		/*
		 * ����ֻ��ת��ΪList����
		 * ��Ϊ��ת��ΪSet���ܻᶪʧ�ظ�Ԫ��
		 */
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/**
		 * ͨ������ת���ļ��ϣ��ǲ��ܸı伯��Ԫ��������
		 */
		/*list.add("e");
		 * list.remove(3);
		System.out.println(list);*/ // ��֧�� ��ɾԪ��
		
		System.out.println(Arrays.toString(array));
		
		//�޸ļ���Ԫ�ص����ݣ���Ӱ��ԭ����
		list.set(3,"e");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		//�������ɾԪ�ص����� �����Ը���һ��
		/*
		 * ���еļ���ʵ�ֶ�֧��һ�����췽��
		 * �÷������Դ���һ��Collection��
		 * ��ô�ù��췽�����������ļ���Ĭ�Ͼ����
		 * �˸��������е�����Ԫ��
		 * �����Ĺ��췽���������ƹ�����
		 */
		List list2 = new ArrayList(list);
		System.out.println(list2);
		list2.add("f");
		System.out.println(list2);
	}

}
