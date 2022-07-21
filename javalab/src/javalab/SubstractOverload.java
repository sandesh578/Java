package javalab;

class Substract{
	public void substract(int a,int b) {
		System.out.println("Difference of "+a+" and "+b+" is:"+(a-b));
	}
	public void substract(double c,double d) {
		System.out.println("Difference of "+c+" and "+d+" is:"+(c-d));
	}
}
public class SubstractOverload {

	public static void main(String[] args) {
		Substract s=new Substract();
		s.substract(10,4);
		s.substract(5.6,2.9);

	}

}
