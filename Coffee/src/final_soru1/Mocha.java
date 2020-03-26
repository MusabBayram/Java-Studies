
package final_soru1;


public class Mocha extends Kahve{
    public int cikolata_miktari;

    public Mocha(int cikolata_miktari, int kahve_miktari, int sut_miktari) {
        super(kahve_miktari, sut_miktari);
        this.cikolata_miktari = cikolata_miktari;
    }

    @Override
    public String toString() {
        return "Mocha nesnesiyim";
    }

    @Override
    public void component() {
        System.out.println("Kahve Miktari:"+kahve_miktari+"\nSut Miktari:"+sut_miktari+"\nCikolata_miktari" + cikolata_miktari);
    }
    
    
}
