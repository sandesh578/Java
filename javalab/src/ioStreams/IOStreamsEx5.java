package ioStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamsEx5 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("a.txt");
		int a=7980;
		float b=10.5f;
		
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(a);
		dout.writeFloat(b);
		
		fout.close();
		
		FileInputStream fin=new FileInputStream("a.txt");
		
		DataInputStream din=new DataInputStream(fin);
		
		int x=din.readInt();
		float y=din.readFloat();
		
		System.out.println(x);
		System.out.println(y);
		
		fin.close();

	}

}
