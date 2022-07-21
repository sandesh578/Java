package javaDSA;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchInNextArray {

    public static int[] searchIndexes(int[] first, int[] second) {
        int arr[]=new int[first.length];
        for(int i=0;i<first.length;i++)
        {
            arr[i]=-1;
        }
        for(int i=0;i<first.length;i++)
        {
            for(int j=0;j<second.length;j++)
            {
                if(first[i]==second[j])
                {
                   arr[i]=j; 
                   break;
                }
            }
           if(arr[i]==-1)
           {
                arr[i]=-1;
           }
        }
        return arr;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(searchIndexes(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
        scanner.close();
    }
}
