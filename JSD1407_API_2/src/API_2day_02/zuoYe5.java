package API_2day_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class zuoYe5 {
    public static void main(String[] args) throws Exception {
    	testWiter();
    	testRead();
    	
    }
    
    /**
     * 实现对象的序列化与反序列化
     */
    public static void testWiter()throws Exception{
    	List<String> list = new ArrayList<String>();
    	list.add("家住在北京");
		list.add("汉民");
		list.add("其他信息");
		Emp emp = new Emp("张三",22,'男',2000,list);
    	FileOutputStream fis = new FileOutputStream("emolist.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
       oos.writeObject(emp);
       System.out.println("序列化完毕");
       oos.close();
      
        }
        /**
         * 使用OIS实现对象的反序列化
         */
        
	 public static void testRead()throws Exception{
	    FileInputStream fes = new FileInputStream("emolist.txt");
	    ObjectInputStream ois = new ObjectInputStream(fes);
	        Emp e = (Emp)ois.readObject();
	        System.out.println(e);
	        System.out.println("反序列化完毕");        
	        ois.close();        
	    }
}
