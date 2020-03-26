/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Admin
 */
public class Accounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BasicAccount[] arr = new BasicAccount[3];
        arr[0] = new CDAccount("Hakan", 1000);
        arr[1] = new CDAccount("ahmet", 1000.0);
        arr[2] = new CheckingAccount("Hakan", 1000);
        
        
        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i].getBalance());
             
             if(arr[i] instanceof MinimumAccount)
             System.out.println(((MinimumAccount)arr[i]).penaltyAmount);
        }
        
       
    }
}
