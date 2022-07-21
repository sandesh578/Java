package enums;

enum Dept{
	CS,IT,ECE,CIVIL;
	//Wecan also assign values to the identifier but that should be mentioned in parameterized constructor
	
	//constructor can be private or protected
	private Dept() {
		System.out.println("Constructor "+ this.name());
	}
	
	public void print() {
		//index
		System.out.println("Ordinal "+this.ordinal());
	}
}

public class enumDemo {

	public static void main(String[] args) {
		Dept d=Dept.CIVIL;
		d.print();
		
		switch(d) {
		case CS:
			System.out.println("CS");
			break;
		case IT:
			System.out.println("IT");
			break;
		case ECE:
			System.out.println("ECE");
			break;
		case CIVIL:
			System.out.println("CIVIL");
			break;
		default:
			System.out.println("Default");
		}

	}

}
