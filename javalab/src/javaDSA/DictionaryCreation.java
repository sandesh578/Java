package javaDSA;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryCreation {
    public static void main(String[]args) {
        Dictionary<Integer,String> dict = new Hashtable<>();
        // Add key-value pairs to dict
        dict.put(1, "hello");
        dict.put(5, "goodbye");
        // Access the values using the keys
        System.out.println("Value at key 1: " + dict.get(1));
        System.out.println("Value at key 5: " + dict.get(5));
    }
}