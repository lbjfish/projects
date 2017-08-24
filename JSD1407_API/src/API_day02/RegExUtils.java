package API_day02;
public class RegExUtils {
	public static final String 
	ID_NUMBER = "^[0-9]{15}([0-9]{2}[0-9xX])?$";
	public static final String
	ZIP_CODE="\\d{6}";
	public static final String
	PHONE_NUMBER = "\\d{11}";
	/**
	 * 根据给定的正则表达式验证给定的字符串
	 * 是否满足格式要求
	 * @param str    需要验证格式的字符串
	 * @param regex  验证格式的正则表达式
	 * @return  true：满足格式要求 false：不满足
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
			System.out.print("是身份证号。");
		}
		else
		{
			System.out.print("不是");
		}
	}
}
