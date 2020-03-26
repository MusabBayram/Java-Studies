/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

import static hafta5.Sayii.counter;

/**
 *
 * @author Musab
 */
public class Hafta5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sayii s1 = new Sayii(24);
        System.out.println("s1: "+s1.getNum());
        Sayii s2 = new Sayii(28);
        System.out.println("s2: "+s2.getNum());
        System.out.println("s1: "+s1.getNum());
        System.out.println("nesne sayisi: "+counter);
        s2.tamSayi();
        s2.sumofpositivedivisors();
        
    }
    
    
}
