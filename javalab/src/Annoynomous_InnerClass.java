abstract class My{
	abstract void display();
}

class OuterCls
{
	public void method()
	{
		My m=new My(){
			void display()
			{
				System.out.println("Hello World");
			}
		};
		m.display();
	}
}
public class Annoynomous_InnerClass {
   public static void main(String[] args)
   {
	   OuterCls o=new OuterCls();
	   o.method();
   }
}
