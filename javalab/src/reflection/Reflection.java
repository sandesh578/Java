package reflection;
//import java.lang.reflect
//reflection is used get the information or the defination of the class
class My{
	private int x;
	protected int p=8;
	public int y=22;
	My(){}
	My(int x,int y){}
	public int show(int x) {return 0;};
}

public class Reflection {

	public static void main(String[] args) {
		Class m=My.class;
        System.out.println(m.getName());
	}

}
