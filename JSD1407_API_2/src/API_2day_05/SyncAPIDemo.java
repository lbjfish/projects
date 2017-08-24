package API_2day_05;
/**
 * 将集合或Map转换为线程安全的
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SyncAPIDemo {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list = Collections.synchronizedList(list);
		//将现有的List集合转换为线程安全的
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		//将现有的Set集合转换为线程安全的
		set = Collections.synchronizedSet(set);
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		//将现有的Map转换为线程安全的
		map=Collections.synchronizedMap(map);
	}

}
