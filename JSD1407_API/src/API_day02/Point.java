package API_day02;
/**
 * �����ÿһ��ʵ������������ά����ϵ�ϵ�һ����
 * ʹ�ø������Object��ط���
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
	 * ��дtoString����
	 * @param args
	 */
	public String toString()
	{
		return "x="+x+",y="+y;
	}
	public boolean equals(Object o)  //��дequals����
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
		//Ĭ�ϵ�toString��ȡ���Ƕ���ľ��
		/**
		 * System.out.println����ľ��Ƕ����toString�����ķ���ֵ��
		 * 		String o = p.toString();
		 *       System.out.println(o);	
		 */
		System.out.println(p);
		
		System.out.println(p==p2);  //false;
		System.out.println(p.equals(p2));
	}

}
