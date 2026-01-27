package BasicJava;
//LinkedHashMap is a HashMap variant that maintains insertion order (or access order) of keys

import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"rk");
        map.put(2,"sk");
        map.put(3,"ek");
        map.put(4,"fk");
        System.out.println(map);
    }
}
