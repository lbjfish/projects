package API_2day_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
// key:1;key2:2;key3:3
public class Abc {
	@SuppressWarnings("unchecked")
	public static <K, V> Map<K,V> getMap(String source,String firstSplit,String secondSplit){
		
		Map<K,V> map = new HashMap<K,V>();
		
		if(source == null || "".equals(source)){
			return null;
		}
		
		String sour[] = source.split(firstSplit);
		for(String str : sour){
			String str2[] = str.split(secondSplit);
			if(str2.length == 2){
				map.put((K) str2[0],(V) str2[1]);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String test = "key:1;key2:2;key3:3";
		Map<String,Integer> map = getMap(test,";",":");
		for(Entry<String,Integer> entry : map.entrySet()){
			String key = entry.getKey();
			System.out.print(key+",");
			Integer val = Integer.valueOf(String.valueOf(entry.getValue()));
			System.out.print(val);
			System.out.println();
		}
	}
}
