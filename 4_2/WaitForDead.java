class Loop extends Thread
{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.print('X');
			try
			{
				sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class WaitForDead
{
	public static void main(String[] ar)
	{
		Loop l1 = new Loop();
		Loop l2 = new Loop();
		Loop l3 = new Loop();
		Loop l4 = new Loop();
		Loop l5 = new Loop();
		
		l1.start();
		l2.start();
		l3.start();
		l4.start();
		l5.start();
		
		try
		{
			l1.join();
			l2.join();
			l3.join();
			l4.join();
			l5.join();
			System.out.println("\nHello");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
