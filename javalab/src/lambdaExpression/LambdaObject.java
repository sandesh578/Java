package lambdaExpression;

interface LambdaTest{
	public void display();
}
class useLambda{
	public void method1(LambdaTest l)
	{
		l.display();
	}
}
class Demos{
	public void method2()
	{
		useLambda u=new useLambda();
		//lambda expression can be passed as parameter but assigned to a object
		u.method1(()->{System.out.println("Sandesh");});
	}
}
public class LambdaObject {
  public static void main(String[] args)
  {
	  Demos d=new Demos();
	  d.method2();
  }
}
