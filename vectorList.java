package BasicJava;

import java.util.Enumeration;
import java.util.Vector;

//Vector is a legacy synchronized dynamic array class that implements the List interface.
//it also uses array<Like arraylist> internally but with synchronization(thread safe).
public class vectorList {
    public static void main(String[] args) {
        Vector v=new Vector(100);
        v.add(11);
        v.add(12);
        v.add(13);
        v.add(14);
        System.out.println(v);
        //using enumeration which is used for iteration but only for legacy classes like vector,stack,hashtable.
        Enumeration elements = v.elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement()+" ");
        }
        Vector<Integer> v1 = new Vector<>(10, 5);
        v1.add(0,11);

    }
}
