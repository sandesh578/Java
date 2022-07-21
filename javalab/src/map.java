import java.util.HashMap;
import java.util.Map;
public class map {

	public static void main(String[] args) {
		Map<String, Integer> fruits= new HashMap<String, Integer>();
		fruits.put("Apple",3);
		fruits.put("Banana",2);
		fruits.put("Orange",7);
		fruits.put("Gauva",5);
		fruits.remove("Orange");
		int n=fruits.size();
		
		System.out.println(fruits);
		System.out.println(n);
		System.out.println(fruits.get("Banana"));
	}

}
