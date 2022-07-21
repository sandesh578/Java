//Thread can be created by implementing runnable interface
class Load implements Runnable{
	public void run()
	{
		System.out.println("Hello");
	}
}
public class Thread_Example2 {

	public static void main(String[] args) {
		Thread obj=new Thread(new Load());
		obj.start();

	}

}
