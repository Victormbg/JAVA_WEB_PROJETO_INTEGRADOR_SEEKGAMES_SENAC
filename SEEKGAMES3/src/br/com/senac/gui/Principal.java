/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;




/**
 *
 * @author 39121742018.2
 */
public class Principal extends javax.swing.JFrame {
 
    /**
     * Creates new form Principal
     */
    public Principal() {
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

        btCliente = new javax.swing.JButton();
        btCliente1 = new javax.swing.JButton();
        btCliente2 = new javax.swing.JButton();
        btCliente3 = new javax.swing.JButton();
        btCliente4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEEK GAMES");
        setIconImages(null);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/produto.png"))); // NOI18N
        btCliente.setText("Jogos");
        btCliente.setContentAreaFilled(false);
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/produto-foco.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientemiClienteActionPerformed(evt);
            }
        });

        btCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/sair.png"))); // NOI18N
        btCliente1.setText("Sair");
        btCliente1.setContentAreaFilled(false);
        btCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente1.setFocusable(false);
        btCliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente1.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/sair-foco.png"))); // NOI18N
        btCliente1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliente1miClienteActionPerformed(evt);
            }
        });

        btCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/venda.png"))); // NOI18N
        btCliente2.setText("Aluguel");
        btCliente2.setContentAreaFilled(false);
        btCliente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente2.setFocusable(false);
        btCliente2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente2.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/venda-foco.png"))); // NOI18N
        btCliente2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliente2miClienteActionPerformed(evt);
            }
        });

        btCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/cliente.png"))); // NOI18N
        btCliente3.setText("Cliente");
        btCliente3.setContentAreaFilled(false);
        btCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente3.setFocusable(false);
        btCliente3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente3.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/cliente-foco.png"))); // NOI18N
        btCliente3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliente3miClienteActionPerformed(evt);
            }
        });

        btCliente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/sobre.png"))); // NOI18N
        btCliente4.setText("Sobre");
        btCliente4.setContentAreaFilled(false);
        btCliente4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente4.setFocusable(false);
        btCliente4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente4.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/sobre.png"))); // NOI18N
        btCliente4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliente4miClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btCliente3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCliente)
                .addGap(18, 18, 18)
                .addComponent(btCliente2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btCliente4)
                .addGap(18, 18, 18)
                .addComponent(btCliente1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCliente)
                    .addComponent(btCliente1)
                    .addComponent(btCliente3)
                    .addComponent(btCliente2)
                    .addComponent(btCliente4))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btClientemiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientemiClienteActionPerformed
   
    }//GEN-LAST:event_btClientemiClienteActionPerformed

    private void btCliente1miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliente1miClienteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCliente1miClienteActionPerformed

    private void btCliente2miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliente2miClienteActionPerformed
   
    }//GEN-LAST:event_btCliente2miClienteActionPerformed

    private void btCliente3miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliente3miClienteActionPerformed
    CadastroCliente cc = new CadastroCliente();
    cc.setVisible(true);
    dispose();
    }//GEN-LAST:event_btCliente3miClienteActionPerformed

    private void btCliente4miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliente4miClienteActionPerformed
    Sobre2 s  = new Sobre2();
    s.setVisible(true);
    dispose();
    }//GEN-LAST:event_btCliente4miClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }

            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCliente1;
    private javax.swing.JButton btCliente2;
    private javax.swing.JButton btCliente3;
    private javax.swing.JButton btCliente4;
    // End of variables declaration//GEN-END:variables

   
}
