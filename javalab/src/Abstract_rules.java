abstract class Superclass{
	abstract void method1();//if body is empty it must be given abstract keyword
	//abstract class and method cannot be made final 
	//final as final classes cannot be extended
	//if any method inside class is abstract the class becomes abstract
	//abstract metod cannot be static,its illegal
}
//concreate class
class Child extends Superclass{
	//abstract method of super class must be overridden in child class
	//otherwise the child class also becomes abstract
	void method1()
	{
		System.out.println("Overriden method of abstract class");
	}
}
public class Abstract_rules {
   public static void main(String[] args)
   {
	   Superclass s=new Child();//we can have references of abstract class
	   //But we cannot create object of abstract class
	   s.method1();
   }
}
