
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
//import com.sun.jdi.connect.spi.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 91830
 */
public class RegistrationPage extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationPage
     */
    public RegistrationPage() {
        initComponents();
    }
    public boolean validation(){
        String fname,lname,email,password,confpass,contactno;
        Date DOB;
        fname=jTxtfn.getText();
        lname=jTxtlnln.getText();
        email=jTxtemail.getText();
        password=jTxtpassword.getText();
        confpass=jTxtconfPass.getText();
        DOB=jdateDOB.getDate();
        contactno=jTxtcontactno.getText();
        if(fname.equals("")){
            JOptionPane.showMessageDialog(this,"please enter first name");
            return false;
        }
        if(lname.equals("")){
            JOptionPane.showMessageDialog(this,"please enter last name");
            return false;
        }
        if(email.equals("")){
            JOptionPane.showMessageDialog(this,"please enter the email");
            return false;
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(this,"please enter password");
            return false;
        }
        if(confpass.equals("")){
            JOptionPane.showMessageDialog(this,"please enter your confirm password");
            return false;
        }
        if(DOB==null){
            JOptionPane.showMessageDialog(this,"please enter date of birth");
            return false;
        }
        if(contactno.equals("")){
            JOptionPane.showMessageDialog(this,"please enter your ContactNo");
            return false;
        }
        if(!password.equals(confpass)){
            JOptionPane.showMessageDialog(this,"password not matched,please try again");
            return false;
        }
        
        return true;
    }
    public void insertIntodb(){
        String FirstName,LastName,Email,Password,ConfPassword,ContactNo;
        String DOB;
       FirstName=jTxtfn.getText();
        LastName=jTxtlnln.getText();
        Email=jTxtemail.getText();
        Password=jTxtpassword.getText();
        ConfPassword=jTxtconfPass.getText();
        SimpleDateFormat dateformat =new SimpleDateFormat("yyyy-MM-dd");
        DOB = dateformat.format(jdateDOB.getDate());
       ContactNo=jTxtcontactno.getText();
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
            Statement st=(Statement) conn.createStatement();
            String sql = "insert into students values(' " + FirstName + " ' ,' " + LastName + " ' ,' " + Email + " ' ,' "  + Password + " ' ,' " + ConfPassword + " ' ,' " + DOB + " ' , " + ContactNo + "  )";
            st.execute(sql);
            JOptionPane.showMessageDialog(this,"Account created");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
            
        
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTxtfn = new javax.swing.JTextField();
        jTxtlnln = new javax.swing.JTextField();
        jTxtemail = new javax.swing.JTextField();
        jTxtconfPass = new javax.swing.JPasswordField();
        jTxtpassword = new javax.swing.JPasswordField();
        jTxtcontactno = new javax.swing.JTextField();
        jdateDOB = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("First Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E-mail :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Retype Pass :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Birth Date :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 110, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ContactNo. :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 30));

        jTxtfn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtfnActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 220, 30));

        jTxtlnln.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTxtlnln, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, 30));

        jTxtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtemailActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, 30));

        jTxtconfPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtconfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtconfPassActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtconfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 220, 30));

        jTxtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jTxtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 220, 30));

        jTxtcontactno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtcontactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtcontactnoActionPerformed(evt);
            }
        });
        jPanel2.add(jTxtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 220, 30));

        jdateDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jdateDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 220, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 130, 30));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\91830\\OneDrive\\Documents\\NetBeansProjects\\Authenticationsystems\\src\\registerimg.jpeg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtfnActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         if (validation()==true)
        insertIntodb();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTxtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtemailActionPerformed

    private void jTxtconfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtconfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtconfPassActionPerformed

    private void jTxtcontactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtcontactnoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTxtconfPass;
    private javax.swing.JTextField jTxtcontactno;
    private javax.swing.JTextField jTxtemail;
    private javax.swing.JTextField jTxtfn;
    private javax.swing.JTextField jTxtlnln;
    private javax.swing.JPasswordField jTxtpassword;
    private com.toedter.calendar.JDateChooser jdateDOB;
    // End of variables declaration//GEN-END:variables
}
