package API_day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * ����Map
 * �������е�key
 * @author soft01
 *
 */
public class MapDemo2 {
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����", 77);
		map.put("��ѧ", 85);
		map.put("����", 54);
		map.put("��ѧ", 74);
		
		/*
		 * �������е�key
		 * Set keySet()
		 * �÷����ὫMap�����е�key����һ��Set�����в����ء�
		 * �������Ǳ������е�keyֻ��Ҫ��ȡ�ü��ϲ������ü��ϼ��ɡ�
		 */
		Set<String> keyset = map.keySet();
		for(String key : keyset){
			System.out.println("key:"+key);
		}
		
		/**
		 * ����ÿһ���ֵ��
		 * Set entrySet����
		 * �÷������ȡһ��Set���ϣ��ü����д�����ɸ�Entry��ʵ����
		 * ÿһ��Entryʵ���ڲ����������ԣ��ֱ𱣴�key��value����
		 * �����Ǳ���ÿһ��Entryʵ�������൱�������ÿһ���ֵ��
		 * 
		 * Entry�ķ������;�Ӧ�����Ӧ��Map����ķ�������һ��
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
		 * ��������value��������
		 * Collection valuse()
		 * �÷����Ὣ���е�value����һ�����ϲ����أ�֮���Բ�����
		 * Set���ϣ�����Ϊvalue�����ظ�
		 */
		Collection<Integer> values = map.values();
		for(int value : values){
		System.out.println("value��"+value);
	}
	}

}
