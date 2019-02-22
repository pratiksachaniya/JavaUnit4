class Calc implements Runnable
{
	public void run()
	{
		int sum = 0;
		for(int i = 1; i  <= 10; i++)
		{
			sum += i;
		}
		System.out.println("Sum: " + sum);
		sum = 0;
		for(int i = 11; i <= 20; i++)
		{
			sum += i; 
		}
		System.out.println("Avg: " + sum/10);
		
	}
}
class MainClass
{
	public static void main(String[] ar)
	{
		Calc  c1 = new Calc();
		Calc  c2 = new Calc();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
			System.out.println("Task Completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}