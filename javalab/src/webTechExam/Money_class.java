package webTechExam;
class money{
	double rupee;
	double paisa;
	public money()
	{
		paisa=0;
	}
	public double add(double rupee,double paisa)
	{
		return (rupee*100)+(paisa);
	}
	public double subtract(double rupee,double paisa)
	{
		return (rupee*100)-(paisa);
	}
}
public class Money_class {

	public static void main(String[] args) {
		
      money m=new money();
      System.out.println("Sum of paisa and rupee is:"+m.add(5,150)+" paisa");
      System.out.println("Difference of paisa and rupee is:"+m.subtract(5,150)+" paisa");
	}

}
