interface Computer{
	public void shutDown();
}
class Sphone{
	public void call()
	{
		System.out.println("Hello realme");
	}
}
public class anonymous_classes {

	public static void main(String[] args) {
		Computer obj1=new Computer()
		{
			public void shutDown()
			{
				System.out.println("Windows is shutting down");
			} 
		};
      obj1.shutDown();
      Sphone obj2=new Sphone()
     {
    	    @Override
			public void call()
			{
				System.out.println("Phone is shutting down");
			}  
     };
     obj2.call();
	}

}
