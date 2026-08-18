package exception;

public class zero {
    public static void main(String[] args){
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("We cannot dividew a number by zero");
        }
        finally{
            System.out.println("Hi class");
        }
    }
}
