class fybca implements Runnable
{
	public void run()
	{
		for(int i =0; i<4; i++)
		System.out.println("fybca");
	}
}

class sybca implements Runnable
{
	public void run()
	{
		for(int i =0; i<6; i++)
		System.out.println("sybca");
	}
}

class BcaThread
{
	public static void main(String[] ar)
	{
		fybca f = new fybca();
		sybca s = new sybca();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(s);
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
			System.out.println("tybca");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}