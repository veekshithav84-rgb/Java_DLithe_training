package exception_handling;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class sample {
    static void checkAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Invalid, it has to be greater than 18");
        }
        else {
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("end of the program");
        }
    }
}
