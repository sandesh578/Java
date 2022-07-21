package sortingAlgo;
class Base{
	int a;
	int b;
	public Base(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Derived extends Base{
	int c;
	public Derived(int a,int b,int c)
	{
		super(a,b);
		this.c=c;
	}
	public void max()
	{
		if(a>b&&a>c)
		{
			System.out.println("Maximum Nmber is:"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Maximum Nmber is:"+b);
		}
		else
		{
			System.out.println("Maximum Nmber is:"+c);
		}
	}
	public void min()
	{
		if(a<b&&a<c)
		{
			System.out.println("Minimum Nmber is:"+a);
		}
		else if(b<a&&b<c)
		{
			System.out.println("Minimum Nmber is:"+b);
		}
		else
		{
			System.out.println("Minimum Nmber is:"+c);
		}
	}
}
public class Testing {

	public static void main(String[] args) {
		Derived obj=new Derived(5,2,9);
		obj.max();
		obj.min();

	}

}
