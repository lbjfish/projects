package ���Դ���;

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
		map.put("����", 90);
		map.put("Ӣ��", 65);
		map.put("��ѧ", 78);
		map.put("����", 48);
 //Map�����������ַ�ʽ
		//��ʽһ�� key
		Set<String> keySet = map.keySet();
		for(String key : keySet){		
		    Integer value = map.get(key);
		    System.out.println(key+":"+value);
		}
		
		System.out.println("-------");
		
		//��ʽ���� entry
		Set<Entry<String,Integer>> set = map.entrySet();
		for(Entry<String,Integer> entry : set){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
	}

}
