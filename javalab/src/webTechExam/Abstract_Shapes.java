package webTechExam;
abstract class Shape{
	abstract void display();
}
class TwoD extends Shape{
	void display()
	{
		System.out.println("2D Images");
	}
}
class ThreeD extends Shape{
	void display()
	{
		System.out.println("3D Images");
	}
}
public class Abstract_Shapes {

	public static void main(String[] args) {
		TwoD ob1=new TwoD();
		ob1.display();
		
		ThreeD ob2=new ThreeD();
		ob2.display();

	}

}
