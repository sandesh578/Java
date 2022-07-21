package lambdaExpression;

interface LambdaTest1{
	//interface with single abstract method is known as functional interface
	public void display(String str);
}

public class MethodReference {
	 public MethodReference(String str) {
		 System.out.println("Hello "+str.toUpperCase());
	 }
	 public static void reverse(String str) {
		 StringBuffer sb=new StringBuffer(str);
		 sb.reverse();
		 System.out.println("Reverse of "+str+" is "+sb.toString());
	 }
	 
	 public void print(String str) {
		 System.out.println("Hello "+str);
	 }
	  public static void main(String[] args)
	  {
		  //scope resolution
//		  LambdaTest1 t1=System.out::println;
//		  t1.display("Sandesh parajuli");
		  
		  //display function has become reverse
//		  LambdaTest1 t2=MethodReference::reverse;
//		  t2.display("Sandesh");
		  
//		  MethodReference mr=new MethodReference();
//		  //when method of the class is not static
//		  LambdaTest1 t3=mr::print;
//		  t3.display("Sandesh");
		  
		  //Constructor can also be assigned as reference
		  LambdaTest1 lt=MethodReference::new;
		  lt.display("Sandesh");
	  }
}
