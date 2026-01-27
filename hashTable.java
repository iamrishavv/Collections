package BasicJava;

import java.util.Hashtable;

//Hashtable is a legacy Map class used to store data in key-value pairs
//👉 Part of java.util package
//👉 Implements Map interface
//👉 It is Thread-Safe (Synchronized)
public class hashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Java");
        ht.put(2, "Python");
        ht.put(3, "C++");
        System.out.println(ht);
        System.out.println(ht.get(2));
    }
}
