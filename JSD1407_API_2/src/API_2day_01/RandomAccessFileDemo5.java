package API_2day_01;
/**
 * 读取一个字节数组的数据
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("test.txt","r");
		
		/*
		 * int read(byte[] buf)
		 * 一次尝试从文件中读取buf数组length个字节并从该数组的第一个位置处
		 * 存放实际读取到的字节。
		 * 返回值为实际读取到的字节数
		 */
		byte[] buf = new byte[50];  //长度是14  我们创建50 足足满足了
 		int len = raf.read(buf);
		System.out.println(len);
		System.out.println(Arrays.toString(buf));
		
		/*
		 * 从字节数组转换为对应的字符串
		 */
		String str = new String(buf,"UTF-8"); 
		System.out.println(str);
		raf.close();
	}

}
