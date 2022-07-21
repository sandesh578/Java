import java.util.function.Function;
public class function_interface {
    protected static class Mymath{
    	public static Integer displaytriple(int x)
    	{
    		return x*3;
    	}
    }
	public static void main(String[] args) {
		
		Function<Integer,Integer> myfunc=Mymath::displaytriple;
		System.out.println(myfunc.apply(5));
		
	}

}
