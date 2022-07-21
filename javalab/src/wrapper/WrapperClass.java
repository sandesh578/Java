package wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		//Any type of data can be converted to different data type using wrapper classes
		Integer i=new Integer(5);
		Integer a=Integer.valueOf(10);
		Integer p=10;
		System.out.println(a.equals(p));//checks if values are same
		Integer n1=Integer.valueOf("1010",2);//we can also mention the number type like binary octal
		System.out.println(n1);
		
		Integer n2=Integer.valueOf("A7",16);//hexadecimal number
		System.out.println(n2);
		
		System.out.println(Integer.parseInt("20"));
		System.out.println(Integer.reverse(102));
		System.out.println(Integer.toBinaryString(10));
		
		Byte b=15;
		Byte x=Byte.valueOf(b);
		Byte r=new Byte("15");
		
        Short s=new Short("123");
        
        Float f=Float.valueOf(12.69000f);
        Float k=(12.5f/0);
        System.out.println(k.isInfinite());
        
        Float v=(float)Math.sqrt(-1);
        System.out.println(v.isNaN());
           zx
        Double d=Double.valueOf("12.69000f");
        
        Character c=Character.valueOf('C');
        
        Boolean o=Boolean.valueOf("true");
        
        
        int g=3;
        //Boxing-Primitive is assigned to object
        Integer h=Integer.valueOf(g);
        //AutoBoxing
        Integer j=g;
        
        //AutoUnboxing
        int q=h;
        
        //Unboxing-object is assigned to primitive
        int z=h.intValue();
	}

}
