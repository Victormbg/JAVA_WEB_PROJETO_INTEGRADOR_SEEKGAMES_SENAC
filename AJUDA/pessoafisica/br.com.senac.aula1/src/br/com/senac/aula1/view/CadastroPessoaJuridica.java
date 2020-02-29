package br.com.senac.aula1.view;

import br.com.senac.aula1.Juridica;
import javax.swing.JOptionPane;
import java.awt.Component;

public class CadastroPessoaJuridica extends javax.swing.JPanel {
 
   
    public CadastroPessoaJuridica() {
    initComponents();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFantasia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIscricaoEstadual = new javax.swing.JTextField();
        cmbIsentoInscicaoEstadual = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("Pessoa Juridica");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ:");

        jLabel3.setText("FANTASIA:");

        jLabel4.setText("RAZÃO SOCIAL:");

        txtRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoSocialActionPerformed(evt);
            }
        });

        jLabel5.setText("ISCRIÇÃO ESTADUAL:");

        cmbIsentoInscicaoEstadual.setText("INSENTO INSCRIÇÃO ESTADUAL");
        cmbIsentoInscicaoEstadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIsentoInscicaoEstadualActionPerformed(evt);
            }
        });

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnIncluir.setText("INCLUIR");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFantasia))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIscricaoEstadual, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtRazaoSocial))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(cmbIsentoInscicaoEstadual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtIscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbIsentoInscicaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnCancelar))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    txtId.setText("");
    txtId.setEditable(false);
    txtCnpj.setText("");                    
    txtFantasia.setText("");
    txtRazaoSocial.setText("");
    txtIscricaoEstadual.setText("");
      
    btnNovo.setEnabled(false);
    btnIncluir.setEnabled(true);
    btnAlterar.setEnabled(false);
    btnExcluir.setEnabled(false);
    btnPesquisar.setEnabled(false);
    btnCancelar.setEnabled(true);
    boolean selected = cmbIsentoInscicaoEstadual.isSelected();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Juridica j = new Juridica();
        j.setCnpj(txtCnpj.getText());
        j.setFantasia(txtFantasia.getText());
        j.setRazaoSocial(txtRazaoSocial.getText());
        j.setInscricaoEstadua(txtIscricaoEstadual.getText());
        j.setIsentoInscricaoEstadual(cmbIsentoInscicaoEstadual.isSelected());
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void cmbIsentoInscicaoEstadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIsentoInscicaoEstadualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIsentoInscicaoEstadualActionPerformed

    private void txtRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoSocialActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       Juridica j = new Juridica();
        if (!txtId.getText().equals("")) {
            j.setId(Integer.parseInt(txtId.getText()));
            j.consultar();
            txtId.setText(String.valueOf(j.getId()));
            txtId.setEditable(false);
            txtCnpj.setText(j.getCnpj());
            txtFantasia.setText(j.getFantasia());
            txtRazaoSocial.setText(j.getRazaoSocial());
            txtIscricaoEstadual.setText(j.getIscricaoEstadual());

            btnNovo.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnPesquisar.setEnabled(false);
            btnCancelar.setEnabled(true);
            cmbIsentoInscicaoEstadual.isSelected();
        } else {
            JOptionPane.showMessageDialog(this, "O ID procurado não existe!");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:txtId.setText("");
        txtId.setEditable(true);
        txtCnpj.setText("");
        txtFantasia.setText("");
        txtRazaoSocial.setText("");
        txtIscricaoEstadual.setText("");
        cmbIsentoInscicaoEstadual.isSelected();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       Juridica j = new Juridica();
       j.setId(Integer.valueOf(txtId.getText()));
       j.setCnpj(txtCnpj.getText());
       j.setRazaoSocial(txtRazaoSocial.getText());
       j.setInscricaoEstadua(txtIscricaoEstadual.getText());
       j.setIsentoInscricaoEstadual(cmbIsentoInscicaoEstadual.isSelected());
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Juridica j = new Juridica();
        j.setId(Integer.valueOf(txtId.getText()));
        j.excluir();
        JOptionPane.showMessageDialog(this, "Registro excluido com sucesso!");
        btnCancelarActionPerformed(evt);
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoaJuridica().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox cmbIsentoInscicaoEstadual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtFantasia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIscricaoEstadual;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables
}
