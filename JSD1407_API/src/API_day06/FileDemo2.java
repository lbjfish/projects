package API_day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File������ɾ��һ���ļ�
 * @author soft01
 *
 */
public class FileDemo2 {
    public static void main(String [] args) throws IOException{
    	/*
    	 * �ڵ�ǰ��Ŀ�ĸ�Ŀ¼�´���һ����Ϊ
    	 * test.txt�ļ�
    	 */
    	//��д"./"Ҳ��ʾ�ڵ�ǰ��Ŀ��Ŀ¼��
    	File file = new File("test.txt");
    	//�ļ��������򴴽�
//    	if(!file.exists()){
//    		file.createNewFile();
//    	}else{
//    		System.out.println("���ļ��Ѵ���");
//    	}
//    	System.out.println("�㶨");
    	
    	/**
    	 * ���жϸ��ļ��Ƿ���ڣ����ھ�ɾ��
    	 */
    	if(file.exists()){
    		file.delete();
    		System.out.println("�ļ��Ѿ�ɾ��");
    	}
    }

}
