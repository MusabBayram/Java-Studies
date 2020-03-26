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
public class Gemi {
    
    
    private String İsim;        //private olarak gemi ismini tutacagım değişken
    private String Yıl;         //private olarak geminin inşa edildiği yılı tutucak degisken   

    public String getİsim() {   //privet olarak tanımladıgım İsim değişkenine ulaşmamı sağlayacak metot 
        return İsim;
    }

    public void setİsim(String İsim) {  //privet olarak tanımladıgım İsim değişkenini değiştirmemi sağlayacak metot 
        this.İsim = İsim;
    }

    public String getYıl() {        //privet olarak tanımladıgım Yıl değişkenine ulaşmamı sağlayacak metot 
        return Yıl;
    }

    public void setYıl(String yıl) {    //privet olarak tanımladıgım Yıl değişkenini değiştirmemi sağlayacak metot 
        this.Yıl = Yıl;
    }

    public Gemi(String İsim, String yıl) {  //olusturacagım geminin hangi özellikleriyle istediğimi belirten constructor
        this.İsim = İsim;
        this.Yıl = yıl;
    }
    
    @Override
    public String toString()        //verileri ekrana yazmamı saglayan toString metodu
    {
        return "Geminin adı: " + this.İsim + " İnşa yılı: " +this.Yıl;
        
    }
    
}
