package ipproject;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shweta
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginUsernameTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        goSignup = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        loginPasswordTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(975, 520));
        setPreferredSize(new java.awt.Dimension(975, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Username:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 60, 140, 40);

        loginUsernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameTfActionPerformed(evt);
            }
        });
        jPanel2.add(loginUsernameTf);
        loginUsernameTf.setBounds(250, 70, 180, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Password:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 140, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sign Up");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(300, 190, 50, 30);

        goSignup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        goSignup.setText("?");
        goSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goSignupActionPerformed(evt);
            }
        });
        jPanel2.add(goSignup);
        goSignup.setBounds(360, 190, 39, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(200, 290, 130, 30);
        jPanel2.add(loginPasswordTf);
        loginPasswordTf.setBounds(250, 140, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desert.jpg"))); // NOI18N
        jLabel2.setText("Password");
        jLabel2.setMaximumSize(new java.awt.Dimension(900, 748));
        jLabel2.setMinimumSize(new java.awt.Dimension(900, 748));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(900, 748));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 970, 570);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 990, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goSignupActionPerformed
        // TODO add your handling code here:
        new signUp().setVisible(true);
        
          
    }//GEN-LAST:event_goSignupActionPerformed

    private void loginUsernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameTfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String lUsername, lPassword;
        lUsername= loginUsernameTf.getText();
        lPassword= loginPasswordTf.getText();
        
        loginUsernameTf.setText("");
        loginPasswordTf.setText("");        
        
        try
        {
            Connection con =  mySqlDBConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            String query="SELECT 1 FROM signup WHERE Username='" + lUsername  + "'    AND Password='" + lPassword + "'";
           //System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.isBeforeFirst()){          //rs.isBeforeFirst() is true if the cursor
                                               //is before the first row.  If rs contains
                                               //no rows, rs.isBeforeFirst() is false.

                   JOptionPane.showMessageDialog(this, "Login Failed. Please try Again!");
             }
            else{
                JOptionPane.showMessageDialog(this, "Login Successful. Welcome!");  
                
                new DestinationSelection().setVisible(true);
                
                ToursUtil.setUsername( lUsername );
                
                this.dispose();
            }
        }catch (SQLException e){
            System.out.println("Error in mySQL Query");
            
        }                 
        

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goSignup;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginPasswordTf;
    private javax.swing.JTextField loginUsernameTf;
    // End of variables declaration//GEN-END:variables
}
