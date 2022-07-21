package annotations;

@interface MyAnno
{
	//String name();//metadata
	//String project();
	//String date() default "today"
}
//@MyAnno(name="Sandesh",project="Bank)//class level
public class UserDefinedAnnotation {

	@MyAnno//instance level
	int data;
	
	@MyAnno//method level
	public static void main(String[] args) {
		@MyAnno
		int x;

	}

}
