package annotations;

import java.util.List;

class OldClas
{
	public void display()
	{
		System.out.println("Hello");
	}
	
	@Deprecated
	public void show()
	{
		System.out.println("Hi");
	}
}
public class SuppressWarningDemo {
	static List l;
	//@SuppressWarnings("deprecation")
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	  l.add(10);
      OldClas oc=new OldClas();
      oc.show();
	}

}
