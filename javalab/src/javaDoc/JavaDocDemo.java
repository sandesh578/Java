package javaDoc;
/*
 * @author Sandesh Parajuli
 * @version 2.0
 * @since 2021
 * Class for library book
 */
class Book
{
	/*
	 * @value 10 defsult vslue
	 */
	static int val=20;
	/*
	 * Parameterized Constructor
	 * @param s Book name
	 */
	public Book(String s)
	{
		
	}
	/*
	 * Issue a Book to a Student
	 * @param roll
	 * @throws exception if book is not available throws Exception
	 */
	public void issue(int roll) throws Exception
	{
		
	}
	/*Check if book is available
	 * @param str BOok Name
	 * @ return Book Name true if available
	 */
	public boolean available(String str)
	{
		return true;
	}
	/*
	 * @param book name
	 * @return gets book name
	 */
	public String getName(int id)
	{
		return " ";
	}
}
public class JavaDocDemo {

	public static void main(String[] args) {
		Book b=new Book("Java");

	}

}
