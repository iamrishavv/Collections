package BasicJava;

import java.util.Stack;

//Stack is a LIFO (Last In First Out) data structure implemented using the Vector class.
public class stackList {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(101);
        s.push(102);
        s.push(103);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());

    }
}
