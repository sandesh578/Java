package multiThreading;
class MyThred extends Thread{
	
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println(i+" count");
			i++;
		}
	}
}
public class Threadtests {

	public static void main(String[] args) {
     MyThred t=new MyThred();
     t.setDaemon(true);
     t.start();
//     Thread mainThread=Thread.currentThread();
//     mainThread.join();
     int i=0;
		while(i<5)
		{
			System.out.println(i+" Sandesh");
			//Thread.yield();
			i++;
		}
	}
}
