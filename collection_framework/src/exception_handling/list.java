package exception_handling;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        System.out.println(a);

        a.add("Mumbai");
        a.add("Banglore");
        System.out.println(a);

        a.add(1,"Mysore");
        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        System.out.println(a.indexOf("Mumbai"));
        System.out.println(a.lastIndexOf("Mumbai"));
        System.out.println(a.size());

        System.out.println(a.get(0));
        System.out.println(a.set(1,"Chennai"));
        System.out.println(a);
        System.out.println(a.isEmpty());
        System.out.println(a.contains("Chennai"));

        System.out.println("Elements of lists:"+a);
        System.out.println("Using for loop");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("Using Iterator interface");
        Iterator<String> i=a.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
