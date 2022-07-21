package webTechExam;
class forest{
	double area_insq_cm;
	int count_of_Animals;
	public forest()
	{
		area_insq_cm=0;
		count_of_Animals=0;
	}
	public forest(double area_insq_cm,int count_of_Animals)
	{
		this.area_insq_cm=area_insq_cm;
		this.count_of_Animals=count_of_Animals;
	}
	public void display()
	{
		System.out.println("Area of forest is:"+area_insq_cm);
		System.out.println("Number of animals is:"+count_of_Animals);
	}
}
public class forestArea {

	public static void main(String[] args) {
		forest f1=new forest(332,2500);
		forest f2=new forest(300,2000);
		f1.display();
		f2.display();
		if((f1.count_of_Animals/f1.area_insq_cm)<(f2.count_of_Animals/f2.area_insq_cm))
		{
			System.out.println("Forest 1 is having less space per animal");
		}
		else
		{
			System.out.println("Forest 2 is having less space per animal");
		}
	}

}
