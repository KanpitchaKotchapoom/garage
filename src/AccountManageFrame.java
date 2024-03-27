import javax.swing.table.*;
import javax.swing.*;
public class AccountManageFrame extends javax.swing.JFrame {

    /**TableRowSorter myTableRowSorter = new TableRowSorter(AccountTable.getModel());
     * Creates new form AccountManageFrame
     */
    public AccountManageFrame() {
        initComponents();
        AccountTable.setAutoCreateRowSorter(true);
        DefaultTableModel df=(DefaultTableModel) AccountTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        WhiteBG = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountTable = new javax.swing.JTable();
        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        AddAccountButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        EquipmentButton = new javax.swing.JButton();
        CustomButton = new javax.swing.JButton();
        WarehouseButton = new javax.swing.JButton();
        InvoiceButton = new javax.swing.JButton();
        AccountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        headPanel.setBackground(new java.awt.Color(242, 157, 0));
        headPanel.setMinimumSize(new java.awt.Dimension(1290, 50));
        headPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        headPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 250, 50));

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/menu_icon_jing.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        headPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

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

        headPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 220, 50));

        WhiteBG.setBackground(new java.awt.Color(255, 255, 255));

        AccountTable.setBackground(new java.awt.Color(211, 211, 211));
        AccountTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Surname", "Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AccountTable.setRowHeight(30);
        jScrollPane1.setViewportView(AccountTable);

        SearchField.setBackground(new java.awt.Color(211, 211, 211));

        SearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchButton.setText("ค้นหา");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        AddAccountButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddAccountButton.setText("เพิ่มพนักงาน");
        AddAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WhiteBGLayout = new javax.swing.GroupLayout(WhiteBG);
        WhiteBG.setLayout(WhiteBGLayout);
        WhiteBGLayout.setHorizontalGroup(
            WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(WhiteBGLayout.createSequentialGroup()
                        .addComponent(AddAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        WhiteBGLayout.setVerticalGroup(
            WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteBGLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuBar.setBackground(new java.awt.Color(255, 204, 102));
        MenuBar.setPreferredSize(new java.awt.Dimension(200, 670));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(255, 102, 0));
        HomeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("หน้าโฮม");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        MenuBar.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 70));

        EquipmentButton.setBackground(new java.awt.Color(255, 102, 0));
        EquipmentButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EquipmentButton.setForeground(new java.awt.Color(255, 255, 255));
        EquipmentButton.setText("เบิกอุปกรณ์");
        EquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentButtonActionPerformed(evt);
            }
        });
        MenuBar.add(EquipmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 230, 220, 70));

        CustomButton.setBackground(new java.awt.Color(255, 102, 0));
        CustomButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomButton.setText("จัดการคิวรถ");
        CustomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomButtonActionPerformed(evt);
            }
        });
        MenuBar.add(CustomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 220, 70));

        WarehouseButton.setBackground(new java.awt.Color(255, 102, 0));
        WarehouseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        WarehouseButton.setForeground(new java.awt.Color(255, 255, 255));
        WarehouseButton.setText("คลังอุปกรณ์");
        WarehouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarehouseButtonActionPerformed(evt);
            }
        });
        MenuBar.add(WarehouseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 330, 220, 70));

        InvoiceButton.setBackground(new java.awt.Color(255, 102, 0));
        InvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InvoiceButton.setForeground(new java.awt.Color(255, 255, 255));
        InvoiceButton.setText("ใบเสร็จ");
        InvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceButtonActionPerformed(evt);
            }
        });
        MenuBar.add(InvoiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, 220, 70));

        AccountButton.setBackground(new java.awt.Color(255, 102, 0));
        AccountButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AccountButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountButton.setText("จัดการพนักงาน");
        AccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountButtonActionPerformed(evt);
            }
        });
        MenuBar.add(AccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 530, 220, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(WhiteBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WhiteBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) AccountTable.getModel();
        TableRowSorter<DefaultTableModel> obj= new TableRowSorter<>(ob);
        AccountTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(SearchField.getText()));
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void CustomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomButtonActionPerformed

    private void EquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipmentButtonActionPerformed

    private void WarehouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarehouseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarehouseButtonActionPerformed

    private void InvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceButtonActionPerformed

    private void AccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountButtonActionPerformed

    private void AddAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountButtonActionPerformed
        // TODO add your handling code here:
        CreateAccFrame Sign = new CreateAccFrame();
        Sign.setVisible(true);
    }//GEN-LAST:event_AddAccountButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (MenuBar.isVisible()) {
            MenuBar.setVisible(false);
        } else {
            MenuBar.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(AccountManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new AccountManageFrame().setVisible(true);
            }
        });
    }
    
    public JButton getHomeButton(){
        return this.HomeButton;
    }
    
    public JButton getManagementButton(){
        return this.CustomButton;
    }
    
    public JButton getEquipmentButton(){
        return this.EquipmentButton;
    }
    
    public JButton getWarehouseButton(){
        return this.WarehouseButton;
    }
    
    public JButton getReceiptButton(){
        return this.InvoiceButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountButton;
    private javax.swing.JTable AccountTable;
    private javax.swing.JButton AddAccountButton;
    private javax.swing.JButton CustomButton;
    private javax.swing.JButton EquipmentButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton InvoiceButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton WarehouseButton;
    private javax.swing.JPanel WhiteBG;
    private javax.swing.JPanel headPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
