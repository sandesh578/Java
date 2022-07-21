package regularExpression;

public class Regex {
   public static void main(String[] args)
   {
	   String str="[a-z@!#$&*A-Z]";//// matches any letter and "!", "?", "."
	   System.out.println("a".matches(str));
	   System.out.println("@".matches(str));
	   
	   String pattern = "yes|no|maybe"; 
	   System.out.println("no".matches(pattern));
	   
	   String regex = "[^abc]"; // matches everything except for "a", "b", "c"

	   System.out.println("a".matches(regex)); // false
	   System.out.println("b".matches(regex)); // false
	   System.out.println("c".matches(regex)); // false
	   System.out.println("d".matches(regex));//true
   }
}
