//Only one object can be created and used in singleton class
class CoffeeMachine{
	private float coffeeqty;
	private float milkqty;
	private float waterqty;
	private float sugarqty;
	static private CoffeeMachine our=null;
	private CoffeeMachine()//we cannot create new object of coffeeMachine as it is private
	{
		coffeeqty=1;
		waterqty=2;
		milkqty=1;
		sugarqty=1;
	}
	public static CoffeeMachine getInstance() {
		if(our==null)
		{
			our=new CoffeeMachine();
		}
		return our;
	}
	public void getCoffee()
	{
		System.out.println(coffeeqty+waterqty+milkqty+sugarqty);
	}
}
public class Singleton_Class {

	public static void main(String[] args) {
		CoffeeMachine c= CoffeeMachine.getInstance();
		c.getCoffee();
		CoffeeMachine d= CoffeeMachine.getInstance();
		if(c==d)
		{
			System.out.println("Same");
		}
	}

}
