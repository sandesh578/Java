import java.util.Scanner;
public class frequencyof_char_instring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.nextLine();
		char sen[]=str.toCharArray();
		int freq[]=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(sen[i]==sen[j])
				{
					freq[i]++;
				}
				sen[j]='0';
			}
		}
		System.out.println("Characters and their corresponding frequency is:");
		for(int i=0;i<freq.length;i++)
		{
			if(sen[i]!=' '&&sen[i]!='0')
			{
				System.out.println(sen[i]+"-"+freq[i]);
			}
		}
		scanner.close();

	}

}
