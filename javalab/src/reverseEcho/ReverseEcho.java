package reverseEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcho {

	public static void main(String[] args) throws IOException{
		
		ServerSocket ss=new ServerSocket(2000);
		Socket stk=ss.accept();
		
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        StringBuilder sb;
        String msg;
        do {
        	msg=br.readLine();
        	sb=new StringBuilder(msg);
        	sb.reverse();
        	msg=sb.toString();
        	ps.println(msg);
        }while(!msg.equals("dne"));
	}

}

class Client {

	public static void main(String[] args) throws IOException{
		
		Socket stk=new Socket("localhost",2000);
		
		BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
		
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        do {
        	msg=keyb.readLine();
        	ps.println(msg);
        	msg=br.readLine();
        	System.out.println("From server: "+msg);
        }while(!msg.equals("dne"));
	}

}
