abstract class Hospital{
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}
class myHospital extends Hospital
{
	myHospital()
	{
		System.out.println("Constructor of class myHospital");
	}
	void emergency()
	{
		System.out.println("Emergency services in hospital");
	}
	void appointment()
	{
		System.out.println("Appointment conditions of hospital");
	}
	void billing()
	{
		System.out.println("Billing System  of hospital");
	}
	void admit()
	{
		System.out.println("Admit conditions of hospital");
	}
}
public class Abstract_hospital {

	public static void main(String[] args) {
		Hospital h=new myHospital();//reference of class hhospital
        h.emergency();
        h.billing();
        h.appointment();
        h.admit();
	}

}
