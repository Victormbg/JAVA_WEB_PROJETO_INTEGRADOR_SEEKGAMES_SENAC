package br.com.senac.gui;
import br.com.senac.controller.jogoController;
import br.com.senac.model.entidade.jogo;
import javax.swing.JOptionPane;


public class CadastroJogo extends javax.swing.JFrame {

    public CadastroJogo() {
        initComponents();
    }

    CadastroJogo(jogo jogo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncluir = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        lblIdade1 = new javax.swing.JLabel();
        txtDesenvolvedora = new javax.swing.JTextField();
        lblIdade3 = new javax.swing.JLabel();
        txtSituacao = new javax.swing.JTextField();
        lblIdade4 = new javax.swing.JLabel();
        txtPlataforma = new javax.swing.JTextField();
        lblIdade5 = new javax.swing.JLabel();
        txtIdadeRecomendada = new javax.swing.JTextField();
        btnCancelar2 = new javax.swing.JButton();
        btnCancelar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.setPreferredSize(new java.awt.Dimension(80, 30));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnCancelar1.setText("Voltar");
        btnCancelar1.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblIdade.setText("Preço:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(102, 255, 204));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblTitulo.setText("CADASTRO JOGO");
        lblTitulo.setToolTipText("");

        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(80, 30));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblIdade1.setText("Desenvolvedora:");

        txtDesenvolvedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesenvolvedoraActionPerformed(evt);
            }
        });

        lblIdade3.setText("Situação:");

        txtSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSituacaoActionPerformed(evt);
            }
        });

        lblIdade4.setText("Plataforma:");

        txtPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlataformaActionPerformed(evt);
            }
        });

        lblIdade5.setText("Idade Recomendada:");

        txtIdadeRecomendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeRecomendadaActionPerformed(evt);
            }
        });

        btnCancelar2.setText("Limpar");
        btnCancelar2.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        btnCancelar3.setText("Lista");
        btnCancelar3.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdade1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDesenvolvedora, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdade3)
                                .addGap(18, 18, 18)
                                .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblIdade5)
                                    .addGap(17, 17, 17)
                                    .addComponent(txtIdadeRecomendada))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblIdade4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade1)
                    .addComponent(txtDesenvolvedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade3)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade4)
                    .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade5)
                    .addComponent(txtIdadeRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        jogo j = new jogo();
        j.setNome(txtNome.getText());
        j.setPlataforma(txtPlataforma.getText());
        j.setDesenvolvedora(txtDesenvolvedora.getText());
        j.setSituacao(txtSituacao.getText());
        j.setIdadeRecomendada(Integer.parseInt(txtIdadeRecomendada.getText()));
        j.setPreco(Integer.parseInt(txtPreco.getText()));
        
        jogoController controller = new jogoController();
        String msg = controller.validarDados(j);
        if(msg.equals("")){
            controller.incluirJogo(j);
            JOptionPane.showMessageDialog(this,"Jogo cadastrado com sucesso");

        }else{
            JOptionPane.showMessageDialog(this,msg);
        }

    }//GEN-LAST:event_btnIncluirActionPerformed
    public void limpar(){
        txtNome.setText("");
        txtPlataforma.setText("");
        txtDesenvolvedora.setText("");
        txtSituacao.setText("");
        txtIdadeRecomendada.setText("");
        txtPreco.setText("");
    }
    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtNome.setText("");
        txtPlataforma.setText("");
        txtDesenvolvedora.setText("");
        txtSituacao.setText("");
        txtIdadeRecomendada.setText("");
        txtPreco.setText("");
        
        btnNovo.setEnabled(false);
        btnIncluir.setEnabled(true);
        txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtDesenvolvedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesenvolvedoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesenvolvedoraActionPerformed

    private void txtSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSituacaoActionPerformed

    private void txtPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlataformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlataformaActionPerformed

    private void txtIdadeRecomendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeRecomendadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeRecomendadaActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar3ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblIdade1;
    private javax.swing.JLabel lblIdade3;
    private javax.swing.JLabel lblIdade4;
    private javax.swing.JLabel lblIdade5;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDesenvolvedora;
    private javax.swing.JTextField txtIdadeRecomendada;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlataforma;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtSituacao;
    // End of variables declaration//GEN-END:variables
}
