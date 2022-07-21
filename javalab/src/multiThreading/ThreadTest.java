package multiThreading;
class MyThreads extends Thread{
	public MyThreads(String name)
	{
		super(name);
		//setPriority(Thread.MAX_PRIORITY);
	}
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println(i+" count");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			i++;
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
     MyThreads t=new MyThreads("My Thread1");
     t.start();
     t.interrupt();
//    System.out.println("Id:"+t.getId());
//    System.out.println("Name:"+t.getName());
//    System.out.println("Priority:"+t.getPriority());
//    t.start();
//    System.out.println("State:"+t.getState());
//    System.out.println("Alive:"+t.isAlive());
	}
}
