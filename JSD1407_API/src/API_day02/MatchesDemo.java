package API_day02;
/**
 * �ַ�����matches����������֤��ǰ�ַ���
 * �Ƿ����������������ʽ�ĸ�ʽҪ��
 * @author soft01
 *
 */
public class MatchesDemo {
	public static void main(String[] args){
		/**
		 * ���֤�ŵ���֤
		 *\d{17}[0-9xX]
		 */
		String id = "114104198810102415";
		String regex = "\\d{17}[0-9xX]";  //javaϵͳ�Զ���"^\\d{17}[0-9xX]$"
		/**
		 * matches�����Ƿ���ȫƥ�䣬���������Ƿ���������ʽ����д��"^","$"
		 */
		boolean macth = id.matches(regex);
		//System.out.println(macth);
		if(macth)
		{
			System.out.println("��һ�����֤��");
		}
		else
		{
			System.out.println("����һ�����֤��");
		}
	}

}
