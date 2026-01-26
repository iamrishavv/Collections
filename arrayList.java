package BasicJava;
//it is best for retrieval operations because it uses index based operations and not recommended for insertion because it needs shifting
//it internally use array to store data.
import java.util.ArrayList;
import java.util.List;

//it is the implementation class of list interface
public class arrayList {
    public static void main(String[] args) {
//        ArrayList al=new ArrayList<>();//default capacity 10.
//        al.add(12);
//        al.add("rishav");
//        al.add(13);
//        al.add("raju");
//        al.add(14);
//        al.add("shyam");
//        System.out.println(al.size());
//        al.remove(0);
//        System.out.println(al.size());
//        ArrayList al1=new ArrayList(100);
//        //ArrayList(Collection<? extends E> c)
//        //👉 Creates an ArrayList containing elements of another collection.
//        List<Integer> oldList = List.of(1, 2, 3);
//        ArrayList<Integer> newList = new ArrayList<>(oldList);
        ArrayList l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(11);
        l.add(5);
        l.add(6);
        l.add(null);//null also allowed
        System.out.println(l);
        ArrayList l1=new ArrayList();
        l1.add(20);
        l1.add(30);
        l.add(40);
        l.add(50);
       // l1.addAll(l);
        l1.addAll(0,l1);
        System.out.println(l1);
        l.add(1,9);
        System.out.println(l);
        l.set(0,11);//replace
        System.out.println(l);
        System.out.println(l.contains(5));// gives boolean value
        System.out.println(l.indexOf(11));//gives -1 if not available  and gives first occurrence
        System.out.println(l.lastIndexOf(11));
        System.out.println(l.get(1));//gives out of bound exception if not available
        System.out.println("Size: "+l.size());
        l.remove(6);
        System.out.println(l);
        l.clone();
        System.out.println(l);
        l.clear();
        System.out.println(l);

    }
}
