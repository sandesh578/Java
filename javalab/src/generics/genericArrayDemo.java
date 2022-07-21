package generics;

class MyArray<T>{
	T A[]=(T[])new Object[10];
	int length=0;
	
	public void append(T val) {
		A[length++]=val;
	}
	
	public void display() {
		for(int i=0;i<length;i++) {
			System.out.println(A[i]);
		}
	}
}

public class genericArrayDemo {
	
	static <E> void show(E[] list) {
		for(E x:list) {
			System.out.println(x);
		}
	}
	
	//accepts only object which are under Number class
	static <E extends Number> void showX(E[] list) {
		for(E x:list) {
			System.out.println(x);
		}
	}
	
	static <E> void show1(E... list) {
		for(E x:list) {
			System.out.println(x);
		}
	}
	
	//unbounded wildcard
	static void fun(MyArray<?> ob) {
		ob.display();
	}
	
	//upper bound
	static void fun1(MyArray<? extends Number> ob) {
		ob.display();
	}

	//Either object of Number class or Object class can only be used
	//lower bound
	static void fun2(MyArray<? super Number> ob) {
		ob.display();
	}
	
	public static void main(String[] args) {
		MyArray<Integer> m=new MyArray<>();
        m.append(5);
        m.append(67);
        m.append(22);
        m.display();
        System.out.println();
        fun(m);
        System.out.println();
        show(new String[] {"Hi","Hello","Bye"});
        System.out.println();
        show(new Integer[] {1,6,9});
        System.out.println();
        show1(10,20,30,40,50);
	}

}
