package BasicJava;

import java.util.IdentityHashMap;

//IdentityHashMap is a Map implementation that compares keys using reference (==) instead of equals().
//== (Reference Comparison)
//in hashmap if we put duplicate key it will replace it with latest key with its new value because is uses isequal() method
//but identityHashmap  uses (==) so it compare reference value not content value.
public class identityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String s1 = new String("Java");
        String s2 = new String("Java");
        map.put(s1, 1);
        map.put(s2, 2);
        System.out.println(map);
    }
}
