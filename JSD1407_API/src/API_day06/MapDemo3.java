package API_day06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 有序的Map
 * 存放顺序与取出顺序一致
 * @author soft01
 *
 */
public class MapDemo3 {
	public static void main(String[] args){
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("语文", 77);
		map.put("数学", 85);
		map.put("物理", 54);
		map.put("化学", 74);
		System.out.println(map); 
		Set<Entry<String,Integer>>set = map.entrySet();
		for(Entry<String,Integer> entry : set){
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}

}
