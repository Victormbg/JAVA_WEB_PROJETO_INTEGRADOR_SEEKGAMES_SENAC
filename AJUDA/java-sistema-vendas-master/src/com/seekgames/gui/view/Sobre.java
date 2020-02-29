package com.seekgames.gui.view;


public class Sobre extends javax.swing.JDialog {

    public Sobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbIcone = new javax.swing.JLabel();
        taTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/seekgames/gui/img/sobre.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(lbIcone, gridBagConstraints);

        taTexto.setEditable(false);
        taTexto.setColumns(20);
        taTexto.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        taTexto.setRows(5);
        taTexto.setText("Sistema de Aluguel de Jogos\n\nNossa Missão\nÉ proporcionar aos proprietários de consoles \nde videogames uma oportunidade de poder jogar diversos \ntítulos sem ter que gastar muito com a compra de jogos.\n\nAlém disso, com o sistema de aluguel, é possível \nexperimentar jogos diferentes dos habituais sem a \npreocupação de que esse será divertido ou não.\n\n\nSEEKGAMES© 2019 Todos os Direitos Reservados.\n");
        taTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        taTexto.setOpaque(false);
        getContentPane().add(taTexto, new java.awt.GridBagConstraints());

        setSize(new java.awt.Dimension(412, 269));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcone;
    private javax.swing.JTextArea taTexto;
    // End of variables declaration//GEN-END:variables
}
