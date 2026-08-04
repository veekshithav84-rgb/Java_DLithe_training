package poly;


public class first {
    void add(int a, int b){
        System.out.println("Sum:"+(a+b));
    }
    void add(int a, float b){
        System.out.println("Sum:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum:"+(a+b+c));
    }
    public static void main(String[] args){
        first f=new first();
        f.add(10,20);
        f.add(10,20.89f);
        f.add(10,20,30);
    }
}
