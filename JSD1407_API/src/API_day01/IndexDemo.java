package API_day01;
/**
 * �ַ�����indexOf���������ڲ���
 * �ַ�����λ��
 * @author soft01
 *
 */
public class IndexDemo {
	public static void main(String[] args){
		String str = "thinking in java";
		int index = str.indexOf("in");
		System.out.println(index);
		/**
		 * ��ָ��λ�ÿ�ʼ���ҵ�һ�γ��ָ����ַ�����λ��
		 */
		int index1 = str.indexOf("in",4); //�ҵ�java��λ�ã����ܺܶ�,Ҳ�����ж������Ƿ���ȷ	����������@
		System.out.println(index1);
		index = str.lastIndexOf("in");
		System.out.println(index);
	}

}
