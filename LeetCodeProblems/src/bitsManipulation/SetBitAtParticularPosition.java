package bitsManipulation;

public class SetBitAtParticularPosition {

	public static void main(String[] args) {
		int n=5;//0101
		int pos=3;//set bit 1 at pos 3 
		int BitMask=1<<pos; //0001<<3 -> 1000
		
		//set operation
		int operation=(BitMask | n);//1101 -> 13
		System.out.println(operation);
	}

}
