abstract class KFC{
	KFC()
	{
		System.out.println("Constructor of KfC");
	}
	void makeItems()
	{
		System.out.println("KFC items menu");
	}
	abstract void billing();
	abstract void offer();
}
class myKFC extends KFC
{
	//abstract method of KFC class must be compulsurorily declared in child class
	myKFC()
	{
		System.out.println("Constructor of  myKFC");
	}
	void billing()
	{
		System.out.println("Billing is done by owner");
	}
	void offer()
	{
		System.out.println("Offer is given by owner");
	}
	public void festivOffer()
	{
		System.out.println("Festive Offer is given by owner");
	}
}
public class Abstract_kfc {

	public static void main(String[] args) {
		KFC k=new myKFC();//object of abstract class cannot be created but it can be referenced
        k.makeItems();
		k.billing();
		k.offer();
		myKFC m=new myKFC();
		m.festivOffer();
	}

}
