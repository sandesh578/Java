import java.util.function.BiFunction;
public class bifunction {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> myfunc2=(x,y)->x*y;
		System.out.println(myfunc2.apply(5,10));
		
	}

}
