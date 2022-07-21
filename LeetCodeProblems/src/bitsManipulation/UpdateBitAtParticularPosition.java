package bitsManipulation;

public class UpdateBitAtParticularPosition {

	public static void main(String[] args) {
		int n=5;//0101
		int pos=2;//update bit 1 at pos 2 to 0
		int BitMask=1<<pos; //0001<<2 -> 0100
		int Not = ~ BitMask;//Not Operation //1011
		
		//update bit to 0 from 1 operation
		int operation=(Not & n);//0001 -> 1
		System.out.println(operation);
		
		//update bit to 1 from 0 operation
		pos=1;//update bit 0 at pos 2 to 1
		BitMask=1<<pos;//0001<<1 -> 0010
		operation= BitMask | n; // 0010 | 0101 ->0111 -> 7
		System.out.println(operation);
	}

}
