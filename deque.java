package BasicJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//ArrayDeque is a resizable array-based implementation of Deque interface (Double Ended Queue).
// It allows insertion and removal from both ends and is faster than LinkedList.
//ArrayDeque is used as a Queue (FIFO)
//👉 But it can also work as Stack (LIFO) and Deque
//
public class deque {
    public static void main(String[] args) {
        //queue operations
        Queue<Integer> dq = new ArrayDeque<>();
        dq.offer(10);   // add
        dq.offer(20);
//        dq.poll();      // remove
//        dq.peek();      // view head
        //deque operations
        Deque<Integer> dq1 = new ArrayDeque<>();

        dq1.addFirst(10);   // front insert
        dq1.addLast(20);    // rear insert

        dq1.removeFirst();  // front remove
        dq1.removeLast();   // rear remove
        //stack implementation
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);

        System.out.println(stack.pop()); // 20

    }
}
