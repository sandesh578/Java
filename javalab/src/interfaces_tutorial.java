interface Camera{
	void displaycam();
}
interface Battery{
	void displaybatt();
}
class Phone implements Camera,Battery{
	public void displaycam()
	{
		System.out.println("Camera is:Sony");
	}
	public void displaybatt()
	{
		System.out.println("Camera is:Samsung");
	}
	public void displaybrand()
	{
		System.out.println("Brand is:Iphone");
	}
}
public class interfaces_tutorial{
    public static void main(String[] args)
    {
    	Phone ph=new Phone();
    	ph.displaycam();
    	ph.displaybatt();
    	ph.displaybrand();
    }
}
