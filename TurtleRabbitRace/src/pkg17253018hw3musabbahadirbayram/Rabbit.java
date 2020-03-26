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
public class Rabbit {
    private int konum;      //tavşanın konumunu private olarak tanımladım ki dısarıdan erişelemesin 
    private int ad;         //tavşanın adını private olarak tanımladım ki dısarıdan erişelemesin 

    public Rabbit(int konum, int ad) {  //tavşanı adı ve konumu ile birlikte belirtme için kullandıgım yapı
        this.konum = konum;         
        this.ad = ad;
    }


    public int getKonum() {      //tavşanın konumuna ulasabilmek için get metodu yazdım
        return konum;
    }

    public void setKonum(int konum) {   //tavşanın konumunu değiştirebilmek için set metodunu kullandım
        this.konum = konum;
        
    }

    public int getAd() {        //tavşanın adına ulaşabilmek için get metodunu oluşturdum
        return ad;
    }

    public void setAd(int ad) { //tavşanın adını değiştirebilmek için set metodunu oluşturdum
        this.ad = ad;
    }
       
    
    public void RabbitH(int rnd){   
        
        switch(rnd){        //Random donen sayıdan gelen sayıyı değişken olarak alan switch case metodunu yazdım. böylece belirtilen yüzdelik şanslarına 
            case 1:         // göre konumunu ayarladım.
            case 2:  
                break;
            case 3:  
            case 4: 
                konum+=9;
                break;
            case 5:  
                konum-=12;
                break;
            case 6:
            case 7:
            case 8:
                konum+=1;
                break;
            case 9:
            case 10:
                konum-=2;
                break;
            
        }
        if(konum<=0)        //konumu sıfırın altına düşerse sıfıra eşitledim.
            this.konum=0;
        if(konum >70)       //konumu 70 in üstüne çıkarsa 70 e eşitledim.
            this.konum=70;
    }
    
}
