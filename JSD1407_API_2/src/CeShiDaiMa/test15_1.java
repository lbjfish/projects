package CeShiDaiMa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class test15_1 {
	public static void main(String[] args) throws IOException{
		
		List<String> list = new ArrayList<String>();
		list.add("家住新疆");
		list.add("汉族");
		list.add("英语");
		Point point = new Point("李保军",'男',23,3000,list);
		
		FileOutputStream fos = new FileOutputStream("li.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(point);
		System.out.println("序列化完毕");
		oos.close();
	}

}
