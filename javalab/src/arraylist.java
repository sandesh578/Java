import java.util.ArrayList;
import java.util.Collections;
//Arraylist is used when you need rapid access to data
public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Audi");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Ferarri");
		cars.add("Lamborgini");
		cars.add("Mustang");
		int n=cars.size();
		
		cars.remove(3);
		int p=cars.size();
		
		
		System.out.println(cars);
		System.out.println(n);
		System.out.println(p);
		System.out.println(cars.get(0));
		
		Collections.sort(cars);//Arraylist can be sorted by importing collections method
		System.out.println(cars);
	}

}
