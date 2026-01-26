package BasicJava;
//constructors of linked list
import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>();
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        System.out.println(l1);
        //passing another collections 
        LinkedList l2=new LinkedList(l1);
        System.out.println(l2);

    }
}
