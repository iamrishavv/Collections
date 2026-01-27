package BasicJava;

import java.util.HashMap;
import java.util.HashSet;
//it uses hashtable internally
//HashMap is a Map implementation that stores data in key-value pairs using hashing
//Fast performance
//✔ Allows one null key
//✔ Allows multiple null values
//✔ Not synchronized (not thread-safe)
//✔ No insertion order maintained
public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer ,String> hm=new HashMap<>();
        hm.put(1,"sk");
        hm.put(2,"rishav");
        hm.put(3,"rishu");
        hm.put(4,"sbk");
        hm.put(5,"shn");
        System.out.println(hm);
    }
}
