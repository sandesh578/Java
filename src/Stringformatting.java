
public class Stringformatting {

	public static void main(String[] args) {
		String morning="Good Morning";
		String afternoon="Hello buddy";
		
		System.out.printf("%s %s",morning,afternoon);
		
		String morn="Good Morning %s %s";
		System.out.println("\n");
        String formatt=String.format(morn,"Sandsh",afternoon);
        System.out.println(formatt);
     
	}

}
