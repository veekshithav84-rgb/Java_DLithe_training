package inheritance;
class nitte{
    void display(){
        System.out.println("from nitte institute");
    }
}
class nsam extends nitte{
    void nsam_Details(){
        System.out.println("nsam college");
    }
}
class nmamit extends nitte{
    void nmamit_Details(){
        System.out.println("nmamit college");
    }
}
class jksm extends nitte{
    void jksm_Details(){
        System.out.println("jksm college");
    }
}
public class sample_heri {
    public static void main(String[] args) {
        nsam n1=new nsam();
        n1.nsam_Details();
        nmamit n2=new nmamit();
        n2.nmamit_Details();
        n2.display();
        jksm n3=new jksm();
        n3.jksm_Details();
    }
}
