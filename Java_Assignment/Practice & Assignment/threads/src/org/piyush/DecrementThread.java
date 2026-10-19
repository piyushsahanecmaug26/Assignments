package org.piyush;

public class DecrementThread extends Thread {
	Counter c;
	DecrementThread(Counter c){
		this.c=c;
	}

	@Override
	public void run()
	{
		char arr[] = {'A','B','C','D','E'};
		System.out.println("decrement running ");
		for(int tmp =0;tmp<5;tmp++)
		{
			System.out.println(arr[tmp]);
			System.out.println(tmp);
			c.increment();
			
		}
	}
}
