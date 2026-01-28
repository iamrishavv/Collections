package BasicJava;

import java.util.WeakHashMap;

//WeakHashMap is a Map implementation where keys are stored as Weak References.
//When a key is no longer strongly referenced, it is automatically removed by Garbage Collector (GC).
public class weakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        String key = new String("Java");
        map.put(key, 1);
        System.out.println("Before GC: " + map);
        key = null; // Remove strong reference
        System.gc(); // Request GC
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("After GC: " + map);

    }
}
