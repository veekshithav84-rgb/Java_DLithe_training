package exception_handling;

import java.util.Vector;

public class vec {
    public static void main(String[] args) {
        Vector<Integer>v=new Vector<>();
        v.addElement(20);
        v.addElement(45);
        v.addElement(89);
        System.out.println(v);
        v.insertElementAt(34,1);
        System.out.println(v);
        v.removeElement(45);
        System.out.println(v);
        v.removeElementAt(0);
        System.out.println(v);
        System.out.println(v.firstElement());
        v.removeAllElements();
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());

    }
}
