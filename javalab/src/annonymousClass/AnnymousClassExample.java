package annonymousClass;
/*
Anonymous classes enable you to declare and instantiate a class at the same time.

An anonymous class always implements an interface or extends another class (concrete or abstract).

An anonymous class must override all abstract methods of the superclass. 
That is, all interface methods must be overridden except default methods.
If an anonymous class extends a class that has no abstract methods, it doesn't have to override anything.

*/

interface SpeakingEntity {

    void sayHello();

    void sayBye();
}

public class AnnymousClassExample {
  public static void main(String[] args)
  {

   SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {
            
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye!");
    }
  };
  
  englishSpeakingPerson.sayHello();
  englishSpeakingPerson.sayBye();
  }
}
