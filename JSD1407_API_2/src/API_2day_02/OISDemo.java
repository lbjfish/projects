package API_2day_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream
 * 是一个高级流
 * 该流的作用是可以将一组字节转换为对应的对象
 * 用于对象的反序列化
 * @author soft01
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("person.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);//字节序列转换为对象（反序列化）
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}

}
