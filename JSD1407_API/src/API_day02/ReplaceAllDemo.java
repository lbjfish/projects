package API_day02;
/**
 * replaceAll�������ڽ���ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author soft01
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args){
		String str ="addas42343dasa43434dasa4344das";
		/**
		 * �����鲿���滻Ϊ��#number��
		 */
		String replace=str.replaceAll("\\d+","#number#");
		System.out.print(replace);
	}

}
