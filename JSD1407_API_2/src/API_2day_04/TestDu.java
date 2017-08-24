package API_2day_04;

import java.util.Vector;

public class TestDu {
	 public static void main(String[] args) throws InterruptedException{
		    Vector<Integer> list=new Vector<Integer>(100);
		     for(int i=0;i<100;i++){
		     list.add(i);
		     }
		     long str=System.currentTimeMillis();
		 
		     
		     for(Integer ve : list){
		    	 Thread.sleep(100);
		    	 System.out.println(ve);
		     }
		     long end=System.currentTimeMillis();
		        System.out.println("xiaohaowei "+(end-str)+"ms");
		     
		    }
}
