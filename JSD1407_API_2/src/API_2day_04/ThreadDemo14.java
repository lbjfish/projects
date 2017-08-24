package API_2day_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadDemo14 {
	/*
	 * 设置线程池的大小 目前为5 就是说线程池有5个线程，如果只需要4个线程 就for i=0;i<4（剩下一个线程在线程池里空置，就是用不到）
	 * 如果需要6个线程就 for i=0;i<6（因为线程池里只有5个线程，所有执行一次线程池后，还要再执行一次线程池，只不过
	 * 第二次执行线程池里只需要一个线程，剩下4个空置 ）
	 */
	 public final static int THREAD_POOL_SIZE = 5;
	 
	    public static Map<String, Integer> crunchifyHashTableObject = null;
	    public static Map<String, Integer> crunchifySynchronizedMapObject = null;
	    public static Map<String, Integer> crunchifyConcurrentHashMapObject = null;
	 
	    public static void main(String[] args) throws InterruptedException {
	 
	        // Test with Hashtable Object
	        crunchifyHashTableObject = new Hashtable<>();
	        crunchifyPerformTest(crunchifyHashTableObject);
	 
	        // Test with synchronizedMap Object
	        crunchifySynchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());
	        crunchifyPerformTest(crunchifySynchronizedMapObject);
	 
	        // Test with ConcurrentHashMap Object
	        crunchifyConcurrentHashMapObject = new ConcurrentHashMap<>();
	        crunchifyPerformTest(crunchifyConcurrentHashMapObject);
	        
	 
	    }
	 
	    public static void crunchifyPerformTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException {
	    	List<String> list = new ArrayList<String>();
	    	
	    	list.stream();
	        System.out.println("Test started for: " + crunchifyThreads.getClass());
	        long averageTime = 0;
	        //这个for是为了各执行3次线程池(看清楚是线程池不是线程)
	        for (int i = 0; i < 3; i++) {
	 
	            long startTime = System.nanoTime();
	            ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
	            /*
	             * 线程池里有5个线程 这个for是 刚好一次执行完5个线程
	             *	（如果j<4的话，总之比5小就行，线程池里就算有5个线程也执行4次，因为只需要4个线程）
	             *	（如果j<6的话，总之比5大就行，线程池里只有5个线程，就说明一次只能创建5个线程
	             *		，需要创建两次才行，第一次创建5个线程，第二次创建1个线程） 
	             */
	            for (int j = 0; j < THREAD_POOL_SIZE; j++) {
	                crunchifyExServer.execute(new Runnable() {
	                    @SuppressWarnings("unused")
	                    @Override
	                    public void run() {
	                    	//这个for是每个线程（注意：不是线程池了 看好了，是线程池里每个线程）执行50万次操作
	                        for (int i = 0; i < 500000; i++) {
	                            Integer crunchifyRandomNumber = (int) Math.ceil(Math.random() * 550000);
	 
	                            // Retrieve value. We are not using it anywhere
	                            Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));
	 
	                            // Put value
	                            crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
	                        }
	                    }
	                });
	            }
	 
	            // Make sure executor stops
	            crunchifyExServer.shutdown();
	 
	            // Blocks until all tasks have completed execution after a shutdown request
	            crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
	 
	            long entTime = System.nanoTime();
	            long totalTime = (entTime - startTime) / 1000000L;
	            averageTime += totalTime;
	            System.out.println("2500K entried added/retrieved in " + totalTime + " ms");
	        }
	        System.out.println("For " + crunchifyThreads.getClass() + " the average time is " + averageTime / 3 + " ms\n");
	    }
}
