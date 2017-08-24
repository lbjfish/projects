package API_day02;
public class RegExUtils {
	public static final String 
	ID_NUMBER = "^[0-9]{15}([0-9]{2}[0-9xX])?$";
	public static final String
	ZIP_CODE="\\d{6}";
	public static final String
	PHONE_NUMBER = "\\d{11}";
	/**
	 * ���ݸ�����������ʽ��֤�������ַ���
	 * �Ƿ������ʽҪ��
	 * @param str    ��Ҫ��֤��ʽ���ַ���
	 * @param regex  ��֤��ʽ��������ʽ
	 * @return  true�������ʽҪ�� false��������
	 */
	public static boolean check(String str,String regex)
	{
		return str.matches(regex);
	}
	public static void main(String[] args)
	{
		String str = "110321346546546";
		boolean tf = RegExUtils.check(str, RegExUtils.ID_NUMBER);
		if(tf)
		{
			System.out.print("�����֤�š�");
		}
		else
		{
			System.out.print("����");
		}
	}
}
