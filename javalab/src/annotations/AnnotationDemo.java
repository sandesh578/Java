package annotations;

class OldClass
{
	public void display()
	{
		System.out.println("Hello");
	}
	//deprecated means to reduce the use of show
	//we shold not use deprecated methods as they may be removed in future
	@Deprecated
	public void show()
	{
		System.out.println("Hi");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		
      OldClass oc=new OldClass();
      oc.show();
	}

}
