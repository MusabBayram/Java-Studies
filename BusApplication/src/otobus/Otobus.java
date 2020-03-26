/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otobus;

import java.util.Scanner;

/**
 *
 * @author Musab
 */
public class Otobus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=0, d, f;
       String a,b,c,e;
       
        Scanner in = new Scanner(System.in);
        Passenger p1 = new Passenger("Hakki", "Bulut", false, 90,"55555555555");
        Passenger p2 = new Passenger("Beyza", "Kaynar", true, 90, "5555555554");
        Passenger p3 = new Passenger("Recep", "Tuluk", true, 90, "5555555556");
//        System.out.println(p2.getid());
        
        Bus b1 = new Bus("20 PAU 20", 34);
        b1.book(1, p1);
        b1.book(7, p2);
        b1.book(13, p3);
        x = in.nextInt();
        switch(x){
            case 1:
                System.out.println("Yolcu ad: ");
                a = in.next();
                System.out.println("Yolcu soyad: ");
                b = in.next();
                System.out.println("Yolcu cinsiyeti(E/K): ");
                c = in.next();
                System.out.println("Yolcunun ülke kodu: ");
                d= in.nextInt();
                System.out.println("Yolcu Tel: ");
                e = in.next();
                System.out.println("Yolcunun istediği koltuk numarası: ");
                f = in.nextInt();
                Passenger p4= new Passenger(a,b,c=="K",d,e);
                b1.book(f, p4);
                break;
            case 2:
                b1.displpayAllSeats();
                break;
            case 3:
            case 4:
                break;
        }
    }
    
}
