/*Write an application that starts two thread. First thread displays even numbers
in the range specified from the command line and second thread displays odd
numbers in the same range. Each thread waits for 300 milliseconds before
displaying the next numbers. The application waits for both the thread to finish
and then displays the message “Both threads completed”.*/

class Even extends Thread 
{
	int len;
	public void run()
	{
		int ev = 0;
		int i =1;
		while(ev != len)
		{
			if(i%2==0)
			{
				try
				{
					sleep(300);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println("even:" + i);
				ev++;	
			}
			i++;
		}
	}
	Even(int l)
	{
		len = l;
	}
}

class Odd extends Thread
{
	int len;
	public void run()
	{
		int od = 0;
		int i =1;
		while(od != len)
		{
			if(i%2!=0)
			{
				try
				{
					sleep(300);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println("Odd:" +i);
				od++;
			}
			i++;
		}
	}
	Odd(int l)
	{
		len = l;
	}
}

class ThreadDemo1st
{
	public static void main(String[] ar) throws  InterruptedException
	{
		int len = Integer.parseInt(ar[0]);
		Odd o = new Odd(len);
		Even e = new Even(len);
		
		
		o.start();
		e.start();
		
		try
		{
			o.join();
			e.join();
			System.out.println("Both threads completed");
		}
		catch(InterruptedException e1)
		{
			System.out.println(e1);
		}
			
	}
}