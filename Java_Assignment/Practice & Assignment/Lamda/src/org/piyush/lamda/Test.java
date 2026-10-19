package org.piyush.lamda;

@FunctionalInterface
public interface Test 
{
	void test();
	
	default void show()
	{
		
	}
	static void display()
	{
		
	}
	private void internal()
	{
		
	}
}

interface SurfaceTest extends Test
{
	void ddeepTest();
}



