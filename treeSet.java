package BasicJava;
//it maintains the natural sorting order
//Red-Black Tree (Self-Balancing BST)
//dont maintain insertion order but works on sorted order(ascending by default)
// for descending order we use comparator for custom sorting
//it contains only heterogeneous object due to continuous comparison

import java.util.Comparator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(12);
        ts.add(13);
        ts.add(2);
        ts.add(34);
        System.out.println(ts);
        //custom sorting using comparator
        TreeSet set = new TreeSet<>(Comparator.reverseOrder());
    }
}
