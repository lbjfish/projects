package API_day01;
/**
 * �ַ����������Ĳ���
 * @author soft01
 *
 */
public class StringDemo {
	public static void main(String[] args)
	{
		                 //��������ֱ����
		String str = "helloworld";
		String str2 = "helloworld";
		/**
		 * java�ڱ����ʱ������һ���Ż�
		 * ���������ߵ����ݶ�������������
		 * ����м��㣬��������ɵ�������
		 * �ֽ����ļ��У���һ���ֽ����ļ������ǿ���
		 * �����������ݣ�
		 * String 3 = "helloworld";
		 */
	  /* String str3 = "hello"+"world";
	   String a = "hello'";
	   String str4 ="world";
 		System.out.println(str2==str3);
 		System.out.println(str2==str4);*/
 		String s1 = "abc123";
 		String s2 = "abc"+123;
 		String s3 =1+"2"+3+"abc";
 		String s4 =1+2+"3"+"abc";
 		String s5 ='1'+2+"3"+"abc";
 		String s6 ="1"+'2'+3+"abc";
 		System.out.println(s1==s2);
 		System.out.println(s1==s3);
 		System.out.println(s3==s4);
 		System.out.println(s3==s5);
 		System.out.println(s3==s6);
	}

}
