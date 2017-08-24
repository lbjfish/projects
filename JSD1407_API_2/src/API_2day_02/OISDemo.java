package API_2day_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream
 * ��һ���߼���
 * �����������ǿ��Խ�һ���ֽ�ת��Ϊ��Ӧ�Ķ���
 * ���ڶ���ķ����л�
 * @author soft01
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);//�ֽ�����ת��Ϊ���󣨷����л���
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}

}
