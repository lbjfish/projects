package API_day02;
/**
 * ��֤�ֻ������䣬�ʱ�
 */
import java.util.Scanner;
public class zuoYe_1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������������ģ�");
		String str = scan.next();
		String regex1 = "\\d{17}[0-9xX]";
		String regex2 = "\\d{6}";
		String regex3 = "\\d{11}";
		String regex4 = "^\\w+@(\\w+\\.)+\\w{2,4}$";
		
		boolean match = str.matches(regex1);
		boolean match1 = str.matches(regex2);
		boolean match2 = str.matches(regex3);
		boolean match3 = str.matches(regex4);
		 
		 if(match)
		 {
			 System.out.print("��һ�����֤��");
		 }
		 if(match1)
		 {
			 System.out.print("��һ���ʱ��ַ");
		 }
		 if(match2)
		 {
			 System.out.print("��һ���ֻ���");
		 }
		 if(match3)
		 {
			 System.out.print("��һ������");
		 }
	}

}
