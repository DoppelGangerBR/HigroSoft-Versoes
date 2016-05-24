/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.CulturaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Principal.updateView;

/**
 *
 * @author Alvaro
 */
public class TelaCulturas extends javax.swing.JFrame {
        private static String NomeCultura ;
        private int UmidadeMinima;
        private int id;
    CulturaDAO Conexao = new CulturaDAO();

    public TelaCulturas() throws SQLException {
        initComponents();
        this.AtualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnCadastrarCultura = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        BtnRemoverCultura = new javax.swing.JButton();
        BtnAlterarCultura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        TxtNomeDaCultura = new javax.swing.JTextField();
        TxtUmidadeMinima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnAgendarIrrigacao = new javax.swing.JButton();
        BtnSelecionaCulturaComoAtiva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de culturas");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BtnCadastrarCultura.setBackground(new java.awt.Color(255, 255, 255));
        BtnCadastrarCultura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnCadastrarCultura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sprout.png"))); // NOI18N
        BtnCadastrarCultura.setText("<HTML>\n<HEAD>\n</HEAD>\n<center>\nCadastrar<br>\nCultura\n</center>\n</BODY>\n</HTML>");
        BtnCadastrarCultura.setBorderPainted(false);
        BtnCadastrarCultura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCadastrarCultura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnCadastrarCultura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCadastrarCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarCulturaActionPerformed(evt);
            }
        });

        BtnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        BtnVoltar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Export-48.png"))); // NOI18N
        BtnVoltar.setText("Sair");
        BtnVoltar.setBorderPainted(false);
        BtnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVoltar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BtnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        BtnRemoverCultura.setBackground(new java.awt.Color(255, 255, 255));
        BtnRemoverCultura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnRemoverCultura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sproutRemover.png"))); // NOI18N
        BtnRemoverCultura.setText("<HTML>\n<HEAD>\n</HEAD>\n<center>\nRemover<br>\nCultura\n</center>\n</BODY>\n</HTML>");
        BtnRemoverCultura.setBorderPainted(false);
        BtnRemoverCultura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRemoverCultura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnRemoverCultura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnRemoverCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverCulturaActionPerformed(evt);
            }
        });

        BtnAlterarCultura.setBackground(new java.awt.Color(255, 255, 255));
        BtnAlterarCultura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnAlterarCultura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sproutAlterar.png"))); // NOI18N
        BtnAlterarCultura.setText("<HTML>\n<HEAD>\n</HEAD>\n<center>\nAlterar<br>\nCultura\n</center>\n</BODY>\n</HTML>");
        BtnAlterarCultura.setBorderPainted(false);
        BtnAlterarCultura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAlterarCultura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAlterarCultura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAlterarCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarCulturaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Culturas cadastradas");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/question.png"))); // NOI18N
        jLabel4.setToolTipText("<HTML>\n<HEAD>\n</HEAD>\nPara remover uma cultura, basta seleciona-la na tabela ao lado e clicar na opão \"Remover Cultura\".<br>\nPara alterar uma uma cultura, basta seleciona-la na tabela ao lado, e usar os campos acima para mudar<br> \no nome e umidade minima, depois, clique na opção \"Alterar Cultura\" para altera-la\n</BODY>\n</HTML>");

        TxtNomeDaCultura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtUmidadeMinima.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nome da Cultura.:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Umidade minima.:");

        jLabel5.setText("%");

        BtnAgendarIrrigacao.setBackground(new java.awt.Color(255, 255, 255));
        BtnAgendarIrrigacao.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnAgendarIrrigacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/sproutAgendar.png"))); // NOI18N
        BtnAgendarIrrigacao.setText("<HTML>\n<HEAD>\n</HEAD>\n<center>\nAgendar<br>\nIrrigação\n</center>\n</BODY>\n</HTML>");
        BtnAgendarIrrigacao.setBorderPainted(false);
        BtnAgendarIrrigacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAgendarIrrigacao.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAgendarIrrigacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BtnSelecionaCulturaComoAtiva.setBackground(new java.awt.Color(255, 255, 255));
        BtnSelecionaCulturaComoAtiva.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnSelecionaCulturaComoAtiva.setText("<HTML>\n<HEAD>\n</HEAD>\n<center>\nSelecionar<br>\ncomo ativa\n</center>\n</BODY>\n</HTML>");
        BtnSelecionaCulturaComoAtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelecionaCulturaComoAtivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnCadastrarCultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnRemoverCultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnAlterarCultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnAgendarIrrigacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(BtnVoltar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtNomeDaCultura, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtUmidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(BtnSelecionaCulturaComoAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnCadastrarCultura)
                    .addComponent(BtnAgendarIrrigacao)
                    .addComponent(BtnAlterarCultura)
                    .addComponent(BtnRemoverCultura)
                    .addComponent(BtnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeDaCultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUmidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSelecionaCulturaComoAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadastrarCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarCulturaActionPerformed
        new CadastroDeCulturas().setVisible(true);
    }//GEN-LAST:event_BtnCadastrarCulturaActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void BtnRemoverCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverCulturaActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover a cultura selecionada?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirmacao == JOptionPane.YES_OPTION) {
            int index = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(index, 0).toString();
            try {
                Conexao.DeletaCultura(Integer.parseInt(id));
                this.AtualizaTabela();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BtnRemoverCulturaActionPerformed

    private void BtnAlterarCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarCulturaActionPerformed
            int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar a cultura selecionada?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirmacao == JOptionPane.YES_OPTION) {            
            try {
                int UmidadeMinima = Integer.parseInt(this.TxtUmidadeMinima.getText());
                if (UmidadeMinima > 100 || UmidadeMinima <= 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha apenas com numeros de 1 a 100");
                } else {
                    Conexao.AtualizaCultura(id, this.TxtNomeDaCultura.getText(), Integer.parseInt(this.TxtUmidadeMinima.getText()));
                    TxtNomeDaCultura.setText("");
                    TxtUmidadeMinima.setText("");
                    this.AtualizaTabela();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(TelaCulturas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, preencha o campo de umidade minima e use apenas numeros");
            }
        }
    }//GEN-LAST:event_BtnAlterarCulturaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        this.TxtNomeDaCultura.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        this.TxtUmidadeMinima.setText((jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString()));        
        NomeCultura = this.TxtNomeDaCultura.getText();
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnSelecionaCulturaComoAtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelecionaCulturaComoAtivaActionPerformed
        Principal principal = new Principal();
        Principal.updateView SetaLabelCulturaAtiva = principal.new updateView();
        SetaLabelCulturaAtiva.setCulturaAtiva(NomeCultura);
    }//GEN-LAST:event_BtnSelecionaCulturaComoAtivaActionPerformed

    public void AtualizaTabela() throws SQLException {
        DefaultTableModel dm = new CulturaDAO().AlimentaTabela();
        jTable1.setModel(dm);
    }

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
            java.util.logging.Logger.getLogger(TelaCulturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCulturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCulturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCulturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCulturas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCulturas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgendarIrrigacao;
    private javax.swing.JButton BtnAlterarCultura;
    private javax.swing.JButton BtnCadastrarCultura;
    private javax.swing.JButton BtnRemoverCultura;
    private javax.swing.JButton BtnSelecionaCulturaComoAtiva;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JTextField TxtNomeDaCultura;
    private javax.swing.JTextField TxtUmidadeMinima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
