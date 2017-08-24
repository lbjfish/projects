package API_day02;
/**
 * 该类的每一个实例用于描述二维坐标系上的一个点
 * 使用该类测试Object相关方法
 * @author soft01
 *
 */
public class Point {
	private int x;
	private int y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	/**
	 * 重写toString方法
	 * @param args
	 */
	public String toString()
	{
		return "x="+x+",y="+y;
	}
	public boolean equals(Object o)  //重写equals方法
	{
		if(o==null)
		{
			return false;
		}			
		if(o==this)
		{
			return true;
		}
		if(o instanceof Point)
		{
			Point p = (Point)o;
			return this.x==p.x&&this.y==p.y;
		}
		else
		{
		return false;
		}
	}
	public static void main(String[] args){
		Point p = new Point(1,2);
		Point p2 = new Point(1,2);
		//默认的toString获取的是对象的句柄
		/**
		 * System.out.println输出的就是对象的toString方法的返回值。
		 * 		String o = p.toString();
		 *       System.out.println(o);	
		 */
		System.out.println(p);
		
		System.out.println(p==p2);  //false;
		System.out.println(p.equals(p2));
	}

}
