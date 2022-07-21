package webTechExam;
class Outer{
	int a=5;
	String str="hello";
	static class Inner{
		int p=10;
		//System.out.println("a="+a);
	}
	public void localInnerClass()
	{
		Inner i=new Inner();
		System.out.println("p="+i.p);
		System.out.println("str");
		System.out.println("a="+a);
	}
}
public class innerOuterClasses {

	public static void main(String[] args) {
		Outer o=new Outer();
        o.localInnerClass();
	}

}
