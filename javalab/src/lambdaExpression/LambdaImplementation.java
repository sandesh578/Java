package lambdaExpression;
@FunctionalInterface//functional interface must have single abstract method
interface MyLambda{
	//by default methods in interfaces are abstract and public
	//if a interface is having single abstract method it is known as functional interafces
	public void display();
}
/*class My implements MyLambda{
	public void display()
	{
		System.out.println("Sandesh Parajuli");
	}
}*/
public class LambdaImplementation {

	public static void main(String[] args) {
		MyLambda m=()->
			{
				System.out.println("Sandesh Parajuli");
			};
       m.display();
	}

}
