package ioStreams;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		try(FileWriter fw=new FileWriter("C:\\Users\\KIIT\\Documents\\test2.txt");)
		{
			String str="Hello I am Sandesh Parajuli";
			fw.write(str);
            
			fw.close();
		}

	}

}
