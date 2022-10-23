
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JJ Mangampat
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Rounded", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 42, 42));
        jLabel3.setText("Employee Allowance");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Rounded", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 42, 42));
        jLabel1.setText("Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnreg.png"))); // NOI18N
        btnRegister.setText("REGISTER NEW EMPLOYEE");
        btnRegister.setAlignmentY(0.0F);
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setIconTextGap(-10);
        btnRegister.setInheritsPopupMenu(true);
        btnRegister.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRegister.setName(""); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 70));

        btnManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnmanage.png"))); // NOI18N
        btnManage.setText("MANAGE EMPLOYEE ALLOWANCE");
        btnManage.setAlignmentY(0.0F);
        btnManage.setBorder(null);
        btnManage.setBorderPainted(false);
        btnManage.setContentAreaFilled(false);
        btnManage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManage.setIconTextGap(-10);
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        getContentPane().add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 160, 70));

        jLabel4.setFont(new java.awt.Font("HelvLight", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 42, 42));
        jLabel4.setText("Employee Allowance Management System is a program");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("HelvLight", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 42, 42));
        jLabel5.setText("established by the adinistrator for purposes of recording");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("HelvLight", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 42, 42));
        jLabel6.setText("the allocation, transfer, or deduction of annual allowances.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnout.setFont(new java.awt.Font("Catamaran SemiBold", 0, 12)); // NOI18N
        btnout.setForeground(new java.awt.Color(153, 153, 153));
        btnout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnout.png"))); // NOI18N
        btnout.setText("Logout");
        btnout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnout.setIconTextGap(-8);
        btnout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnoutMouseClicked(evt);
            }
        });
        getContentPane().add(btnout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main1form480.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        Employee emp = new Employee();
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        
        Allowance allo = new Allowance();
        allo.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnoutMouseClicked
        // TODO add your handling code here:
        
        new LoginForm().setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Logout Successful!", "Logout Success", 1);
    }//GEN-LAST:event_btnoutMouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel btnout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
