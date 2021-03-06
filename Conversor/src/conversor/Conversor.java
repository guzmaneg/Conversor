/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Conversor extends javax.swing.JFrame {

    /**
     * Creates new form Conversor
     */
    public Conversor() {
        initComponents();
        setTitle("Mi Conversor");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCent = new javax.swing.JLabel();
        jTextFieldCent = new javax.swing.JTextField();
        jButtonConvertir = new javax.swing.JButton();
        jLabelCent1 = new javax.swing.JLabel();
        jTextFieldPulg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCent.setText("Centímetros");

        jTextFieldCent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCentFocusLost(evt);
            }
        });
        jTextFieldCent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCentKeyPressed(evt);
            }
        });

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });

        jLabelCent1.setText("Pulgadas");

        jTextFieldPulg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPulgFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCent)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCent, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCent1)
                        .addGap(33, 33, 33)
                        .addComponent(jTextFieldPulg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCent)
                    .addComponent(jTextFieldCent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButtonConvertir)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCent1)
                    .addComponent(jTextFieldPulg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        // System.out.println("Se presionó el botón");
        if (convertirCent) {
            convertirAPulgadas();
        }
        else {
            // TODO
            
        }
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void convertirAPulgadas() throws NumberFormatException {
        Double centDouble;
        try {
            centDouble = Double.valueOf(jTextFieldCent.getText().replace(',', '.'));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al convertir", "Error", JOptionPane.ERROR_MESSAGE);
            //System.err.println(ex.getMessage());
            return;
        }
        Double pulgDouble = centDouble / UNA_PULGADA;
        
        jTextFieldPulg.setText(String.format("%.2f", pulgDouble));
    }

    private void jTextFieldPulgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPulgFocusLost
        convertirCent = false;
    }//GEN-LAST:event_jTextFieldPulgFocusLost

    private void jTextFieldCentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCentFocusLost
        convertirCent = true;
    }//GEN-LAST:event_jTextFieldCentFocusLost

    private void jTextFieldCentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCentKeyPressed
        // Solo dejo pasar al ENTER
        if (evt.getKeyChar()==KeyEvent.VK_ENTER) {
            convertirAPulgadas();
        }
    }//GEN-LAST:event_jTextFieldCentKeyPressed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JLabel jLabelCent;
    private javax.swing.JLabel jLabelCent1;
    private javax.swing.JTextField jTextFieldCent;
    private javax.swing.JTextField jTextFieldPulg;
    // End of variables declaration//GEN-END:variables
    
    private static final double UNA_PULGADA = 2.54;
    private boolean convertirCent;
}
