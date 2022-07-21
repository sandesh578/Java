package exceptionHandling;
import java.io.FileInputStream;
import java.util.Scanner;

public class TryCatchWithResources {
    public static FileInputStream fi;
    static Scanner sc;
    public static void Divide() throws Exception
    {
    	
    	fi=new FileInputStream("C:\\Users\\KIIT\\Documents\\prog.txt");
    	sc=new Scanner(fi);
    	try {
    		int a=sc.nextInt();
        	int b=sc.nextInt();
        	int c=sc.nextInt();
        	System.out.println(a/c);	
    	}
    	finally
    	{
    		fi.close();
    		sc.close();
    	}
    	
    }
    
	public static void main(String[] args) {
		try
		{
			Divide();
		}
        catch(Exception e)
		{
        	System.out.println(e);
		}
	}

}
