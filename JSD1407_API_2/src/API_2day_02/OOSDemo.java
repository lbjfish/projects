package API_2day_02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectOutputString
 * ��һ���߼���
 * �����Ĺ����ǿ��Խ������Ķ���ת��Ϊ�ֽں�д��
 * ���ڶ������л�
 * @author soft01
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException{
		List<String> list = new ArrayList<String>();
		list.add("��ס�ڱ���");
		list.add("����");
		list.add("������Ϣ");
		Person person = new Person("����",22,'��',2000,list);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos); //����ת��Ϊ�ֽ����У����л���
		
		/*
		 * void writeObject��Object o��
		 * ObjectOutputStream�ṩ�ķ������Խ������Ķ���ת��Ϊ
		 * һ���ֽں�д��
		 */
		
		oos.writeObject(person);
		System.out.print("���л����");
		oos.close();
		
	}

}
