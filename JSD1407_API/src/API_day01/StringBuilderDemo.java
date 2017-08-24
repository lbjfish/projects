package API_day01;

import java.util.Scanner;

/**
 * StringBuilder
 * ���ڽ��Ƶ���޸��ַ������ݴ�������Դ���Ĺ�������
 * 
 * Ƶ���޸��ַ�������ѡ
 * @author soft01
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args){
		/**
		 * StringBuilder�ṩ�˶��ַ����༭��
		 * ��ط�����
		 * ����append
		 * ɾ��delete
		 * �ģ�replace
		 * �壺insert 
		 */
		String str = "Ŭ��ѧϰjava";
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		StringBuilder builder = new StringBuilder(a);
		//Ŭ��ѧϰjava��Ϊ���Ҹ��ù���
		//append�����ٵ�ǰ�ַ���ĩβ׷�Ӹ����ַ���
		builder.append(",Ϊ���Ҹ��ù���");                   //��
		str = builder.toString();
		System.out.println(str);
		
		//Ŭ��ѧϰjava��Ϊ�˸ı�����
		/**
		 * replace(int start,int end,String str)
		 * ��start��ʼ��end����
		 */
		builder.replace(11, builder.length(), "�ı�����");  //��
		str = builder.toString();
		System.out.println(str);
		
		//Ŭ��ѧϰjava������Ϊ�˸ı�����
		/**
		 * insert(int offset,String str)
		 * �ڸ�����λ��offset�������ַ���str
		 * ԭλ�ü��Ժ���ַ��������Զ�����ƶ�
		 */
		builder.insert(9, "����");                        //��
		str = builder.toString();
		System.out.println(str);
		
		//������Ϊ�˸ı�����
		//delete������ɾ��ָ����Χ�ڵ��ַ���
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		//���ţ�����Ϊ�˸ı�����
		builder.insert(0, "����");
		str = builder.toString();
		System.out.println(str);
		
		//��ת�ַ�        /�ô˷����жϻ��� ������
		builder.reverse();
		str = builder.toString();
		System.out.println(str);
	}

}
