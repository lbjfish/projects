package API_day06;
/**
 * 1.����һ��Map
 * key�����ֵ��ַ�
 * value���ַ����ֵĴ���
 * 2.��ȡ�ַ��Ƿ���Map����Ϊkey����
 * ���ڣ�����˵����ǰͳ�ƹ��ˣ�ֻ��Ҫ��value+1
 * �����ڣ�˵��ûͳ�ƹ���value����Ϊ1
 */
import java.util.HashMap;
import java.util.Map;

public class zuoYe2 {
	public static void main(String[] args){
		String str = "good good study,day day up";
		str = str.replaceAll("[^a-zA-Z]+", "");
		//System.out.println(str);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char str1 = str.charAt(i);
			if(map.containsKey(str1))  //ͳ�ƹ�
			{
				map.put(str1, map.get(str1)+1);
			}else{                     //ûͳ�ƹ�
				map.put(str1, 1);
			}
		}
	   System.out.print(map);
	}

}
