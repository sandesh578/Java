class Encap{
	private String name;
	private int age;
	Encap(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name is:"+this.name);
		System.out.println("Age is:"+this.age);
	}
}
public class encapsulation_tutorial {

	public static void main(String[] args) {
		
      Encap obj=new Encap("Sandesh",20);
      obj.display();
	}

}
