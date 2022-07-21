package objectClass;

//We can override method of object class
class MyObject{
	public String toString() {
		return "Hello";
	}
	public int hashCode() {
		return 100;
	}
	
	public Boolean equals(MyObject o) {
		return this.hashCode()==o.hashCode();
	}
}

public class ObjectClassDemo {

	public static void main(String[] args) {
		MyObject m=new MyObject();
		MyObject m1=new MyObject();
		System.out.println(m.equals(m1));

	}

}
