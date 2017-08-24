package ≤‚ ‘¥˙¬Î;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test33 {
	public static void main(String[] args){
		List<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(2,3));
		cells.add(new Cell(5,1));
		cells.add(new Cell(3,2));
		
		Collections.sort(cells,new Comparator<Cell>(){
			public int compare(Cell o1,Cell o2){
				return o1.col-o2.col;}
		});
	}

}
