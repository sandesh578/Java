package webTechExam;
interface Numbers{
	public int process(int x,int y);
}
class Sum implements Numbers{
	public int process(int x,int y)
	{
		return x+y;
	}
}
class Average implements Numbers{
	public int process(int x,int y)
	{
		return (x+y)/2;
	}
}
public class Numbers_Interface {

	public static void main(String[] args) {
	   Sum s=new Sum();
       Average a=new Average();
       System.out.println("Sum is:"+s.process(5,7));
       System.out.println("Average is:"+a.process(5,7));
	}

}
