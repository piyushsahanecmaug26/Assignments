package org.piyush;

public class Program {

	public static void main(String[] args)throws InterruptedException {
		Counter c = new Counter();
		
		IncrementThread t = new IncrementThread(c);
		DecrementThread t2 =new DecrementThread(c);
//		MyTask task = new MyTask();
//		Thread t1 = new Thread(task);
		
		t.start();
		t2.start();
//		t1.start();

		t.join();
		t2.join();
//		t1.join();
		
		System.out.println(c.count);

	}
	
}
