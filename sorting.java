package BasicJava;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        //using collection.sort
        //in ascending order.
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        Collections.sort(list);
        System.out.println(list); // [10, 30, 40]
        //in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
