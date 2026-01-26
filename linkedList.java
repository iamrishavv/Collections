package BasicJava;

import java.util.LinkedList;
import java.util.ListIterator;

//implement of list interface
//it uses doubly linked list to store data
// it is best suited for insertion
public class linkedList {

    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        System.out.println(l.get(1));
        System.out.println(l);
        l.add(0,101);
//        ListIterator<Integer> integerListIterator = l.listIterator();
//        while (integerListIterator.hasNext()){
//            System.out.println(integerListIterator.next());
//        }
        System.out.println(l);
    }
}
