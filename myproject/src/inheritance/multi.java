package inheritance;

interface Clothing{
    void mens_wear();
    void women_wear();
}
interface jewels{
    void gold();
    void silver();
}
interface cosmetic{
    void item1();
    void item2();
}
class Amazon_cart implements Clothing, jewels, cosmetic{

    @Override
    public void mens_wear() {
        System.out.println("mens wear, clothing interface");
    }

    @Override
    public void women_wear() {
        System.out.println("women wear, clothing interface");
    }

    @Override
    public void item1() {
        System.out.println("item1, cosmetic interface");
    }

    @Override
    public void item2() {
        System.out.println("item2, cosmetic interface");
    }

    @Override
    public void gold() {
        System.out.println("gold, jewels interface");
    }

    @Override
    public void silver() {
        System.out.println("silver, jewels interface");
    }
    }
public class multi {
    public static void main(String[] args) {
        Amazon_cart a=new Amazon_cart();
        a.mens_wear();
        a.women_wear();
        a.item1();
        a.item2();
        a.gold();
        a.silver();
    }
}
