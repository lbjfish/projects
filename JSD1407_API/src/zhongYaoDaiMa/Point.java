package zhongYaoDaiMa;

public class Point<X,Y> {
	private X x;
	private Y y;
	
	public Point(X x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public X getX() {
		return x;
	}
	public void setX(X x) {
		this.x = x;
	}
	public Y getY() {
		return y;
	}
	public void setY(Y y) {
		this.y = y;
	}
	
	
	public String toString(){
		return x+","+y;
	}
	
}
