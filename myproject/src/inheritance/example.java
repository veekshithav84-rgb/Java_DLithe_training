package inheritance;

class social_media{
    void mobile(){
        System.out.println("My mobile apps");
    }
}
class whatsapp extends social_media{
    void chats(){
        System.out.println("My whatsapp chats");
    }
}
class instagram extends social_media{
    void reels(){
        System.out.println("My instagram reels");
    }
}
class snapchat extends social_media{
    void snaps(){
        System.out.println("My snapchat snaps");
    }
}
public class example {
    public static void main(String[] args) {
        whatsapp w=new whatsapp();
        w.mobile();
        w.chats();
        instagram i=new instagram();
        i.reels();
        snapchat s=new snapchat();
        s.snaps();

        }
    }
