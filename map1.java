package BasicJava;
// we can pass custom object also in map.
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class map1 {
    int id;
    String name;
    map1(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int hashCode() {
        return id;
    }


    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    public static void main(String[] args) {
        Map <Integer ,map1>mp=new HashMap<>();
        mp.put(1,new map1(101,"rishav"));
        mp.put(2,new map1(102,"rishu"));
        System.out.println(mp);
    }
}
