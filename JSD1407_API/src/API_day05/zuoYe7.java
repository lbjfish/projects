package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zuoYe7 {
	public static void main(String[] args){
		List<Emp> list = new ArrayList<Emp>();
		/**
		 * ʲôʱ���Ƽ�ʹ�������ڲ��ࣺ
		 * 1.������Ҫ����һ���࣬��ʵ��ĳ���ӿڻ�̳�ĳ����
		 * 2.�����ʵ��������һ��������ֻ���ض��������ʹ��
		 * ֻҪͬʱ��������������������Ӧ��ʹ�������ڲ���
		 */
		
//		list.add(new Emp("Terry",25,'m',6000));
//		list.add(new Emp("Allen",21,'f',4000));
//		list.add(new Emp("Smith",23,'m',3000));
		
		/**
		 * ͬ��
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
