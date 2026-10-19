package org.piyush;

public class MyTask implements Runnable {

	@Override
	public void run() {
		for(int t=0;t<5;t++)
		{
			//System.out.println("runnable");
			System.out.println(t);
		}
	}
	
}
