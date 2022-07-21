class A{
	void method()
	{
		System.out.println("This is method of class A");
	}
}
class B extends A{
	void method()
	{
		System.out.println("This is method of class B");
	}
}
class C extends A{
	void method()
	{
		System.out.println("This is method of class C");
	}
}
public class dynamic_method_dispatch {

	public static void main(String[] args) {
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		A ref;
		ref=ob1;
		ob1.method();
		ref=ob2;
		ref.method();
		ref=ob3;
		ref.method();

	}

}
