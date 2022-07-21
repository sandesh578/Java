package lab7;
class A{
	public void display()
	{
		System.out.println("Hello coder");
	}
}
class B extends A{
	public void display()
	{
		System.out.println("How you doing?");
	}
}
class C extends A{
	public void display()
	{
		System.out.println("Keep on giving your best.");
	}
}
public class dynamicMethodDispatch {

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		A ref;
		ref=obj1;
		ref.display();
		ref=obj2;
		ref.display();
		ref=obj3;
		ref.display();

	}

}
