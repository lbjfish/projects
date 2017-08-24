package ≤‚ ‘¥˙¬Î;

import java.util.Collection;
import java.util.ArrayList;

public class test16 {
	public static void main(String[] args){
		Collection<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(1,2));
		Cell cell = new Cell(2,3);
		cells.add(cell);
		System.out.println(cell);
		System.out.println(cells);
	}

}
