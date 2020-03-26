/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17253018hw4musabbahadirbayram;

/**
 *
 * @author Musab
 */
public class TuristikGemi extends Gemi{
    
    private int maxYolcu;       //private olarak tanımladığım turistik geminin yolcu kapasitesini tutan değişken

    public int getMaxYolcu() {  //private olarak tanımladığım maxYolcu değişkenine ulaşabilmem için get metodu
        return maxYolcu;
    }

    public void setMaxYolcu(int maxYolcu) {     //private olarak tanımladığım maxYolcu değişkenine ulaşabilmem için set metodu
        this.maxYolcu = maxYolcu;
    }
    
    public TuristikGemi(String İsim, String yıl, int maxYolcu) {    //olusturacagım turist gemisinin hangi özellikleriyle istediğimi belirten constructor
        super(İsim, yıl);
        this.maxYolcu = maxYolcu;
    }
    
    @Override
    public String toString()        //verileri ekrana yazmamı saglayan toString metodu
    {
        return "Turistik geminin adı: " + this.getİsim() + " İnşa yılı: " +this.getYıl() + " Maksimum yolcu kapasitesi: " +this.maxYolcu;
        
    }
    
}
