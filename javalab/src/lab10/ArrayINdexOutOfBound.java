package lab10;

public class ArrayINdexOutOfBound {

	public static void main(String[] args) {
		int arr[]= {0,3,2,7,9,4};
		try
		{
			System.out.println(arr[7]);
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	System.out.println(e);
		}
	}

}
