class Mytest{
	static int s;
	static {//they are loaded by loader how we have declared in class
		System.out.println("Block 1");
		s=20;
	}
	static {//can only be accessed static variables and methods
		System.out.println("Block 5");
	}
}
public class Static_Block {
    static
    {
    	System.out.println("Block static");//this is loaded first so will be printed first
    }
	public static void main(String[] args) {
		Mytest m=new Mytest();//static block is loaded when class is loaded
        System.out.println(Mytest.s);
	}

}
