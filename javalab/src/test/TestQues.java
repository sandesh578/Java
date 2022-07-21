package test;
interface A{
	public void MethodA();
}
interface B{
	public void MethodB();
}
class C implements A,B{
	public void MethodA()
	{
		System.out.println("Method A");
	}
	public void MethodB()
	{
		System.out.println("Method B");
	}
}
public class TestQues {

	public static void main(String[] args) {
		C obj=new C();
		obj.MethodA();
		obj.MethodB();

	}

}
