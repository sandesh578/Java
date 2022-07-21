package bitsManipulation;

public class ClearBitAtParticularPosition {

	public static void main(String[] args) {
		int n=5;//0101
		int pos=2;//clear bit 1 at pos 2
		int BitMask=1<<pos; //0001<<2 -> 0100
		int Not = ~ BitMask;//Not Operation //1011
		
		//clear bit operation
		int operation=(Not & n);//0001 -> 1
		System.out.println(operation);
	}

}
