package API_day01;
/**
 * ��������������ת��Ϊ�ַ�������
 * @author soft01
 *
 */
public class ValueOfDemo {
	public static void main(String[] args){
		double pi = 3.1415926+1;
		//��Doubleֵת��Ϊ�ַ�����ʽ
		String piStr = String.valueOf(pi);
		System.out.println(piStr);
		
		/*******************************************/
		
		double pi1 = 3.1415926;
		String piStr1 = String.valueOf(pi1)+1;
		System.out.println(piStr1);
		
		//��intֵת��Ϊ�ַ�����ʽ
		String intStr = String.valueOf(1);
		//��booleanֵת��Ϊ�ַ�����ʽ
		String booleanStr = String.valueOf(false);
	}

}
