/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiders;
import javax.swing.JOptionPane;

/**
 *
 * @author acar
 */
public class MessageBox {
    
    
    public static void main(String[] args)
    {
    
        
        String s1=JOptionPane.showInputDialog(null, "Enter the first number");
        int num1=Integer.parseInt(s1);
        
        String s2=JOptionPane.showInputDialog(null, "Enter the second number");
        int num2=Integer.parseInt(s2);
        
        int res=num1+num2;
        JOptionPane.showInputDialog(null, " The result is "+ res);
        
        
        
        
    
    }
    
    
    
}
