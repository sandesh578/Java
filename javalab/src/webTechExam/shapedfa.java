package webTechExam;
abstract class Shaped{
	abstract public void draw();
	abstract public void erase();
}
class squared extends Shaped{
	public void draw() {
		System.out.println("Drawing square.");
	}
	public void erase() {
		System.out.println("Erasing square.");
	}
}
class triangled extends Shaped{
	public void draw() {
		System.out.println("Drawing triangle.");
	}
	public void erase() {
		System.out.println("Erasing triangle.");
	}
}
class circled extends Shaped{
	public void draw() {
		System.out.println("Drawing circle.");
	}
	public void erase() {
		System.out.println("Erasing circle.");
	}
}
public class shapedfa {

	public static void main(String[] args) {
		circled c=new circled();
		c.draw();
		c.erase();
		triangled t=new triangled();
		t.draw();
		t.erase();
		squared s=new squared();
		s.draw();
		s.erase();

	}

}
