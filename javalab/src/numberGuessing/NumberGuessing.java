package numberGuessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("|----------------------------------------------------|");
		System.out.println("|                                                    |");
		System.out.println("|           Welcome to Number Guessing Game          |");
		System.out.println("|                                                    |");
		System.out.println("|----------------------------------------------------|");
		System.out.println();
		System.out.println("Guess a number in between 1 and 50:");
		int n=scan.nextInt();
		int count=0;
		int high=50;
		int low=1,random;
		Random rand=new Random();
		random=rand.nextInt(high-low)+low;
		//System.out.println(random);
		if(n>=low&&n<=high)
		{
			while(true)
			{
				if(n==random)
				{
					System.out.println("|----------------------------------------------------|");
					System.out.println("|                                                    |");
					System.out.println("|           You Win!!!!!     Game Over!!!!!          |");
					System.out.println("|                                                    |");
					System.out.println("|----------------------------------------------------|");
					System.exit(0);
				}
				else
				{
					count++;
						System.out.println("Sorry you Failed!!");
						if(count==4)
						{
							System.out.println("Try is over!!");
							System.exit(0);
						}
						System.out.println("You can try Again!!\nEnter the guess number:");
						n=scan.nextInt();
						if(n>50&&n<1)
						{
							System.out.println("Number Out Of Range!!");
						}
				}
			}
		}
		else
		{
			System.out.println("Number Out Of Range!!");
		}
        scan.close();
	}

}
