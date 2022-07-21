//final is just like const keyword in c and c++
//final can be used with variables,method,classes
//final represents constant i.e they cannot be changed/modified once a value is assigned
//final variables are written in capital letters
//initialization can be done inside constructor,static block,direct initialization

class MyFinal{
	final int MIN=1;
	final static int NORMAL;
	final int MAX;
	static
	{
		NORMAL=40;
	}
	MyFinal()
	{
	  MAX=80;	
	}
}
public class final_example {

	public static void main(String[] args) {
		MyFinal m=new MyFinal();
        System.out.println(m.MIN);
        System.out.println(m.MAX);
        System.out.println(MyFinal.NORMAL);
	}

}
