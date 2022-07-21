class Methods{
	String name="Sandesh";
	int age=20;
	void display()
	{
		System.out.println("I am "+name+" Parajuli and I am "+age+" year old.");
	}
}
public class Objects {

	public static void main(String[] args) {
		Methods obj1=new Methods();
		obj1.display();
        obj1.age=31;
        System.out.println(obj1.age);
	}

}
