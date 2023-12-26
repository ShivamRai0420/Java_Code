

class MyThreads extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Geekyshowsss
{
	public static void main(String args[]) {
		MyThreads t=new MyThreads();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}

