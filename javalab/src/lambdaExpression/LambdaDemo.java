package lambdaExpression;
@FunctionalInterface
interface Lambda{
	//public void display(String s);
	//public int add(int x,int y);
	public void show(String s,int p);
}
public class LambdaDemo {
  public static void main(String[] args)
  {
//	  Lambda l=(s)->{
//		  System.out.println(s);
//	  };
//	  Lambda l=(x,y)->{ return (x+y); };OR
//	  Lambda l=(x,y)->(x+y);
//	  l.display("Sandesh Parajuli");
//	  System.out.println(l.add(30,50));
	  Lambda l1=(name,age)->{
		  System.out.println(name+" "+age);
	  };
	  l1.show("Sandesh",20);
  }
}
