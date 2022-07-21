package towerOfHanoi;

public class TowerOfHanoi {
	public static void TOH(int n,int A,int B,int C) {
		if(n>0) {
			TOH(n-1,A,C,B);
			System.out.printf("From %d to %d \n",A,C);
			TOH(n-1,B,A,C);
		}
	}

	public static void main(String[] args) {
		TOH(3,1,2,3);
	}

}
