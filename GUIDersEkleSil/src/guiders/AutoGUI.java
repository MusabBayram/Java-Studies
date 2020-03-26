/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiders;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


/**
 *
 * @author acar
 */
public class AutoGUI extends JFrame {
    
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public AutoGUI() {
        
        
        super("Testing JtextField and JPasswordField");
        
        setLayout(new FlowLayout());
        
        this.textField1 = new JTextField(10);
        textField1.setVisible(true);
        add(textField1);
        
        textField2 = new JTextField("Enter Text here");
        add(textField2);
        
        textField3=new JTextField("Uneditable text Field",21);
        textField3.setEditable(false);
        add(textField3);
        
        
        passwordField=new JPasswordField("Hidden Text");
        add(passwordField);
        
        TextFieldHandler handler=new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        
        passwordField.addActionListener(handler);
        
        
    }
    
    public class TextFieldHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
     
            String string="";
            if(event.getSource()==textField1){
                string=String.format("TextField1: %s",event.getActionCommand());
               textField3.setEditable(true);
            }
            if(event.getSource()==textField2)
                string=String.format("TextField2: %s",event.getActionCommand());
            if(event.getSource()==textField3)
                string=String.format("TextField3: %s",event.getActionCommand());
            
            if(event.getSource()==passwordField)
                string=String.format("passwordField: %s",event.getActionCommand());

              JOptionPane.showConfirmDialog(null, string);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        
        
         AutoGUI textFieldFrame=new AutoGUI();
         textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         textFieldFrame.setSize(450,150);
         textFieldFrame.setVisible(true);
        
    }
    
    
}
