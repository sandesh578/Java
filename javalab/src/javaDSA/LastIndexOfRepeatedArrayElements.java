package javaDSA;

import java.util.Scanner;

class LastIndexOfRepeatedArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner.nextLine());
        int value = scanner.nextInt();

        int index = findIndex(numbers, value);
        System.out.println(index);
        scanner.close();
    }

    static int findIndex(int[] numbers, int value) {
        int x=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==value)
            {
                x=i;
            }
        }
        return x;
    }

    // utility class for parsing int[], do not change it
    private static int[] readArray(String line) {
        String[] strings = line.trim().split(" ");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int searchIndexOfLastOccurrence(int[] numbers, int value) {
        if(numbers.length==0)
        {
            return -1;
        }
        else
        {
            for(int i=numbers.length-1;i>=0;i--)
            {
                if(numbers[i]==value)
                {
                    return i;
                }
            }
            return -1;
            
        }
    }

    // Do not change code below 
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] numbers;
        final int k;
        if (scanner.hasNextInt()) {
            numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            k = Integer.parseInt(scanner.nextLine());
        } else {
            numbers = new int[0];
            k = 10;
        }
        System.out.println(searchIndexOfLastOccurrence(numbers, k));
    }
}

*/