package webTechExam;
class Rational{
	int num;
	int denum;
	public Rational()
	{
		num=0;
		denum=0;
	}
	public Rational(int num,int denum)
	{
		this.num=num;
		this.denum=denum;
	}
	public void printRational()
	{
		System.out.println("Before invert:"+num+"/"+denum);
	}
	public void invert()
	{
		num=num+denum;
		denum=num-denum;
		num=num-denum;
		System.out.println("After invert:"+num+"/"+denum);
	}
}
public class RationalNumbers {

	public static void main(String[] args) {
		Rational r=new Rational(5,7);
        r.printRational();
        r.invert();
	}

}
