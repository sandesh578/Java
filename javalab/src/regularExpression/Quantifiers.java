package regularExpression;

public class Quantifiers {

	public static void main(String[] args) {
		//plus quantifiers
		String regex = "ca+b";

		System.out.println("cab".matches(regex)); // true
		System.out.println("caaaaab".matches(regex)); // true
		System.out.println("cb".matches(regex)); // false because it does not have at least one repetition of 'a'
		
		//Star quantifiers
		String regex1 = "A[0-3]*";

		"A".matches(regex1);  // true because the pattern matches zero or more repetitions
		"A0".matches(regex1); // true
		"A000111222333".matches(regex1); // true
		
		String johnRegex = ".*John.*"; // it matches all strings containing the substring "John"

		String textWithJohn = "My friend John is a computer programmer";

		System.out.println(textWithJohn.matches(johnRegex)); // true

		String john = "John";

		System.out.println(john.matches(johnRegex)); // true

		String textWithoutJohn = "My friend is a computer programmer";

		System.out.println(textWithoutJohn.matches(johnRegex)); // false
		
		
		String regex2 = "1{2,3}";

		System.out.println("1".matches(regex2));    // false
		System.out.println("11".matches(regex2));   // true
		System.out.println("111".matches(regex2));  // true
		System.out.println("1111".matches(regex2)); // false
		
		
		String regex3 = "[0-9]{4}"; // four digits

		System.out.println("6342".matches(regex3));  // true
		System.out.println("9034".matches(regex3));  // true

		System.out.println("182".matches(regex3));   // false
		System.out.println("54312".matches(regex3)); // false

		
		String regex4 = "ab{4,}";

		System.out.println("abb".matches(regex4)); // false, not enough 'b'
		System.out.println("abbbb".matches(regex4)); // true
		System.out.println("abbbbbbb".matches(regex4)); // true
	}

}
