package ≤‚ ‘¥˙¬Î;

public class Cell {
	    int row;
	    int col;
	    Cell(int row,int col)
	    {
	    	this.row=row;
	    	this.col=col;
	    }
	    Cell()
	    {
	    	this(0,0);
	    }
	    Cell(int n)
	    {
	    	this(n,n);
	    }
	    Cell(Cell cell)
	    {
	    	this(cell.row,cell.col);
	    }
	     void up()
	     {
	    	row--;
	     }
	     void drop()
	     {
	    	row++;
	    	
	     }
	     void moveLeft()
         {
         col--;
         }
         void moveRight()
         {
         col++;
         }
	     void drop(int d)
         {
        	 row+=d;
         }
         void moveLeft(int d)
         {
         col-=d;
         }
         void moveRight(int d)
         {
         col+=d;
         }     
         String getCellInfo()
         {
        	 return row+","+col;
         }
}
