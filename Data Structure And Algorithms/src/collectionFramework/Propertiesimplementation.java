package collectionFramework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesimplementation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.setProperty("Brand","Dell");
		p.setProperty("Processor","i7");
		p.setProperty("Model","latitude");
		p.setProperty("OS","Widows10");
		
		//we can also export as xml file
		//p.store(new FileOutputStream("Users/KIIT/Documents/MyData.txt"),"Laptop");
		
		System.out.println(p);
		
		//read from the xml file
//		p.loadFromXML(new FileInputStream("Users/KIIT/Documents/MyData.xml"));
//        System.out.println(p);
//        System.out.println(p.getProperty("Name"));
	}

}
