package API_day05;
/**
 * ��ʾ��ά����ϵ�ϵ�һ����
 * ��ǰ���ʵ������Ҫ�Ƚϴ�С
 * ������Ҫʵ��һ���ӿ�Comparable
 * ͨ���ýӿ�ָ���ķ������;��ǵ�ǰ��
 * @author soft01
 *
 */
public class Point implements Comparable<Point>{
	private int x; 
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public String toString(){
		return "("+x+","+y+")";
	}


	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}

}
