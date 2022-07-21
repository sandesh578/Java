//Java is a multi threaded programming language
//We can sub divide operations so that they can run in parallel
//Thread can be created by inheriting from thread class
class Loader extends Thread{
	public void run()
	{
		System.out.println("Hello");
	}
}
public class Thread_Exmples {

	public static void main(String[] args) {
		Loader obj=new Loader();
		obj.start();

	}

}
