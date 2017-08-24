package zhongYaoDaiMa;
//·ºÐÍÊÇ¼ÙµÄ
import java.util.ArrayList;
import java.util.Collection;

public class TestPoint {
	public static void main(String[] args){
		
		Point<Integer,Double> p = new Point<Integer,Double>(1,2.5);
		System.out.println(p);
		Point p2 = p;
		p2.setX("33");
		p2.setY("11");
		System.out.println(p2);
		System.out.println(p);
	}
}
