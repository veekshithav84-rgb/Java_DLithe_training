package exception_handling;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(24);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s);
        System.out.println(s.search(24));
        System.out.println(s.get(2));
    }
}
