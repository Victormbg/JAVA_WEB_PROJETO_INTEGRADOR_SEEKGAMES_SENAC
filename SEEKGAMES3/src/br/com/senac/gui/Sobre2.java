/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.gui;





/**
 *
 * @author 39121742018.2
 */
public class Sobre2 extends javax.swing.JFrame {

    /**
     * Creates new form Sobre2
     */
    public Sobre2() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btCliente3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Sistema de Vendas\n\n\nAplicação desenvolvida como material\nde apoio ao aprendizado de programação \nJava. É fornecida gratuitamente \"no estado \nem que se encontra\", isentando o autor de \nqualquer garantia ou danos que possam \nresultar do usa da mesma.");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        btCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/cancelar.png"))); // NOI18N
        btCliente3.setText("Voltar");
        btCliente3.setContentAreaFilled(false);
        btCliente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente3.setFocusable(false);
        btCliente3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente3.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/img/cancelar-foco.png"))); // NOI18N
        btCliente3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliente3miClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(btCliente3)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCliente3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCliente3miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliente3miClienteActionPerformed
    Principal p  = new Principal();
    p.setVisible(true);
    dispose();
    }//GEN-LAST:event_btCliente3miClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Sobre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


}
