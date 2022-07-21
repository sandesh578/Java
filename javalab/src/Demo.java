import java.util.Scanner;
class Box{
	private int length;
	private int breadth;
	private int height;
	private int vol;
	Box(int l,int b,int h)
	{
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	public void volume()
	{
		vol=length*breadth*height;
		System.out.println("Volume of box is:"+vol);
	}
}
public class Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length,width and height:");
		int l=scanner.nextInt();
		int b=scanner.nextInt();
		int h=scanner.nextInt();
		
		Box obj=new Box(l,b,h);
		obj.volume();
		scanner.close();

	}

}
