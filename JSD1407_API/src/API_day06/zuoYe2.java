package API_day06;
/**
 * 1.创建一个Map
 * key：出现的字符
 * value：字符出现的次数
 * 2.获取字符是否在Map中作为key存在
 * 存在：存在说明以前统计过了，只需要对value+1
 * 不存在：说明没统计过，value设置为1
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
			if(map.containsKey(str1))  //统计过
			{
				map.put(str1, map.get(str1)+1);
			}else{                     //没统计过
				map.put(str1, 1);
			}
		}
	   System.out.print(map);
	}

}
