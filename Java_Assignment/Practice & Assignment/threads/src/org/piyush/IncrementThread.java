package org.piyush;

public class IncrementThread extends Thread{
	Counter c;
	IncrementThread(Counter c){
		this.c=c;
	}
	
	@Override
	public void run() {
		System.out.println("Thread is runnning");
		
		
			for(int tmp =1;tmp<=5;tmp++)
			{
				System.out.println(tmp);
				c.increment();
			}
	
	}
}