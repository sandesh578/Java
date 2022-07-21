package multiThreading;

public class Test extends Thread{
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println(i+" Hello");
			i++;
		}
	}
	public static void main(String[] args) {
		Test p=new Test();
		p.start();
		int i=0;
		while(i<5)
		{
			System.out.println(i+" Sandesh");
			i++;
		}

	}

}
