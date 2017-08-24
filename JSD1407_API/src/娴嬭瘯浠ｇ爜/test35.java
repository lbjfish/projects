package 测试代码;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


class Point
{
	
}
public class test35 {
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文", 90);
		map.put("英语", 65);
		map.put("数学", 78);
		map.put("物理", 48);
 //Map遍历对象两种方式
		//方式一： key
		Set<String> keySet = map.keySet();
		for(String key : keySet){		
		    Integer value = map.get(key);
		    System.out.println(key+":"+value);
		}
		
		System.out.println("-------");
		
		//方式二： entry
		Set<Entry<String,Integer>> set = map.entrySet();
		for(Entry<String,Integer> entry : set){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
	}

}
