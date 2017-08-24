package CeShiDaiMa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test15_2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("li.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Point p = (Point) ois.readObject();
		System.out.println(p);
		ois.close();
	}

}
