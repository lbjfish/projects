package API_day02;

public class IntegerDemo {
	public static void main(String[] args){
		String str = "123.123";   //Ҫת��Ϊint�� �ͱ��벻����С������
		/**
		 * ���ַ���ת��Ϊ�������͵�ǰ���ǣ�
		 * ���ַ��������ı����ǻ�������֧�ֵ�
		 */
		/*int i = Integer.parseInt(str);   
		i++;
		System.out.println(i);*/   //�������д�ᱨ����Ϊstr��С������
		
		double j = Double.parseDouble(str);
		j++;
		System.out.print(j+"\n");
		
		float k = Float.parseFloat(str);
		k++;
		System.out.println(k);
	}

}
