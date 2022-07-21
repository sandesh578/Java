package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class upper
{
    public static String changeStringCase(String arr1)
    {
        String str2 ="";
        //Character c;
        for(int index = 0 ;index<arr1.length(); index++)
        {
            Character c = arr1.charAt(index);
            if((int)c>=65 && (int)c<=90)
            {
                str2 += String.valueOf(c).toLowerCase();
            }
            else if((int)c>=91&&(int)c<=122) //48 to 57 from numbers , 65 to 90 for upperchar and  97 to 122 for lower char
            {
                str2 += String.valueOf(c).toUpperCase();
            }
            else
            {
                str2 += String.valueOf(c);
            }
        }
        return str2;
    }

    public static void main(String[] args) throws IOException
     {
        File f1 = new File("C:\\Users\\KIIT\\Desktop\\first.txt");
        File f2 = new File("C:\\Users\\KIIT\\Desktop\\second.txt");
       // FileInputStream f1 = new FileInputStream("firstFile.txt");
        if(!f1.exists())
        {
            f1.createNewFile();
        }
        if(!f2.exists())
        {
            f2.createNewFile();
        }
        System.out.println("Enter the sentence for file1.");
        Scanner sc  = new Scanner(System.in);
        String sentence = sc.nextLine();
        FileOutputStream fout1 = new FileOutputStream(f1);
        char charArray1[] = sentence.toCharArray();
        for(int i = 0 ; i<charArray1.length;i++)
        {
            fout1.write(charArray1[i]);
        }

        FileInputStream fin1 = new FileInputStream(f1);
        int ischarAvailable ;
        String str1 = "";
        do
        {
            ischarAvailable =fin1.read();
            if(ischarAvailable!=-1)
            {
                str1+= String.valueOf((char)ischarAvailable);
            }
        }while(ischarAvailable!=-1);
        String str2 = changeStringCase(str1);
        FileOutputStream fout2 = new FileOutputStream(f2);
        char charArray2[] = str2.toCharArray();
        for(int i = 0 ;i<charArray2.length;i++)
        {
            fout2.write(charArray2[i]);
        }
        
    }
}