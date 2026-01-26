package BasicJava;
//it is available in java.util package
//Map is an interface that stores data in key-value pairs.
import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"rk");
        map.put(2,"jk");
        map.put(3,"wl");
        map.put(4,"ee");
        System.out.println(map);
        String s = map.get(1);
        System.out.println(s);
        map.remove(1);
        System.out.println(map);
        boolean b = map.containsKey(3);
        System.out.println(b);
        //using keyset for getting key only
        for (Integer i : map.keySet()) {
            System.out.println(i);
        }
        //using value for getting value only
        for (String value : map.values()) {
            System.out.println(value);
        }

        //using entryset for both key and value
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() +" " +e.getValue());
        }


    }
}
