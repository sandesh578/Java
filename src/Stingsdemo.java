
public class Stingsdemo {

	public static void main(String[] args) {
		System.out.println("Sandesh Parajuli");
		String str="Sandesh";
		System.out.println(str.length());
		System.out.println(str.contains("des"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.isEmpty());
		System.out.println(str.startsWith("s"));
		System.out.println(str.endsWith("h"));
		System.out.println(str.replace("esh","esp"));
		System.out.println(str.trim());
		System.out.println(str.strip());
		System.out.println(str.split("d"));
		System.out.println(str.charAt(1));
		System.out.println(str.toCharArray());
		System.out.println(str.getBytes());
		System.out.println(str.substring(0,4));
		
		String str1="SAndy";
		String str2="Sandy";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("Hello"=="Hello");
		System.out.println("Hello"!="Hello");
	}

}
