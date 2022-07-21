package hashTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

//Property can only store string
//both key,value must be string
public class PropertyDemo {

	public static void main(String[] args) throws Exception {
		
       Properties p=new Properties();
       p.setProperty("Name","hp");
       p.setProperty("Os","Windows 10");
       p.setProperty("Processor","i5");
       p.setProperty("Model","latitude");
       
       //p.store(new FileOutputStream("C:\\Users\\KIIT\\Documents\\MyData.txt"),"Laptop");//save to a file as xml also we can save
       
       //p.load(new FileInputStream("C:\\Users\\KIIT\\Documents\\MyData.txt"));
       
       p.storeToXML(new FileOutputStream("C:\\Users\\KIIT\\Documents\\MyData.xml"),"Laptop");
       
       p.loadFromXML(new FileInputStream("C:\\Users\\KIIT\\Documents\\MyData.xml"));
       System.out.println(p);
       System.out.println(p.getProperty("Name"));
       //p.forEach((n,v)->System.out.println(n+" "+v));
	}

}
