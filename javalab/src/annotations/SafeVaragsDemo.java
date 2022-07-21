package annotations;

class My<T>
{
	@SafeVarargs//related to variable argument
	private void show(T...args)
	{
		for(T x:args)
		{
			System.out.println(x);
		}
	}
}
public class SafeVaragsDemo {

	public static void main(String[] args) {
		

	}

}
