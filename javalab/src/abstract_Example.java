abstract class Super{
	Super()
	{
		System.out.println("Construtor of super class");
	}
	void method1()
	{
		System.out.println("Super method1");
	}
	abstract void method2();//if any method is abstract in any class the class also becomes abstract
}
class Sub extends Super{
	void method2()//overriding
	{
		System.out.println("Method1 of sub class sub");
	}
}
public class abstract_Example {

	public static void main(String[] args) {
		Sub s=new Sub();
		s.method1();
		s.method2();

	}

}
