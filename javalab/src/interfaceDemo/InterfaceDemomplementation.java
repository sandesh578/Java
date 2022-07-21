package interfaceDemo;

class Phone{
	public void call() {
		System.out.println("Calling...");
	}
	public void sms() {
		System.out.println("Sending sms...");
	}
}

interface Camera{
	//by default members are public and abstract
	void click();
	void record();
}

interface MusicPlayer{
	void play();
	void pause();
	void stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
	public void click() {
		System.out.println("Clicking...");
	}
	public void record(){
		System.out.println("Recording...");
	}
	public void play(){
		System.out.println("Playing...");
	}
	public void pause(){
		System.out.println("Pausing...");
	}
	public void stop(){
		System.out.println("Stopping...");
	}
}

public class InterfaceDemomplementation {

	public static void main(String[] args) {
		System.out.println("SmartPhone can access:");
		SmartPhone s=new SmartPhone();
		s.click();
		s.record();
		s.call();
		s.sms();
		s.play();
		s.pause();
		s.stop();
		System.out.println("Phone can access:");
		Phone p=s;
		p.call();
		p.sms();
		System.out.println("Camera can access:");
		//Interfaces can have only references but object cannot be created
		Camera c=s;
		c.click();
		c.record();
		System.out.println("MusicPlayer can access:");
		MusicPlayer mp=s;
		mp.play();
		mp.pause();
		mp.stop();

	}

}
