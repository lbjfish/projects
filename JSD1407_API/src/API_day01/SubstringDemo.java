package API_day01;
/**
 * subString���ڻ�ȡһ���ַ����Ĳ�������
 * @author soft01
 *
 */
public class SubstringDemo {
	public static void main(String[] args){
		String url = "www.oracle.com";
		/**
		 * ͨ������£����������ֱ�ʾ��Χʱ
		 * ����"��ͷ����β"��  [4,10);
		 */    
		String sub = url.substring(4,10);
		System.out.println(sub);
		
		//һ������Ϊ��ָ��λ�ý�ȡ���ַ���ĩβ
		String sub1 = url.substring(4);
		System.out.println(sub1);
		
		url = "http://www.tarena.com.cn";
		/**
		 * ˼·��
		 * ��ȡ��һ���㣬��ڶ������λ��
		 * ��ȡ�м���ַ�������
		 */
		int one = url.indexOf(".");
		int two = url.indexOf(".",one+1);
		String s = url.substring(one+1,two);
		System.out.print(s);
	}

}
