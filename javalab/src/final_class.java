//final class cannot be extended ,inherited or borrowed
//final class is freezed
final class Superhit{
	void method1()
	{
		System.out.println("Method of final class");
	}
}
public class final_class {

	public static void main(String[] args) {
		Superhit s=new Superhit();
		s.method1();

	}

}
