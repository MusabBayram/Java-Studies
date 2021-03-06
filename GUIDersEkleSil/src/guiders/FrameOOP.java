/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiders;

import java.awt.Font;

/**
 *
 * @author acar
 */
public class FrameOOP extends javax.swing.JFrame {

    /**
     * Creates new form FrameOOP
     */
    public FrameOOP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAd = new javax.swing.JTextField();
        jTextFieldSoyad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBoxItalic = new javax.swing.JCheckBox();
        jCheckBoxBold = new javax.swing.JCheckBox();
        jCheckBoxPlain = new javax.swing.JCheckBox();
        jRadioButtonİtalic = new javax.swing.JRadioButton();
        jRadioButtonBold = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adı");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("Soyadı");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jTextFieldSoyad.setText("Lütfen Soyadınızı Girininz");

        jButton1.setText("Bilgi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBoxItalic);
        jCheckBoxItalic.setText("Italic");
        jCheckBoxItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxItalicActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBoxBold);
        jCheckBoxBold.setText("Bold");
        jCheckBoxBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBoldActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBoxPlain);
        jCheckBoxPlain.setText("Plain");
        jCheckBoxPlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlainActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonİtalic);
        jRadioButtonİtalic.setText("Italic");
        jRadioButtonİtalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonİtalicActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButtonBold);
        jRadioButtonBold.setText("Bold");
        jRadioButtonBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBoldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonİtalic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonBold))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxItalic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxBold)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxPlain)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCheckBoxItalic)
                    .addComponent(jCheckBoxBold)
                    .addComponent(jCheckBoxPlain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonİtalic)
                    .addComponent(jRadioButtonBold))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
         //jTextFieldAd.setText("Selahattin");
         
         new NewJFrame(jTextFieldSoyad.getText()).setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxItalicActionPerformed

        Font f;
        
        if(jCheckBoxItalic.isSelected() && jCheckBoxBold.isSelected()){
            f=new Font("Serif",Font.ITALIC+Font.BOLD,14);
             jTextFieldSoyad.setFont(f);
            
        }    
        else if(jCheckBoxItalic.isSelected() && !jCheckBoxBold.isSelected())
        {
               f=new Font("Serif",Font.ITALIC,14);
             jTextFieldSoyad.setFont(f);
            
        
        }
        else if(!jCheckBoxItalic.isSelected() && jCheckBoxBold.isSelected())
        {
               f=new Font("Serif",Font.BOLD,14);
             jTextFieldSoyad.setFont(f);
            
        
        }
        else if(!jCheckBoxItalic.isSelected() && !jCheckBoxBold.isSelected())
        {
               f=new Font("Serif",Font.PLAIN,14);
             jTextFieldSoyad.setFont(f);
            
        
        }
        
        
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxItalicActionPerformed

    private void jCheckBoxBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBoldActionPerformed
        // TODO add your handling code here:
         Font f;
        
        if(jCheckBoxItalic.isSelected()){
            f=new Font("Serif",Font.BOLD,14);
             jTextFieldSoyad.setFont(f);
            
        }  
        
    }//GEN-LAST:event_jCheckBoxBoldActionPerformed

    private void jCheckBoxPlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlainActionPerformed
        // TODO add your handling code here:
        
         Font f;
        
        if(jCheckBoxItalic.isSelected()){
            f=new Font("Serif",Font.PLAIN,14);
             jTextFieldSoyad.setFont(f);
            
        }  
    }//GEN-LAST:event_jCheckBoxPlainActionPerformed

    private void jRadioButtonİtalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonİtalicActionPerformed
        // TODO add your handling code here:
        
       
        Font f;
        
        if(jRadioButtonİtalic.isSelected()){
            f=new Font("Serif",Font.ITALIC,14);
             jTextFieldSoyad.setFont(f);
            
        }    
        
    }//GEN-LAST:event_jRadioButtonİtalicActionPerformed

    private void jRadioButtonBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBoldActionPerformed
        // TODO add your handling code here:
        
         Font f;
        
        if(jRadioButtonBold.isSelected()){
            f=new Font("Serif",Font.BOLD,14);
             jTextFieldSoyad.setFont(f);
            
        }   
    }//GEN-LAST:event_jRadioButtonBoldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameOOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxBold;
    private javax.swing.JCheckBox jCheckBoxItalic;
    private javax.swing.JCheckBox jCheckBoxPlain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonBold;
    private javax.swing.JRadioButton jRadioButtonİtalic;
    private javax.swing.JTextField jTextFieldAd;
    private javax.swing.JTextField jTextFieldSoyad;
    // End of variables declaration//GEN-END:variables
}
