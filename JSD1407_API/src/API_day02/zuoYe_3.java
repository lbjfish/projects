package API_day02;
/**
 * ����һ�����֣��ж��Ƿ�Ϊ������С��
 * ��ת��Ϊ��Ӧ������
 * @author soft01
 */
import java.util.Scanner;
public class zuoYe_3 {
	public static void main(String[] args){
		/**
		 * 1.���û���ȡһ�����������
		 * 2.��дһ��������ʽ��֤����
		 * 3.ʹ�ð�װ�࣬���ַ���ת��Ϊ��������
		 * 4.���
		 * 
		 *���裺
		 *1.ʹ��Scanner��ȡ�û������һ���ַ���
		 *2.��дһ��������ʽ��֤����
		 *3.ʹ�ð�װ�࣬���ַ���ת��Ϊ��������
		 *4.���
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String intRegex = "[0-9]+";
		String doubleRegex = "[0-9]+\\.[0-9]+";
		//�ж��Ƿ�Ϊ����
		if(str.matches(intRegex))
		{
			System.out.println("����һ��������"+str);
		}
		else if(str.matches(doubleRegex))
		{
			System.out.println("����һ��С����"+str);
		}
		else
		{
			System.out.println("��ʽ����");
		}
	}

}
