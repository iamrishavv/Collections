package BasicJava;

import java.util.concurrent.ConcurrentHashMap;

//ConcurrentHashMap is a thread-safe, high-performance Map implementation used in multithreaded environments.
//👉 Part of java.util.concurrent package
//👉 Implements ConcurrentMap Interface
//👉 Best replacement for Hashtable
public class concurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Microservices");
        System.out.println(map);
        System.out.println(map.get(2)); // Spring
    }
}
