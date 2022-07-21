package bitsManipulation;

public class GetBitFromParticularPosition {

	public static void main(String[] args) {
		int n=5;//0101
		int pos=3;//get bit at pos 3 i.e 0
		int BitMask=1<<pos; //0001<<3 -> 1000
		
		//get operation
		if((BitMask & n)==0) {
			System.out.println("Bit is zero");
		}else {
			System.out.println("Bit is one");
		}

	}

}
