package multiThreading;
//if we are creating class and want multithreading we extends from thread class
//if we want o inherit from already threaded class we use runnable interfaces
//MultiThreading means performing multiple tasks simultaneously
//website where video is playing,animations are running ,games are example of multithreading
class MyThread extends Thread{
	//must override run method
	//run is the starting point of thread
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
public class ThreadImplementation {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		//for running a method we should call start method
		//start method in turn calls run method as a thread
		t.start();
		int i=0;
		while(i<5)
		{
			System.out.println(i+" Sandesh");
			i++;
		}

	}

}
