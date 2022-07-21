
public class Mathclass {

	public static void main(String[] args) {
		System.out.println(Math.PI);
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-4));
        System.out.println(Math.min(3,7));
        System.out.println(Math.max(3,7));
        
        
        System.out.println(Math.sqrt(-1));//Nan
        System.out.println(0/0.0);//Nan
        
        System.out.println(5/0.0);//Infinity
        System.out.println(5/-0.0);//-Infinity
        
        System.out.println(Math.random()*100);
        System.out.println(Math.round(5.67));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.ceil(9.2));

	}

}
