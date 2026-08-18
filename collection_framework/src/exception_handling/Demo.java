package exception_handling;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer>s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s);
        s.add(10);
        System.out.println(s);
    }
}
