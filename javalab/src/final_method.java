class SuperFinal{
	final void method()//this method cannot be overriden or redefined in child or sub class
	{
		System.out.println("Hello dude");
	}
}
class childClass extends SuperFinal{
	void method1()
	{
		System.out.println("Bye");
	}
}
public class final_method {

	public static void main(String[] args) {
		childClass c=new childClass();
		c.method();
		c.method1();

	}

}
