package BasicJava;
//TreeMap is a Sorted Map implementation that stores key-value pairs in sorted order of keys.
//Keys stored in ascending order (default)
//✔ No duplicate keys
//✔ Does NOT allow null key
//✔ Allows multiple null values
//✔ Uses Red-Black Tree
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(3,"C");
        map.put(1,"B");
        map.put(2,"A");

        System.out.println(map);

    }
}
