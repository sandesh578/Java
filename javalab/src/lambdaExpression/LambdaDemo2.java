package lambdaExpression;
//Lambdas expression can have local variables also
//lambdas expression can access only those local variable which are final 
//or effictively final(i.e never modified inside method
//variables belonging to class can be accessed nad modified they need not to be final
interface Lambdas{
	public void display();
}
class Demo{
	int x=45;
	public void method1()
	{
		int count=2;//must be final or effictively final
		Lambdas l=()->{
			System.out.println(count);//cant modify count
			System.out.println("Hello "+(x++));
		};
		l.display();
	}
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.method1();

	}

}
