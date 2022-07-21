abstract class Bird{//we cannot create object of abstract class we can only give references
	public int flying_height;
	abstract void heigthdetails();//abstract method is a method without body or empty one
	//if any one method inside a class is abstract you must definitely make that class abstract
	Bird(int h)
	{
		this.flying_height=h;
	}
	public void features()
	{
		System.out.println("Features includes takeoff,land stabilize and many more");
	}
}
//concreate class
class Eagle extends Bird{
	Eagle(int h)
	{
		super(h);
	}
	@Override
	void heigthdetails() {
		System.out.println("Eagle can fly upto the height of "+flying_height);
		
	}

}
class Swan extends Bird{
	Swan(int h)
	{
		super(h);
	}
	@Override
	void heigthdetails() {
		System.out.println("Swan can fly upto the height of "+flying_height);
	}
}
public class abstract_class {

	public static void main(String[] args) {
		Swan s=new Swan(500);
        s.heigthdetails();
        Eagle e=new Eagle(10000);
        e.heigthdetails();
        e.features();
	}

}
