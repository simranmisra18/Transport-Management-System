package ipproject;


import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shweta
 */
public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactnumTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        dobyrTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        passwordTf = new javax.swing.JTextField();
        repassTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("SIGN UP");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(370, 20, 110, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 100, 120, 30);
        jPanel2.add(nameTf);
        nameTf.setBounds(290, 100, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Email Id:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 140, 100, 30);
        jPanel2.add(emailTf);
        emailTf.setBounds(290, 140, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Contact Number:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 180, 155, 30);
        jPanel2.add(contactnumTf);
        contactnumTf.setBounds(290, 180, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("DOB:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 230, 80, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(290, 230, 60, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(430, 230, 80, 20);
        jPanel2.add(dobyrTf);
        dobyrTf.setBounds(570, 230, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Day:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(250, 230, 40, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Month:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(370, 230, 60, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Year:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(530, 230, 40, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Username:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 270, 120, 20);
        jPanel2.add(usernameTf);
        usernameTf.setBounds(290, 270, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("Password:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(70, 310, 140, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("Re- Enter:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 360, 100, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 450, 170, 50);
        jPanel2.add(passwordTf);
        passwordTf.setBounds(300, 320, 190, 30);
        jPanel2.add(repassTf);
        repassTf.setBounds(290, 380, 220, 30);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-20, -30, 940, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name, emailId, username, password, reEnterpass;
        String yearDob;
        String contactNo;String Day;
        String Month; String DOB;
         
         
        name= nameTf.getText();
        emailId= emailTf.getText();
        contactNo= contactnumTf.getText();
        username= usernameTf.getText();
        password= passwordTf.getText();
        reEnterpass= repassTf.getText();
        yearDob= dobyrTf.getText();
        Day= jComboBox1.getSelectedItem().toString();
        Month= jComboBox2.getSelectedItem().toString();
        DOB= Day + "/"+ Month + "/" + yearDob;
        
        
                  if(password.equals(reEnterpass))
                   
                  {JOptionPane.showMessageDialog(this," Hello "+ name + "! Thank you for visiting. Your details have been saved. Please proceed.");
                    new DestinationSelection().setVisible(true);
                  }else
                  {    
         JOptionPane.showMessageDialog(this, "Please check your password");
                   
                    
    }      
     
         
        try
        {
        Connection con =  mySqlDBConnection.getConnection();
        Statement stmt = (Statement) con.createStatement();
        String query="INSERT INTO Signup(Name, Email_Id, Contact_no, DOB, Username, Password) VALUES ('"+name+"', '"+emailId+"', '"+contactNo+"', '"+DOB+"', '"+username+"', '"+password+"');";
        //System.out.println(query);
        stmt.executeUpdate(query);
        this.setVisible(false);
        ToursUtil.setUsername( username );
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());     
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
       System.out.println("In signup main code");
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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactnumTf;
    private javax.swing.JTextField dobyrTf;
    private javax.swing.JTextField emailTf;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JTextField repassTf;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}