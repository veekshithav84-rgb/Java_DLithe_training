package abstraction;


abstract class Nsam{
    abstract void cse_dept();
    void com_Dept(){
        System.out.println("from com_dept");
    }
}

class Students extends Nsam{

    @Override
    void cse_dept() {
        System.out.println("from cse dept");
    }
}
 public class sample {
     public static void main(String[] args) {
         Students s=new Students();
               s.cse_dept();
               s.com_Dept();
     }
}
