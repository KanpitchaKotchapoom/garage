
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ManageCarFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageCarFrame
     */
    public ManageCarFrame() {
        initComponents();
//        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JPanel();
        logPanel = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        receipt_bn = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        equipment_bn = new javax.swing.JButton();
        warehouse_bn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Header.setBackground(new java.awt.Color(242, 157, 0));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(242, 157, 0));
        jTextField1.setFont(new java.awt.Font("IrisUPC", 3, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ดำรงรวยการช่าง ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Header.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 250, 50));

        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(242, 157, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("@USERNAME");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Header.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 220, 50));

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\TestIcon\\menu_icon_jing.png"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Header.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        MenuBar.setBackground(new java.awt.Color(255, 204, 102));
        MenuBar.setPreferredSize(new java.awt.Dimension(200, 670));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuBar.add(logPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 200, 70));

        jToggleButton3.setText("sth only admin see");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        MenuBar.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 70));

        receipt_bn.setBackground(new java.awt.Color(255, 102, 0));
        receipt_bn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        receipt_bn.setForeground(new java.awt.Color(255, 255, 255));
        receipt_bn.setText("RECEIPT");
        receipt_bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_bnActionPerformed(evt);
            }
        });
        MenuBar.add(receipt_bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 360, 220, 70));

        HomeButton.setBackground(new java.awt.Color(255, 102, 0));
        HomeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("HOME");
        HomeButton.setBorder(null);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        MenuBar.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 220, 70));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.setText("MANAGEMENT");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MenuBar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 220, 70));

        equipment_bn.setBackground(new java.awt.Color(255, 102, 0));
        equipment_bn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        equipment_bn.setForeground(new java.awt.Color(255, 255, 255));
        equipment_bn.setText("EQUIPMENT");
        equipment_bn.setBorder(null);
        equipment_bn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipment_bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipment_bnActionPerformed(evt);
            }
        });
        MenuBar.add(equipment_bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 220, 70));

        warehouse_bn.setBackground(new java.awt.Color(255, 102, 0));
        warehouse_bn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        warehouse_bn.setForeground(new java.awt.Color(255, 255, 255));
        warehouse_bn.setText("WAREHOUSE");
        warehouse_bn.setBorder(null);
        warehouse_bn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        warehouse_bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouse_bnActionPerformed(evt);
            }
        });
        MenuBar.add(warehouse_bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 270, 220, 70));

        getContentPane().add(MenuBar, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ch", "ID", "brand", "name", "status", "date_in", "date_out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(2);
        }

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (MenuBar.isVisible()) {
            MenuBar.setVisible(false);
        } else {
            MenuBar.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        if (logPanel.isVisible()) {
            logPanel.setVisible(false);
        } else {
            logPanel.setVisible(true);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void receipt_bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receipt_bnActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void equipment_bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipment_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipment_bnActionPerformed

    private void warehouse_bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouse_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehouse_bnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void populateTable(){
        String columns[] = {"ID", "ch", "reg_number", "brand", "name", "status", "date_in", "date_out"};
        String data[][] = {{"test"}
            
        };
        DefaultTableModel model = new DefaultTableModel(data, columns);
        jTable2.setModel(model);
    }
    
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
            java.util.logging.Logger.getLogger(ManageCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageCarFrame mcf = new ManageCarFrame();
                mcf.setVisible(true);
                mcf.setSize(1280, 720);
                mcf.setTitle("ดำรงรวยการช่าง");

            }
        });
    }
    
    public JButton getHomeButton(){
        return this.HomeButton;
    }
    
    public JButton getEquipmentButton(){
        return this.equipment_bn;
    }
    
    public JButton getWarehouseButton(){
        return this.warehouse_bn;
    }
    
    public JButton getReceiptButton(){
        return this.receipt_bn;
    }
    
    public JTable getTable(){
        return this.jTable2;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton equipment_bn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JPanel logPanel;
    private javax.swing.JButton receipt_bn;
    private javax.swing.JButton warehouse_bn;
    // End of variables declaration//GEN-END:variables
}
