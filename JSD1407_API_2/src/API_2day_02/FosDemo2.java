package API_2day_02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件字节输出流对已有文件进行写操作的注意事项
 * @author soft01
 *
 */
public class FosDemo2 {
	public static void main(String[] args) throws IOException{
		/**
		 * FileOutputStream支持一个重载的构造方法
		 * FileOutputStream（String str,boolean append)
		 * 第二个参数指定是否进行追加写操作
		 * 若不追加，当前文件中的所有内容都会被清除。然后重新写数据。
		 * 要注意这一点和RandomAccessFile不同
		 */
		FileOutputStream fos = new FileOutputStream("fos.dat",true);
		fos.write(99);
		fos.close();
	}

}
