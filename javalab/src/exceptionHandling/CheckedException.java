package exceptionHandling;
import java.io.FileInputStream;
public class CheckedException {
    static void fun1()
    {
    	try
    	{
    		FileInputStream ff=new FileInputStream("helo.txt");
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);

    	}
    }
    static void fun2()
    {
    	fun1();
    }
    static void fun3()
    {
    	fun2();
    }
	public static void main(String[] args) {
		
      fun3();
	}

}
