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
public class KargoGemi extends Gemi{
    
    private int Tonaj;  //private olarak tanımladığım kargo gemisinin tonajını tutan değişken

    public int getTonaj() {     //private olarak tanımladığım tonaj değişkenine ulasmam için get metodu
        return Tonaj;
    }

    public void setTonaj(int Tonaj) {   //private olarak tanımladığım tonaj değişkenini değiştirmem için set metodu
        this.Tonaj = Tonaj;
    }
    
    public KargoGemi(String İsim, String yıl, int Tonaj) {      //olusturacagım kargo gemisinin hangi özellikleriyle istediğimi belirten constructor
        super(İsim, yıl);
        this.Tonaj = Tonaj;
    }
    
    @Override
    public String toString()       //verileri ekrana yazmamı saglayan toString metodu
    {
        return "Kargo gemisinin adı: " + this.getİsim() + " İnşa yılı: " +this.getYıl() + " Maksimum tonaj kapasitesi: " + this.Tonaj ;
        
    }
}
