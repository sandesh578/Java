package lab10;

import java.util.Scanner;

interface permutation{
    public double getPermutation();
}
interface combination{
    public double getCombination();
}
interface NPRnNCR extends permutation, combination{

}
class Demo implements NPRnNCR{
    static Scanner sc= new Scanner(System.in);
    double num;
    double r;

    public Demo(double num, double r){
        this.num = num;
        this.r = r;
    }

    public double getFactorial(double n){
        double ans = 1;
        while(n>1){
            ans *= n;
            n--;
        }
        return ans;
    }
    
    public double getPermutation(){
        double x = getFactorial(num);
        double y =getFactorial(num-r);
        return (x/y);
    }
    
    public double getCombination(){
        double x = getFactorial(num);
        double y = getFactorial(r);
        double z = getFactorial(num-r);
        return x/(y*z);
    }
}
public class PermutationAndCombination{
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and r of the combination: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Demo obj = new Demo(x,y);
        
        System.out.println("Permutation of n and r : "+ obj.getPermutation());
        System.out.println("Combination of n and r : "+ obj.getCombination());
        sc.close();
    }
}