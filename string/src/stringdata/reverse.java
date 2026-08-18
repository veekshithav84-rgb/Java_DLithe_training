package stringdata;

public class reverse {
    public static void main(String[] args) {
        String str = "eye";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println("The reversed string is:"+rev);
        if (str.equals(rev)) {
            System.out.println("it is pallindrome");
        } else
        {
            System.out.println("not pallindrome");
        }
    }
}
