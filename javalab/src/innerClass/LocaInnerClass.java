package innerClass;
//Remember, that local inner class can be instantiated only within the block where the inner class is defined.
//Inside a local inner class you cannot define any static members, enums, interfaces.
//local inner class cannot have any access modifier
class Outer {

    private int number = 10;

    void someMethod() {
        final int x = 5;

        class Inner {
            private void print() {
                System.out.println("x = " + x);
                System.out.println("number = " + Outer.this.number);
            }
        }

        Inner inner = new Inner();
        inner.print();
    }
}
public class LocaInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.someMethod();
    }
}


