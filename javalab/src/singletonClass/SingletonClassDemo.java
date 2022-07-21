package singletonClass;
//Single object can be created incase of singleton class 
class CoffeeMachine {
	private float coffeeQty;
	private float waterQty;
	private static CoffeeMachine our=null;
	//constructor are made private
	private CoffeeMachine(){
		this.coffeeQty=10.2f;
		this.waterQty=5.0f;
	}
	public static CoffeeMachine getInstance() {
		if(our==null) {
			our=new CoffeeMachine();
			return our;
		}else {
			return our;
		}
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {
		CoffeeMachine cm=CoffeeMachine.getInstance();
		CoffeeMachine cm1=CoffeeMachine.getInstance();
        System.out.println(cm+" "+cm1);
	}

}
