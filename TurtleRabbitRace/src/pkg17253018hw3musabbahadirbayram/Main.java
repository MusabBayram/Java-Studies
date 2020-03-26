/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17253018hw3musabbahadirbayram;

import java.security.SecureRandom;  //rastgele sayı üretebilmek için eklediğim dosya
import java.util.Scanner;       //kullanıcıdan veri almak için eklediğim dosya

/**
 *
 * @author Musab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //Scanner metodunu in ile cagırıcağımı belirttim
        int R, T, x = 0, y = 0, z = 0, q = 0, w = 0;    //gerekli integer tanımlamalarını yaptım
        System.out.println("Kaplumbaga Tavsan yaris oyununa hos geldiniz...");
        System.out.println("Yarismada kac kaplumbaga olsun: ");
        T = in.nextInt();   //kullanıcıdan yarışmada kaç kaplumbağa olmasını istediği sayıyı T değişkenin de tuttum
        System.out.println("Yarismada kac tavsan olsun: ");
        R = in.nextInt();   //kullanıcıdan yarışmada kaç tavşan olmasını istediği sayıyı R değişkeninde tuttum
        Rabbit[] rbt = new Rabbit[R];   //rabbit objesini oluşturdum
        Turtle[] tbt = new Turtle[T];   //Turtle objesini oluşturdum
        for (int i = 0; i < T; i++) {   //Kaplumbağaların hepsine sırasıyla sayılarla isimlendirdim ve konumlarını sıfıra eşitledim
            tbt[i] = new Turtle(0, i + 1);
        }
        for (int i = 0; i < R; i++) {   //Tavşanların hepsine sırasıyla sayılarla isimlendirdim ve konumlarını sıfıra eşitledim
            rbt[i] = new Rabbit(0, i + 1);
        }
        int rand;
        do {    //Biri kazanana kadar devam etmesini sağladığım do while döngüsü
            z = 0;  // gerekli değişkenler
            q = 0;
            SecureRandom scr = new SecureRandom();  //Random sayı üretebilmek için gerekli bir metot
            for (int i = 0; i < R; i++) {           //tüm tavşanların ilk adımda ne yapacaklarını kararlastıran random sayıyı oluşturan for dongüsü
                rand = scr.nextInt(10) + 1;         //random sayının üretildiği kısım
                rbt[i].RabbitH(rand);               //random sayısını tavşanın hareket fonksiyonuna gönderdiğim kısım
                for (int j = 1; j <= 70; j++) {     //her tavşanın tek tek o an bulundukları konumlarını ekrana yazdıran for içindeki if else yapısı
                    if (rbt[i].getKonum() == j) {
                        System.out.print("R");
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println("");
            }
                
            for (int i = 0; i < T; i++) {
                rand = scr.nextInt(10) + 1; //random sayının üretildiği kısım
                tbt[i].TurtleH(rand);       //random sayısını kaplumbağanın hareket fonksiyonuna gönderdiğim kısım
                for (int j = 1; j <= 70; j++) {
                    if (tbt[i].getKonum() == j) {   //her kaplumbağanın tek tek o an bulundukları konumlarını ekrana yazdıran for içindeki if else yapısı
                        System.out.print("K");
                    } else {
                        System.out.print("_");
                        }
                }
                    System.out.println("");
                }

            for (int i = 0; i < R; i++) {       //tüm tavşanların konumlarını kontrol etmesine yarayan for döngüsü
                if (rbt[i].getKonum() == 70) {  //konumu 70 e eşit olan tavşan olup olmadığını kon trol eden if
                    x = 1;
                    y = i+1;
                    z += 1;
                    if(z>1){    //birden fazla tavşanın kazanıp kazanmadığını kontrol eden if yapısı
                        for (int j = 0; j < z; j++) {   //eğer birden fazla kazanan varsa bunları ekrana yazdıran for döngüsü
                        System.out.print(rbt[i].getAd()+". Tavşan,");  
                        }
                        System.out.print("aynı anda yarışmayı tamamladılar!");
                    }
                }
            }
                for (int i = 0; i < T; i++) {      //tüm kaplumbağaların konumlarını kontrol etmesine yarayan for döngüsü
                    if (tbt[i].getKonum() == 70) {  //konumu 70 e eşit olan kaplumbağa olup olmadığını kon trol eden if
                        x = 1;
                        q += 1;
                        w = i+1;
                        if(q>1){        //birden fazla kaplumbağanın kazanıp kazanmadığını kontrol eden if yapısı
                            for (int j = 0; j < q; j++) {   //eğer birden fazla kazanan varsa bunları ekrana yazdıran for döngüsü
                            System.out.print(tbt[i].getAd()+". Kaplumbağa,");  
                            }
                            System.out.print("aynı anda yarışmayı tamamladılar! ");
                        }
                        else if(z>0){   //aynı anda hem tavşan hemde kaplumbağa kazandımı kazanmadımı kontrol eden else if yapısı 
                            System.out.println("Bu bir beraberliktir "+ y +". Tavşan ile"+ tbt[i].getAd() +". Kaplumbağa arasında!");
                        }
                        else        //bunların hiçbirine girmezse tek kaplumbağanın kazandığını anlayan else yapısı
                        System.out.println(tbt[i].getAd() + ". Kaplumbağa Kazandı!");
                    }
                }
                if(z>0 && q==0 && z<2){     //eğer tekçe 1 tavşan kazandıysa o tavşanı ekrana yazdıran if yapısı
                    System.out.println(y+ ". Tavşan Kazandı!");
                }
            }
            while (x == 0);     // x, 0 a eşit olduğu sürece dönmesini sağlayan while
    }
}