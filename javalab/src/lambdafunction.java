import java.util.function.Function;
public class lambdafunction {

	public static void main(String[] args) {
		Function<Integer,Integer> myfunc=(x)->x*x;
		System.out.println(myfunc.apply(5));
		
		Function<String,Integer> result=(str)->str.length();
		System.out.println(result.apply("Sandesh"));
		
		Function<Integer,Integer> myfunc2=(x)->
		{
			if(x<0)
			{
				return -x;
			}
			else
			{
				return x;
			}
		};
		System.out.println(myfunc2.apply(100));
	}

}
