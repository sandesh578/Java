class Animal{
	public void move()
	{
		System.out.println("Animals can move");
	}
}
class Dog extends Animal{
	public void move()
	{
		System.out.println("Dogs can move");
	}
	public void bark()
	{
		System.out.println("Dogs can bark");
	}
}
public class TCPExam {

	public static void main(String[] args) {
		Animal a=new Animal();
		Animal b=new Dog();
		a.move();
		b.move();
		b.bark();//parent class cannot take reference to method that is not present in basse class

	}

}
