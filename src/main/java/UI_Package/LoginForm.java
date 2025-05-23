package UI_Package;

import ClassPackage.UserClass;
import javax.swing.JOptionPane;

/**
 * LoginForm class provides a GUI for user login.
 * Handles user authentication and navigation to other interfaces.
 * 
 * @author Praveen Dani
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Constructor to initialize the LoginForm.
     */
    public LoginForm() {
        initComponents();
    }

    /**
     * Initializes the components of the LoginForm.
     * This method is auto-generated by the Form Editor.
     * It sets up the layout, labels, buttons, and input fields.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Panel to hold all components
        jPanel1 = new javax.swing.JPanel();
        // Label for the form title
        jLabel1 = new javax.swing.JLabel();
        // Label for User ID
        jLabel2 = new javax.swing.JLabel();
        // Text field for entering User ID
        txtUserID = new javax.swing.JTextField();
        // Password field for entering User Password
        txtUserPassword = new javax.swing.JPasswordField();
        // Label for User Password
        jLabel3 = new javax.swing.JLabel();
        // Button to trigger login action
        btnLogin = new javax.swing.JButton();
        // Button to go back to the home screen
        btnHomeScreen = new javax.swing.JButton();

        // Set default close operation for the frame
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Set properties for the form title label
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // Bold, size 24
        jLabel1.setText("Login Form");

        // Set properties for User ID label
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // Italic, size 14
        jLabel2.setText("User ID");

        // Set properties for User ID text field
        txtUserID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // Plain, size 14
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });

        // Set properties for User Password field
        txtUserPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // Plain, size 14

        // Set properties for User Password label
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // Italic, size 14
        jLabel3.setText("User Password");

        // Set properties for Login button
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // Bold, size 14
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        // Set properties for Home Screen button
        btnHomeScreen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // Bold, size 14
        btnHomeScreen.setText("Go to Home Screen");
        btnHomeScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeScreenActionPerformed(evt);
            }
        });

        // Layout setup for the panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(btnLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnHomeScreen)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtUserPassword))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHomeScreen)
                    .addComponent(btnLogin))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        // Layout setup for the main frame
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        // Adjusts frame size to fit components
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action performed when the User ID text field is used.
     * Currently, no additional handling is implemented.
     */
    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
    }//GEN-LAST:event_txtUserIDActionPerformed

    /**
     * Action performed when the Login button is clicked.
     * Validates input fields, checks credentials, and navigates to the main interface on success.
     */
    @SuppressWarnings("deprecation")
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         // Check if either User ID or Password is empty
         if (txtUserID.getText().isEmpty() || txtUserPassword.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"Login credentials cannot be blank." ,"Login", 
                    JOptionPane.ERROR_MESSAGE);
        } 
        else {
            // Get user input
            String username = txtUserID.getText();
            String password = txtUserPassword.getText();
            
            // Create UserClass object and validate login
            UserClass user = new UserClass(username, password);
            if (user.validateLogin()) {
                // Show success message and open main interface
                JOptionPane.showMessageDialog(null,"Login Successfull" ,"Login ",
                        JOptionPane.INFORMATION_MESSAGE);
                
                MainInterface mainForm = new MainInterface(user.getUserID(),user.getUserType());               
                mainForm.show();
                this.dispose(); // Close login form
            } 
            else {
                // Show failure message
                JOptionPane.showMessageDialog(null,"Login Fail" ,"Login", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Action performed when the Home Screen button is clicked.
     * Navigates back to the WelcomeInterface.
     */
    @SuppressWarnings("deprecation")
    private void btnHomeScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeScreenActionPerformed
        WelcomeInterface obj=new WelcomeInterface();
        obj.show();
        this.dispose(); // Close login form
    }//GEN-LAST:event_btnHomeScreenActionPerformed

    /**
     * Main method to launch the LoginForm.
     * Sets the look and feel and displays the form.
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Button to go to home screen
    private javax.swing.JButton btnHomeScreen;
    // Button to perform login
    private javax.swing.JButton btnLogin;
    // Label for form title
    private javax.swing.JLabel jLabel1;
    // Label for User ID
    private javax.swing.JLabel jLabel2;
    // Label for User Password
    private javax.swing.JLabel jLabel3;
    // Main panel for the form
    private javax.swing.JPanel jPanel1;
    // Text field for User ID input
    private javax.swing.JTextField txtUserID;
    // Password field for User Password input
    private javax.swing.JPasswordField txtUserPassword;
    // End of variables declaration//GEN-END:variables
}
