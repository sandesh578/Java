import java.io.*;
public class bufferreaderclassex {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("Enter two numbers:");
        a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println(+c);

	}

}
