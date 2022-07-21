package ioStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamsEx1 {

	public static void main(String[] args) throws IOException {
				
		ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
		
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
		
        byte b[]=bos.toByteArray();
		for(int x:b)
		{
			System.out.print((char)x);
		}
		
		//write to a file
		//bos.writeTo(new FileOutputStream("C:\\Users\\KIIT\\Documents\\file.txt"));
		
        bos.close();
	}

}


