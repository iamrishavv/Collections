package BasicJava;
//Queue is a FIFO (First In First Out) data structure.
//priority will be given to lowest number.
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //priority queue works on priority of an element
        Queue<Integer> pq=new PriorityQueue<>();
        pq.add(2);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        System.out.println(pq);
        System.out.println(pq.element());//gives head of the queue
        System.out.println(pq.peek());
    }
}
