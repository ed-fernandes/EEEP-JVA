/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CEventos;

    
public class V_Tela extends javax.swing.JFrame {
    
    CEventos ceve = new CEventos();
    public V_Tela() {
        initComponents();
        cb_tipo.setVisible(false);
        pn_per.setVisible(false);
        bt_pedir.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Desk = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cb_eve = new javax.swing.JComboBox<>();
        cb_tipo = new javax.swing.JComboBox<>();
        bt_pedir = new javax.swing.JButton();
        pn_per = new javax.swing.JPanel();
        ck_con = new javax.swing.JCheckBox();
        ck_bf = new javax.swing.JCheckBox();
        ck_loc = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Contador/ContadorA.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cb_eve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Social", "Academico", "Corporativo", "Cultural", "Educacional" }));
        cb_eve.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 224, 164), 3, true));
        cb_eve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_eveActionPerformed(evt);
            }
        });

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        cb_tipo.setToolTipText("");
        cb_tipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 224, 164), 3, true));
        cb_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });

        bt_pedir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttonA2.png"))); // NOI18N
        bt_pedir.setContentAreaFilled(false);
        bt_pedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_pedir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buttonB1.png"))); // NOI18N
        bt_pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pedirActionPerformed(evt);
            }
        });

        pn_per.setBackground(new java.awt.Color(255, 255, 255));

        ck_con.setBackground(new java.awt.Color(255, 255, 255));
        ck_con.setText("Convidados ilimitados");
        ck_con.setBorder(null);
        ck_con.setBorderPainted(true);
        ck_con.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio2.png"))); // NOI18N
        ck_con.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio2.png"))); // NOI18N
        ck_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio1.png"))); // NOI18N
        ck_con.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio2.png"))); // NOI18N
        ck_con.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio2.png"))); // NOI18N

        ck_bf.setBackground(new java.awt.Color(255, 255, 255));
        ck_bf.setText("Bufê gourmet");
        ck_bf.setBorder(null);
        ck_bf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio1.png"))); // NOI18N
        ck_bf.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio2.png"))); // NOI18N

        ck_loc.setBackground(new java.awt.Color(255, 255, 255));
        ck_loc.setText("Local privado");
        ck_loc.setBorder(null);
        ck_loc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio1.png"))); // NOI18N
        ck_loc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/radio2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/evento-png-3.png"))); // NOI18N

        javax.swing.GroupLayout pn_perLayout = new javax.swing.GroupLayout(pn_per);
        pn_per.setLayout(pn_perLayout);
        pn_perLayout.setHorizontalGroup(
            pn_perLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perLayout.createSequentialGroup()
                .addGroup(pn_perLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ck_con)
                    .addComponent(ck_bf)
                    .addComponent(ck_loc))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pn_perLayout.setVerticalGroup(
            pn_perLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pn_perLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pn_perLayout.createSequentialGroup()
                        .addComponent(ck_con)
                        .addGap(18, 18, 18)
                        .addComponent(ck_bf)
                        .addGap(18, 18, 18)
                        .addComponent(ck_loc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Que tipo de evento você deseja?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_eve, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bt_pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(cb_eve, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pn_per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(bt_pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 400, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pesquisa-pos-evento-2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Desk.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DeskLayout = new javax.swing.GroupLayout(Desk);
        Desk.setLayout(DeskLayout);
        DeskLayout.setHorizontalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeskLayout.setVerticalGroup(
            DeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_eveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_eveActionPerformed
        if(!(cb_eve.getSelectedItem().equals("Selecione..."))){
            if(cb_eve.getSelectedItem().equals("Social")){
                cb_tipo.removeItem("Casamento");
                cb_tipo.removeItem("Aniversário");
                cb_tipo.addItem("Casamento");
                cb_tipo.addItem("Aniversário");
            }
            if(cb_eve.getSelectedItem().equals("Academico")){
                cb_tipo.removeItem("Formatura");
                cb_tipo.removeItem("Aulas Inaugurais");
                cb_tipo.addItem("Formatura");
                cb_tipo.addItem("Aulas Inaugurais");
            }
            if(cb_eve.getSelectedItem().equals("Corporativo")){
                cb_tipo.removeItem("Feiras");
                cb_tipo.removeItem("Conferências");
                cb_tipo.addItem("Feiras");
                cb_tipo.addItem("Conferências");
            }
            if(cb_eve.getSelectedItem().equals("Cultural")){
                cb_tipo.removeItem("Festivais");
                cb_tipo.removeItem("Espetaculos");
                cb_tipo.addItem("Festivais");
                cb_tipo.addItem("Espetaculos");
            }
            if(cb_eve.getSelectedItem().equals("Educacional")){
                cb_tipo.removeItem("Palestras");
                cb_tipo.removeItem("Cursos");
                cb_tipo.addItem("Palestras");
                cb_tipo.addItem("Cursos");
            }
        cb_tipo.setVisible(true);
        }else{
        pn_per.setVisible(false);
        bt_pedir.setVisible(false);
        cb_tipo.setVisible(false);    
        }
    }//GEN-LAST:event_cb_eveActionPerformed

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        if(!(cb_tipo.getSelectedItem().equals("Selecione..."))){
        pn_per.setVisible(true);
        bt_pedir.setVisible(true);
        }else{
        pn_per.setVisible(false);
        bt_pedir.setVisible(false);
        }        
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void bt_pedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pedirActionPerformed
        int con = 0;
        int bf = 0;
        int loc = 0;
        
        if(ck_con.isEnabled()){
           con = 1;
        }
        if(ck_bf.isEnabled()){
           bf = 1;
        }
        if(ck_loc.isEnabled()){
           loc = 1;
        }
        ceve.Conectar();
        ceve.Inserir( (String) cb_eve.getSelectedItem(), (String) cb_tipo.getSelectedItem(), con, bf, loc);
        ceve.Desconectar();
    }//GEN-LAST:event_bt_pedirActionPerformed


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
            java.util.logging.Logger.getLogger(V_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desk;
    private javax.swing.JButton bt_pedir;
    private javax.swing.JComboBox<String> cb_eve;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JCheckBox ck_bf;
    private javax.swing.JCheckBox ck_con;
    private javax.swing.JCheckBox ck_loc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel pn_per;
    // End of variables declaration//GEN-END:variables
}
