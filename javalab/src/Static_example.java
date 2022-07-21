class Test{
	static int x=10;
	int y=20;
	void show()
	{
		System.out.println("x="+x+" "+"y="+y);//static member can be accessed by non static method
	}
	void display()
	{ 
		System.out.println("x="+x);
	}
	
}
public class Static_example {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();
		t1.display();
		Test t2=new Test();
		Test.x=50;
		t2.show();
		t2.display();
		t1.display();//Only single copy of member is created using static keyword
	}

}
