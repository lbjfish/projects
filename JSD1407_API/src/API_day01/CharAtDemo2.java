package API_day01;
/**
 * ʹ��charAt�ж��ַ����Ƿ�Ϊ�����ġ�
 * @author soft01
 *
 */
public class CharAtDemo2 {
	public static void main(String[] args){
		/**
		 * ˼·��
		 * �жϻ��ĵ�ԭ��
		 * ����λ���ϵ��ַ��뵹��λ���ϵ��ַ�һ��
		 */
		String str = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<str.length()/2;i++)
		{
			int last = str.length()-1-i;	
			if(str.charAt(i)!=str.charAt(last))
			{
				System.out.println("���ǻ���");
            return;                    //��������
			}
		}
		System.out.println("�ǻ���");
	}

}
