/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controller.UsuarioCtr;
import Model.Chamado;
import Model.ChamadoDAO;
import Model.Erros;
import Model.ErrosDAO;
import Model.Usuario;
import Model.UsuarioDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class jifChamados extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifChamados
     */
    public jifChamados() {
        initComponents();
        jLabel4.setVisible(false);
        ChamadoDAO dao = new ChamadoDAO();
        ArrayList resultadoChamados = dao.pequisar();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        JTable jTable1 = new JTable(model);

        model.addColumn("Cod");
        model.addColumn("Data");
        model.addColumn("Usuário");
        model.addColumn("Erro");
        model.addColumn("Prioridade");
        model.setNumRows(0);

// ---------------- ATUALIZA TABELA DE CHAMADOS ----------------------
        String prioridade = "";
        Collection<Chamado> lista = resultadoChamados;
        //Collections.sort(resultadoChamados);
        Iterator<Chamado> it = lista.iterator();
        while (it.hasNext()) {
            Chamado chamados = it.next();
            switch (chamados.getErro().getPrioridade()) {
                case 1:
                    prioridade = "Urgente";
                    break;
                case 2:
                    prioridade = "Alta";
                    break;
                case 3:
                    prioridade = "Média";
                    break;
                case 4:
                    prioridade = "Baixa";
                    break;
            }
            if (chamados.getStatus().equals("Aberto")) {
                model.addRow(new String[]{chamados.getCodigo(), chamados.getDataAbertura(), chamados.getUsuario().getNome(), chamados.getErro().getNome(), prioridade});
            }
        }
        jTable1.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Chamados Abertos");
        setMinimumSize(new java.awt.Dimension(150, 600));
        setSize(new java.awt.Dimension(1000, 700));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setText("Atender");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {
            }
        ));
        jTable1.setToolTipText("Selecione o chamado a ser atendido");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aberto", "Em Atendimento", "Finalizado", "Todos" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Chamados");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Descrição do Erro:");

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/Fernando/NetBeansProjects/Etkt/logo_peq.png")); // NOI18N

        jLabel4.setText("ert");
        jLabel4.setEnabled(false);

        jLabel5.setText("Responsável pelo atendimento:");

        jButton2.setText("Transfere Atendimento");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked


    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();

        String cod = jTable1.getValueAt(row, 0).toString();
        ChamadoDAO dao = new ChamadoDAO();
        Chamado chama = dao.pesquisar(cod);

        jTextArea1.setText(chama.getDescricao());
        jLabel6.setText(chama.getRespAtend().toString());

        jButton1.setEnabled(true);
        if (jComboBox1.getSelectedItem() == "Em Atendimento") {
            jButton2.setEnabled(true);
        } else {
            jButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String status = (String) jComboBox1.getSelectedItem().toString();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        JTable jTable1 = new JTable(model);
        model.setNumRows(0);

        ChamadoDAO dao = new ChamadoDAO();
        ArrayList chama = dao.pequisar();
        String prioridade = "";
        Collection<Chamado> lista = chama;
        Iterator<Chamado> it = lista.iterator();
        while (it.hasNext()) {
            Chamado chamados = it.next();
            switch (chamados.getErro().getPrioridade()) {
                case 1:
                    prioridade = "Urgente";
                    break;
                case 2:
                    prioridade = "Alta";
                    break;
                case 3:
                    prioridade = "Média";
                    break;
                case 4:
                    prioridade = "Baixa";
                    break;
            }
            if (chamados.getStatus().equals(status)) {
                model.addRow(new String[]{chamados.getCodigo(), chamados.getDataAbertura(), chamados.getUsuario().getNome(), chamados.getErro().getNome(), prioridade});

            }
        }
        jTable1.setVisible(true);

        if (jComboBox1.getSelectedItem() == "Em Atendimento") {
            jButton1.setText("Finalizar");
            jButton1.setEnabled(false);
            jButton1.setVisible(true);
            jButton2.setEnabled(false);
        } else if (jComboBox1.getSelectedItem() == "Aberto") {
            jButton1.setText("Atender");
            jButton1.setEnabled(false);
            jButton1.setVisible(true);
            jButton2.setEnabled(false);
        } else {
            jButton1.setVisible(false);
            jButton2.setEnabled(false);
        }


    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int row = jTable1.getSelectedRow();

        UsuarioDAO user = new UsuarioDAO();
        ArrayList resultadoUsuarios = user.pequisar();

        ChamadoDAO dao = new ChamadoDAO();

        String cod = jTable1.getValueAt(row, 0).toString();
        String dataA = jTable1.getValueAt(row, 1).toString();
        String username = jTable1.getValueAt(row, 2).toString();
        String desc = jTextArea1.getText();
        String dataF = "";
        String status = "";
        
        if (jComboBox1.getSelectedItem().toString().equals("Em Atendimento")) {
            String erro = jTable1.getValueAt(row, 3).toString();
            Chamado chama = dao.pesquisar(cod);
            status = "Finalizado";
        } else if (jComboBox1.getSelectedItem().toString().equals("Aberto")) {
            String erro = jTable1.getValueAt(row, 3).toString();
            Chamado chama = dao.pesquisar(cod);
            status = "Em Atendimento";
        }

        Usuario usuarioChamado = null;
        Collection<Usuario> lista = resultadoUsuarios;
        Iterator<Usuario> it = lista.iterator();
        while (it.hasNext()) {
            Usuario usuario = it.next();
            if (usuario.getNome().equals(username)) {
                usuarioChamado = usuario;
            }
        }

        String erro = jTable1.getValueAt(row, 3).toString();
        ErrosDAO erros = new ErrosDAO();
        ArrayList resultadoErros = erros.pequisar();
        Erros erroChamado = null;

        Collection<Erros> listErros = resultadoErros;
        Iterator<Erros> itErros = listErros.iterator();
        while (itErros.hasNext()) {
            Erros er = itErros.next();
            if (er.getNome().equals(erro)) {
                erroChamado = er;
            }
        }

        String atend = jLabel4.getText();
        JOptionPane.showMessageDialog(null, atend);
        Chamado chamado = new Chamado(cod, desc, dataA, dataF, status, atend);
        chamado.setUsuario((Usuario) usuarioChamado);
        chamado.setErro((Erros) erroChamado);
        dao.editar(chamado);
        dao.finalizar();
    }//GEN-LAST:event_jButton1MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        jLabel4.setText(this.getTitle());
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UsuarioDAO user = new UsuarioDAO();
        ArrayList resultadoUsuarios = user.pequisarNome();
        Object[] users = resultadoUsuarios.toArray();
        
        Object usr = JOptionPane.showInputDialog(null, "Selecione o atendente que receberá a transferência:\n", "Transferência de Atendimento",
                                   JOptionPane.QUESTION_MESSAGE,
                                   null,
                                   users,
                                   users[0]);
        
        int row = jTable1.getSelectedRow();
        ChamadoDAO chamado = new ChamadoDAO();
        Chamado chamSelecionado = chamado.pesquisar(jTable1.getValueAt(row, 0).toString());
        chamSelecionado.setRespAtend(usr.toString());
        chamado.editar(chamSelecionado);
        chamado.finalizar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        String u = this.getTitle();
        Usuario user = UsuarioCtr.pesquisaUsuario(u);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
