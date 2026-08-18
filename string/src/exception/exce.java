package exception;

public class exce {
    public static void main(String[] args) {
        int age=10;
        try{
            if(age<18)
            {
                throw new Exception("Something went wrong");
            }
            else
            {
                System.out.println("eligible to vote");
            }
        } catch (Exception e){
            System.out.println("Caught: "+e.getMessage());
        }
    }
}
