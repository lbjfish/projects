package API_day05;
/**
 * 表示二维坐标系上的一个点
 * 当前类的实例若需要比较大小
 * 我们需要实现一个接口Comparable
 * 通常该接口指定的泛型类型就是当前类
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
