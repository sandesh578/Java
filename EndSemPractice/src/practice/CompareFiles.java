package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CompareFiles {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		File file1=new File("source.txt");
		File file2=new File("destination.txt");
        
		if(!file1.exists())
		{
			file1.createNewFile();
		}
		
		if(!file2.exists())
		{
			file2.createNewFile();
		}
		
		System.out.println("Enter the sentence for file1:");
		String str=scan.nextLine();
		
		FileOutputStream fout1=new FileOutputStream(file1);
		char[] arr=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			fout1.write(arr[i]);
		}
		
		FileInputStream fin1=new FileInputStream(file1);
		int isCharAvailable;
		do {
			isCharAvailable=fin1.read();
			
		}while(isCharAvailable!=-1);
		scan.close();
	}

}
