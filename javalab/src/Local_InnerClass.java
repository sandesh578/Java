class Cube{
	void Display()
	{
		class InnerCls{
			void InnerDisplay()
			{
				System.out.println("Hello guys");
			}
		}
		
	//InnerCls i=new InnerCls();
	//i.InnerDisplay();
	new InnerCls().InnerDisplay();
	}
}
public class Local_InnerClass {

	public static void main(String[] args) {
		Cube obj=new Cube();
		obj.Display();

	}

}
