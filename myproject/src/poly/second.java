package poly;

class Parent{
    int x=10;
    void display(){
        System.out.println("from parent class");
    }
}
class child1 extends Parent{
    void print(){
        System.out.println(super.x);
        super.display();
    }
}
public class second {
    public static void main(String[] args) {
        child1 c=new child1();
        c.print();
    }
}
