package API_day02;

import java.util.Arrays;

/**
 * split�������ڲ���ַ���
 * ���ַ���������������ʽ�Ĳ��֡��г�����
 * ����ʣ�µĲ���
 * @author soft01
 *
 */
public class SplitDemo {
	public static void main(String[] args){
		String str = "456dhaskh23242skdhas3424jsdahk23sda";
		/**
		 * ����ÿһ����ĸ����
		 * �������ֲ��
		 */
		String[] array = str.split("[0-9]+");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
	}

}
