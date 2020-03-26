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
public class Test {
    
     public static void main(String[] args) {
       
         Gemi Gm0 = new Gemi("Night", "08.08.1998");                    //Sıradan bir gemi oluşturdum ve özellikleri girdim
         Gemi Gm1 = new KargoGemi("Dark", "05.12.1997",5000);           //bir Kargo gemisi olusturdum ve özellikleri girdim
         Gemi Gm2 = new TuristikGemi("Rainbow", "14.01.2016", 300);     //bir Turistik gemi olusturdum ve özellklerini girdim
         
         Gemi[] GmArr = new Gemi[3];        // bu gemileri bir diziye aktardım
         GmArr[0] = Gm0;
         GmArr[1] = Gm1;
         GmArr[2] = Gm2;
         
         for (Gemi Gemi: GmArr) {           // for-earch kullanarak bu dizidekileri toString ile ekranda görüntüledim
             System.out.println(Gemi.toString());
         }
         
    }
    
}
