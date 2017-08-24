package API_day06;

import java.util.HashMap;
import java.util.Map;

/**
 * Map看起来像是一个多行两列的表格
 * 以key-value对的形式保存数据
 * @author soft01
 *
 */
public class MapDemo1 {
	public static void main(String[] args){
		//java.util.Map
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("语文", 77);
		map.put("数学", 85);
		map.put("物理", 54);
		map.put("化学", 74);
		//输出Map中的元素个数
		System.out.println(map.size());
		//输出Map的toString
		System.out.println(map);
		/*
		 * 若Key在Map中不存在，会将给定的key与value存入Map，返回值为null
		 * 所以要注意，若value是一个包装类，那么我们获取put返回值时应当使用
		 * 包装类去接收而不应当使用基本类型，因为会涉及到隐式的自动拆箱，这可
		 * 能引发空指针异常
		 */
		Integer num = map.put("自然", 88);
		System.out.println(map);
		System.out.println(num);//null
		
		/**
		 * 使用Map中已有key添加新value，则是替换value操作，put方法会将被
		 * 替换的value返回
		 */
	   num = map.put("物理", 61);
		System.out.println(map);
		System.out.println(num);
		
		/*
		 * Map中获取元素的方式是根据给定的key获取对应value，若给定的key
		 * 在map中不存在，则返回值为null
		 * V get（K k）
		 */
		num = map.get("语文");
		System.out.println("语文:"+num);
		//不存在的key返回null
		num = map.get("体育");
		System.out.println("体育："+num);
		
		/**
		 * 删除元素
		 * V remove(K k)
		 * 根据给定的key删除当前key-value对
		 * 若key存在，返回值为当前key对应的value
		 * 若key不存在，则返回值为null
		 */
		System.out.println(map);
		num = map.remove("语文");
		System.out.println(num);
		System.out.println(map);
		
		/*
		 * boolean containsKey(K k)
		 * 查看当前Map中是否包含给定的key
		 */
		boolean has = map.containsKey("手工");
		System.out.println("是否含有 手工："+has);
	}

}
