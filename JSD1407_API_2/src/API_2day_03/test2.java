package API_2day_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class test2 {
    public static void writeData() throws IOException{
        try {
            FileOutputStream fos= new FileOutputStream("out.dat");
            fos.write(1);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
    	try {
			writeData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}