package CeShiDaiMa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class test15_1 {
	public static void main(String[] args) throws IOException{
		
		List<String> list = new ArrayList<String>();
		list.add("��ס�½�");
		list.add("����");
		list.add("Ӣ��");
		Point point = new Point("���",'��',23,3000,list);
		
		FileOutputStream fos = new FileOutputStream("li.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(point);
		System.out.println("���л����");
		oos.close();
	}

}
