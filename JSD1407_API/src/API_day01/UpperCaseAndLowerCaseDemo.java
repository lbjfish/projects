package API_day01;

import java.util.Scanner;

/**
 * ���ַ�����Ӣ�Ĳ���ת��Ϊ��Сд  ����֤����������ģ�
 * @author soft01
 *
 */
public class UpperCaseAndLowerCaseDemo {
	public static void main(String[] args){
		String str = "�Ұ�Java";
		/**
		 * ���ַ����е�Ӣ�Ĳ���ת��Ϊȫ��д
		 */
		String str1 = str.toUpperCase();
		System.out.println(str1);
	   str = "�Ұ�JAVA";
	   /**
	    * ���ַ����е�Ӣ�Ĳ���ת��ΪȫСд
	    */
		String str2 = str.toLowerCase();
		System.out.println(str2);
		
	   /*******************************************/
		String message = "3bSa7U";
		System.out.println("��������֤�룺"+message);
		Scanner scan = new Scanner(System.in);
		String str3 = scan.nextLine();
		message=message.toLowerCase();   //����֤���ΪСд
		str3=str3.toLowerCase();      //���û������ΪСд
		if(message.equals(str3))
		{
			System.out.println("������ȷ");
		}
		else
			System.out.println("�������");
	}

}
