/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author house
 */
public class BuscaPaciente extends javax.swing.JDialog {

    /**
     * Creates new form ModeloBuscas_2024
     
     */
    public BuscaPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
   
    public JButton getjButtonFiltrar() {
        return jButtonFiltrar;
    }

    public JButton getjButtonCarregar() {
        return jButtonCarregar;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public JComboBox<String> getjCBFiltro() {
        return jCBFiltro;
    }

    public void setjCBFiltro(JComboBox<String> jCBFiltro) {
        this.jCBFiltro = jCBFiltro;
    }

    public JTextField getjTFFiltro() {
        return jTFFiltro;
    }

    public void setjTFFiltro(JTextField jTFFiltro) {
        this.jTFFiltro = jTFFiltro;
    }

    public JTable getjTableDados() {
        return jTableDados;
    }

    public void setjTableDados(JTable jTableDados) {
        this.jTableDados = jTableDados;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneltitulo = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanelFiltros = new javax.swing.JPanel();
        jCBFiltro = new javax.swing.JComboBox<>();
        jLabelFiltrar = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jTFFiltro = new javax.swing.JTextField();
        jButtonCarregar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projeto de Gestão Hospitalar");
        setResizable(false);

        jPaneltitulo.setBackground(new java.awt.Color(255, 102, 0));
        jPaneltitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitulo1.setBackground(new java.awt.Color(255, 102, 0));
        jLabelTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Lista de Pacientes");
        jLabelTitulo1.setToolTipText("");

        javax.swing.GroupLayout jPaneltituloLayout = new javax.swing.GroupLayout(jPaneltitulo);
        jPaneltitulo.setLayout(jPaneltituloLayout);
        jPaneltituloLayout.setHorizontalGroup(
            jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPaneltituloLayout.setVerticalGroup(
            jPaneltituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneltituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Contato", "CPF "
            }
        ));
        jTableDados.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableDados.getColumnModel().getColumn(1).setMaxWidth(220);
            jTableDados.getColumnModel().getColumn(2).setMaxWidth(145);
            jTableDados.getColumnModel().getColumn(3).setMaxWidth(145);
        }

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        jPanelFiltros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCBFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Contato", "Status" }));
        jCBFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFiltroActionPerformed(evt);
            }
        });

        jLabelFiltrar.setText("Filtrar Por");

        jLabelValor.setText("Valor");

        jButtonCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Load.png"))); // NOI18N
        jButtonCarregar.setText("Carregar");
        jButtonCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Fechar");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltrosLayout = new javax.swing.GroupLayout(jPanelFiltros);
        jPanelFiltros.setLayout(jPanelFiltrosLayout);
        jPanelFiltrosLayout.setHorizontalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addComponent(jButtonCarregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFiltrar)
                            .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                                .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelValor))))
                .addContainerGap())
        );
        jPanelFiltrosLayout.setVerticalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFiltrar)
                    .addComponent(jLabelValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarregar)
                    .addComponent(jButtonSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPaneltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPaneltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarregarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jCBFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscaPaciente dialog = new BuscaPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarregar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jCBFiltro;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelFiltros;
    private javax.swing.JPanel jPaneltitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltro;
    private javax.swing.JTable jTableDados;
    // End of variables declaration//GEN-END:variables
}
