package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zuoYe7 {
	public static void main(String[] args){
		List<Emp> list = new ArrayList<Emp>();
		/**
		 * 什么时候推荐使用匿名内部类：
		 * 1.我们需要定义一个类，并实现某个接口或继承某个类
		 * 2.该类的实例仅创建一个，并且只在特定代码快中使用
		 * 只要同时满足以上两个条件，就应当使用匿名内部类
		 */
		
//		list.add(new Emp("Terry",25,'m',6000));
//		list.add(new Emp("Allen",21,'f',4000));
//		list.add(new Emp("Smith",23,'m',3000));
		
		/**
		 * 同上
		 */
		Emp p1 = new Emp("Terry",25,'m',6000);  
		Emp p2 = new Emp("Allen",21,'f',4000);
		Emp p3 = new Emp("Smith",23,'m',3000);
		
	   list.add(p1);
	   list.add(p2);
	   list.add(p3);

		Collections.sort(list,new Emp());
		System.out.print(list);
	}

}
