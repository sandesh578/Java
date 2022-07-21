class As{
	protected int a=5;
}
class Bs extends As{
	protected int b=7;
}
class Cs extends Bs{
	int x=9;
}
public class TCPExam2 {

	public static void main(String[] args) {
		Cs obj=new Cs();
        System.out.println(obj.a+" "+obj.b+" "+obj.x);
	}

}
