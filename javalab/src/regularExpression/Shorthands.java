package regularExpression;

public class Shorthands {

	public static void main(String[] args) {
		String regex = "\\s\\w\\d\\s";

		System.out.println(" A5 ".matches(regex)); // true
		System.out.println(" 33 ".matches(regex)); // true
		System.out.println("\tA4\t".matches(regex)); // true, because tabs are whitespace as well

		System.out.println("q18q".matches(regex)); // false, 'q' is not a space
		System.out.println(" AB ".matches(regex)); // false, 'B' is not a digit
		System.out.println(" -1 ".matches(regex)); // false, '-' is not an alphanumeric character, but '1' is OK. 
		
		/*
		 * \d is any digit, short for [0-9];
           \s is a whitespace character (including tab and newline), short for [ \t\n\x0B\f\r];
           \w is an alphanumeric character (word), short for [a-zA-Z_0-9];
           \b is a word boundary
           
           
           \D is a non-digit, short for [^0-9];
           \S is a non-whitespace character, short for [^ \t\n\x0B\f\r];
           \W is a non-alphanumeric character, short for [^a-zA-Z_0-9].
           \B is a non-word boundary
		 */

	}

}
