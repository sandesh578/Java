package lab7;

class Plate{
	int length;
	int width;
	public Plate(int length,int width)
	{
		this.length=length;
		this.width=width;
		System.out.println("This is Plate class Constructor");
	}

}
class Box extends Plate{
	int length;
	int width;
	int height;
	public Box(int length,int width,int height)
	{
		super(length,width);
		this.height=height;
		System.out.println("This is Box class Constructor");
	}

}
class WoodBox extends Box{
	int length;
	int width;
	int height;
	int thick;
	public WoodBox(int length,int width,int height,int thick)
	{
		super(length,width,height);
		this.thick=thick;
		System.out.println("This is WoodBox class Constructor");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		WoodBox obj=new WoodBox(5,2,8,6);
	}

}
