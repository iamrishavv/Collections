package BasicJava;
//LinkedHashSet is a Set implementation that stores unique elements and maintains insertion order.
//it uses hashtable and double linked list internally.
//it contains homogenous and heterogeneous object
//No duplicates,Maintains insertion order ,Allows one null value,Faster than TreeSet
//HashMap → Fast lookup
//Doubly Linked List → Maintains insertion order
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet <Integer>hs=new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        Iterator<Integer> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
