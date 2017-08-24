package API_2day_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set set = new HashSet();
		Map<String,Object> obj = new HashMap<String,Object>();
		obj.put("语文", 33);
		obj.put("数学", 45);
		obj.put("英语", 50);
		obj.put("数学", 100);
		System.out.println(obj);
	}
}
