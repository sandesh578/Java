package webTechExam;
public class StringReverseUsingCLA {

	public static void main(String[] args) {
		if(args.length>0)
		{
			String str=args[0];
			int a=Integer.parseInt(args[1]);
			int b=Integer.parseInt(args[2]);
	        String str2=str.substring(a,b);
	        StringBuffer s=new StringBuffer("str2");
	        System.out.println("Reverse of "+str2+" is:"+s.reverse());	
		}
		else
		{
			System.out.println("Arguments not provided");
		}
	}

}
