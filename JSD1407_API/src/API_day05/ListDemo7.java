package API_day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo7 {
	public static void main(String[] args){
		List<Point> list = new ArrayList<Point>();
		
//		list.add(new Point(1,2));
//		list.add(new Point(3,4));
//		list.add(new Point(2,3));
		
		/**
		 * м╛ио
		 */
		Point p1 = new Point(1,2);  
		Point p2 = new Point(3,4);
		Point p3 = new Point(2,3);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
