package API_day04;
/**
 * 给类用于测试向集合存入的元素
 * @author soft01
 *
 */
public class Element {
	private int row;
	private int col;
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	
	public String toString(){
		return row+","+col;
	}
	public boolean equals(Object o)
	{
		if(o==null)
		{
			return false;
		}
		if(o==this)
		{
			return true;
		}
		if(o instanceof Element) 
		{
			Element e = (Element)o;
			return e.row==this.row&&e.col==this.col;
		}
		else
		{
			return false;
		}
	}

}
