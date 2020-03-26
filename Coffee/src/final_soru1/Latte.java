package final_soru1;


public class Latte extends Kahve{
    public int seker_miktari;

    public Latte(int seker_miktari, int kahve_miktari, int sut_miktari) {
        super(kahve_miktari, sut_miktari);
        this.seker_miktari = seker_miktari;
    }

    @Override
    public String toString() {
        return "Latte Nesnesiyim";
    }
    
}
