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
     * ʵ�ֶ�������л��뷴���л�
     */
    public static void testWiter()throws Exception{
    	List<String> list = new ArrayList<String>();
    	list.add("��ס�ڱ���");
		list.add("����");
		list.add("������Ϣ");
		Emp emp = new Emp("����",22,'��',2000,list);
    	FileOutputStream fis = new FileOutputStream("emolist.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
       oos.writeObject(emp);
       System.out.println("���л����");
       oos.close();
      
        }
        /**
         * ʹ��OISʵ�ֶ���ķ����л�
         */
        
	 public static void testRead()throws Exception{
	    FileInputStream fes = new FileInputStream("emolist.txt");
	    ObjectInputStream ois = new ObjectInputStream(fes);
	        Emp e = (Emp)ois.readObject();
	        System.out.println(e);
	        System.out.println("�����л����");        
	        ois.close();        
	    }
}
