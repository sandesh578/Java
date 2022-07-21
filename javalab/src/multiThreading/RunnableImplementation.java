package multiThreading;
//Ex Horse pulling caravan
//here horse is thread class and caravan is runnable interfaces
class MyRunnable implements Runnable{
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println(i+" Hello");
			i++;
		}
	}
}
public class RunnableImplementation {
	public static void main(String[] args) {
		MyRunnable m=new MyRunnable();
		//thread runs process so my class is assigned to thread
		Thread t=new Thread(m);
		t.start();
		int i=0;
		while(i<5)
		{
			System.out.println(i+" Sandesh");
			i++;
		}

	}

}
