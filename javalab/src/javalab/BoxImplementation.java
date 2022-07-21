package javalab;
import java.util.Scanner;
abstract class Box{
	int length;
	int width;
	int height;
	public abstract void volume();
}
class demo extends Box{
	Scanner scan=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter length ,breadth and height:");
		length=scan.nextInt();
		width=scan.nextInt();
		height=scan.nextInt();
	}
	public void volume()
	{
		System.out.println("Volume of box is:"+(length*width*height));
	}
}
public class BoxImplementation {

	public static void main(String[] args) {
		demo d=new demo();
		d.input();
		d.volume();

	}

}
