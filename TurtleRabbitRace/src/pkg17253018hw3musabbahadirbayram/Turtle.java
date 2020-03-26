/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17253018hw3musabbahadirbayram;

/**
 *
 * @author Musab
 */
public class Turtle {
      
    private int konum;      //kaplumbağanın konumunu private olarak tanımladım ki dısarıdan erişelemesin 
    private int ad;         //kaplumbağanın adını private olarak tanımladım ki dısarıdan erişelemesin 

    public Turtle(int konum, int ad) {  //kaplumbağayı adı ve konumu ile birlikte belirtme için kullandıgım yapı
        this.konum = konum;
        this.ad = ad;
    }


    public int getKonum() {         //kaplumbağanın konumuna ulasabilmek için get metodu yazdım
        return konum;
    }

    public void setKonum(int konum) {   //kaplumbağanın konumunu değiştirebilmek için set metodunu kullandım
        this.konum = konum;
        
    }

    public int getAd() {            //kaplumbağanın adına ulaşabilmek için get metodunu oluşturdum
        return ad;
    }

    public void setAd(int ad) {     //kaplumbağanın adını değiştirebilmek için set metodunu oluşturdum
        this.ad = ad;
    }
       
    
    public void TurtleH(int rnd){   
       
        switch(rnd){            //Random donen sayıdan gelen sayıyı değişken olarak alan switch case metodunu yazdım. böylece belirtilen yüzdelik şanslarına 
            case 1:             // göre konumunu ayarladım.
            case 2:  
            case 3:  
            case 4: 
            case 5:  
                konum+=3;
                break;
            case 6:
            case 7:
                konum-=6;
                break;
            case 8:
            case 9:
            case 10:
                konum+=1;
                break;
            
        }
        if(konum<=0)    //konumu sıfırın altına düşerse sıfıra eşitledim.
            this.konum=0;
        if(konum >70)   //konumu 70 in üstüne çıkarsa 70 e eşitledim.
            this.konum=70;
    }
    
}
