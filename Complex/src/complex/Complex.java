/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Musab
 */
public class Complex {

  
    public static void main(String[] args) 
    {
        int a;
        Complex1 obj = new Complex1();
        Complex1 obj2 = new Complex1(1,4);
        obj.setReal(5);
//        obj.imajinal = 3;

        System.out.println(obj.getReal());
        obj.add(obj2);
        System.out.println(obj.getReal());
        
        
        Complex1 obj3 = Complex1.sum(obj, obj2);
        
        System.out.println(obj3.getReal());
        System.out.println(obj3.imajinal);
        
//        System.out.println(obj2.getNorm());
       
    }
    


}
