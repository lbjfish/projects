package API_day01;
/**
 * ���һ���ַ����Ƿ����Ը������ַ�����ʼ�Ļ��β��
 * @author soft01
 *
 */
public class StartsWithAndEndsWithDemo {
	public static void main(String[] args){
		String str = "Thinking in Java";
		boolean start = str.startsWith("T");
		boolean end = str.endsWith("Java");
		System.out.println("�Ƿ���T��ͷ��"+start);
		System.out.println("�Ƿ���Java��ͷ��"+end);
	}

}
