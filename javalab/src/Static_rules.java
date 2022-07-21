//Static keyword is used for  representing metadata(data about data)
//it is used for representing the information about class not about object
//static member is shared by all the objects of class
//static data members belong to class
//static variables are created in method area
//static method can only access static members(variables or method) it cannot access non static memebers
//we cannot use this and super keyword inside static methods as it represents a instance
//Non static member of class can access static member of a class
class HondaCity{
    static long price=10;
	int a,b;
    public static double OnRoadPrice(String city){
	    switch(city)
	    {
	     case "delhi":
	    	   return price+price*0.1;
	   
	     case "mumbai":
		    	return price+price*0.09;
		 default:
			 return price;
		
	    }
    }
   
}
public class Static_rules {

	public static void main(String[] args) {
//		HondaCity h1=new HondaCity();
//		HondaCity h2=new HondaCity();
//		System.out.println(h1.price);
//		System.out.println(h2.price);
        System.out.println(HondaCity.price);//static member can be accessed with the help of the class directly
        System.out.println(HondaCity.OnRoadPrice("delhi"));
	}

}
