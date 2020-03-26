/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17253018hw1musabbahadirbayram;

import java.util.Scanner;

/**
 *
 * @author Musab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hos geldiniz...");
        System.out.print("Pozitif bir tam sayi giriniz: ");
        Scanner input = new Scanner(System.in);
	int sayi;
        sayi = input.nextInt();
        while(sayi<0)
        {
            System.out.print("Hatali sayi girdiniz lütfen pozitif bir tam sayi giriniz:");
            sayi = input.nextInt();
        }
         System.out.println(sayi+" sayısının faktöriyeli = "+(int)faktoriyel(sayi));
         eSayisi();
         
        
    }
    public static void eSayisi()
    {
        System.out.print("Lutfen e sayisi için terim sayisini giriniz: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double e = 1;
        for (int i = 1; i <= n; i++)
        {
            e += 1/faktoriyel(i);
        }
        System.out.print("\ne sabiti: " + e );
        System.out.println("\n");
    }
    public static double faktoriyel(int sayi)
    {  
      if(sayi==1 || sayi==0)
      {
         return 1;
      }
      double sonuc = sayi*faktoriyel(sayi-1);
      return sonuc;
    }
}
