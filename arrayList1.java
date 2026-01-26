package BasicJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//approach to manipulate the arraylist.
public class arrayList1 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        //iterate using for loop
        System.out.println("Using for loop: ");
        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        //using for each loop
        System.out.println("Using for each loop");
        for(Object o:a){
            System.out.println(o);
        }
        //using iterator object
        System.out.println("Using iterator:");
        Iterator iterator = a.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //using list iterator
        System.out.println("Using loop iterator:");
        ListIterator listIterator = a.listIterator();
        System.out.println("To print in frwd order:");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("To print in reverse order:");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        //using for each method
        System.out.println("Using for each method and lambda expression:");
        a.forEach(i ->{
            System.out.println(i);
        });
    }
}
