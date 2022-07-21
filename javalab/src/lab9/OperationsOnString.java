package lab9;

public class OperationsOnString {

	public static void main(String[] args) {
		String str=new String("Sandesh");
		String str1="Parajuli";
		System.out.println("Comparison:"+str.compareTo(str1));
		System.out.println("To Uppercase:"+str.toUpperCase());
		System.out.println("To Lowercase:"+str.toLowerCase());
		StringBuffer sb=new StringBuffer(str);
		sb.insert(sb.length(),str1);
		System.out.println("After insertion:"+sb);
		sb.reverse();
		System.out.println("Reverse:"+sb);
	}

}
