package BasicJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//These terms describe how iterators behave when collection is modified during iteration.
//Throws exception immediately if collection is modified while iterating.
//❌ Behavior:
//Throws ConcurrentModificationException
//Stops execution
public class failFast {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            list.add(110);//modification
        }
    }
}
