/*Object of Static inner class can be created outside the outer
 *  class and it is not necessary to create object of outer class
 */
class Outers{
	static int x=10;
	int y=20;
	static class Inners{
		void Display()
		{
			System.out.println("x="+x);//We can access only static member inside static class
			System.out.println("Y cant be printed as it is non static member");
		}
	}
}
public class Static_InnerClass {

	public static void main(String[] args) {
		Outers.Inners ob=new Outers.Inners();
        ob.Display();
	}

}
