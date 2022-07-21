class Testing{
	final float PI;
    //instance block
    {
    	PI=3.1425f;
    }
    //final variable cannot be initialized in next line after declaration until it is a instance block
}
public class final_examples2 {
   
	public static void main(String[] args) {
	 Testing t=new Testing();
      System.out.println(t.PI);
	}

}
