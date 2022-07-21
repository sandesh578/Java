import java.util.Scanner;
class Student{
	int value;
	String text;
	public Student()
	{
		this.value=77;
		this.text="Sandesh Parajuli";
	}
	public Student(int value,String text)
	{
		this.value=value;
		this.text=text;
	}
	public void display()
	{
		System.out.print(value+" "+text);
	}
}
public class classesinjava {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int value=scanner.nextInt();
		System.out.println("Enter a string:");
		String text=scanner.nextLine();
		Student obj,obj1=new Student();
		Student obj1=new Student(value,text);
		obj.display();
        scanner.close();
	}

}
