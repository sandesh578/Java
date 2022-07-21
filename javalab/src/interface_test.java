interface Test1{
	void method1();//by default public and abstract
	void method2();
}
class Test2 implements Test1//concreate class
{
	public void method1()
	{
		System.out.println("Method1 of class test2");
	}
	public void method2()
	{
		System.out.println("Method2 of class test2");
	}
	void method3()
	{
		System.out.println("Method3 of class test2");
	}
}
public class interface_test {
    
	public static void main(String[] args) {
		// we can't create object of interface because its is a collection of abstract method and abstract class
		Test1 t=new Test2();
		t.method1();//dynamic method dispatch
		t.method2();//Run time polymorphism or overriding
        //t.method3();  We cant implement this because interface doesnot know aboutthis method
	}

}
