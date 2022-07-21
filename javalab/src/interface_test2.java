class Phone1{
	public void call()
	{
		System.out.println("Phone is for calling");
	}
	public void sms()
	{
		System.out.println("Phone  is also used for short message service");
	}
}
interface Icamera{
	void click();
	void record();
}
interface ImusicPlayer{
	void play();
	void stop();
}
class SmartPhone extends Phone1 implements Icamera,ImusicPlayer{
	public void click()
	{
		System.out.println("Smartphone is clicking pictures");
	}
	public void record()
	{
		System.out.println("Smartphone is recording video");
	}
	public void play()
	{
		System.out.println("Smartphone playing music");	
	}
	public void stop()
	{
	  System.out.println("Smartphone stopping music");	
	}
}
public class interface_test2 {

	public static void main(String[] args) {
		System.out.println("Class Smartphone ");
		SmartPhone s=new SmartPhone();
		s.call();
		s.sms();
		s.click();
		s.record();
		s.play();
		s.stop();
		System.out.println("Class phone");
		Phone1 p=new SmartPhone();
		p.call();
		p.sms();
		System.out.println("Interface Icamera");
		Icamera c=new SmartPhone();
		c.click();
		c.record();
		System.out.println("Interface ImusicPlayer");
		ImusicPlayer m=new SmartPhone();
		m.play();
		m.stop();
	}

}
