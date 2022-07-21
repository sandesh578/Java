class Outer{
	int x=10;
	//Inner class acts as member of outer class like global variable
	class Inner{
		int y=20;
		void DisplayInner()
		{
			System.out.print("x="+x);
			System.out.println("y="+y);
		}
	}
	//Inside outer class u can create object of inner class
	//outer class cannot access member of inner class directly unless it has created object
	void DisplayOuter()
	{
		Inner i=new Inner();
		i.DisplayInner();
		System.out.println("y="+i.y);
	}
}
public class Inner_Class {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.DisplayOuter();
		Outer.Inner i=new Outer().new Inner();//we can create inner class only after object of outer class is created
		i.DisplayInner();

	}

}
