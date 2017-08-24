package API_day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 遍历Map
 * 遍历所有的key
 * @author soft01
 *
 */
public class MapDemo2 {
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文", 77);
		map.put("数学", 85);
		map.put("物理", 54);
		map.put("化学", 74);
		
		/*
		 * 遍历所有的key
		 * Set keySet()
		 * 该方法会将Map中所有的key存入一个Set集合中并返回。
		 * 所以我们遍历所有的key只需要获取该集合并遍历该集合即可。
		 */
		Set<String> keyset = map.keySet();
		for(String key : keyset){
			System.out.println("key:"+key);
		}
		
		/**
		 * 遍历每一组键值对
		 * Set entrySet（）
		 * 该方法会获取一个Set集合，该集合中存放若干个Entry的实例，
		 * 每一个Entry实例内部有两个属性，分别保存key，value这样
		 * ，我们遍历每一个Entry实例，就相当与遍历了每一组键值对
		 * 
		 * Entry的泛型类型就应当与对应的Map定义的泛型类型一致
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> it = entrySet.iterator();
		while(it.hasNext()){
			Entry<String,Integer> entry = it.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key+"="+value);
		}
		
		/*
		 * 遍历所有value，不常用
		 * Collection valuse()
		 * 该方法会将所有的value放入一个集合并返回，之所以不放入
		 * Set集合，是因为value允许重复
		 */
		Collection<Integer> values = map.values();
		for(int value : values){
		System.out.println("value："+value);
	}
	}

}
