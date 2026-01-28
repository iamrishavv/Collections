package BasicJava;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//Does NOT throw exception
//👉 Works on copy of original collection
//there are two classes available a)CopyOnWriteArrayList and b)CopyOnWriteArraySet
public class failSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list2 =new CopyOnWriteArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        Iterator<Integer> i=list2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            list2.add(100);
            break;
        }
        System.out.println(list2);
    }

}
