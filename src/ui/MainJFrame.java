/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Admin;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.EmployeeProfileHistory;
import model.EncounterDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author sunayanashivanagi
 */
public class MainJFrame extends javax.swing.JFrame {
    
    
    private EmployeeProfileHistory employeeProfileHistory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirectory;
    private CityDirectory cityDirectory;
    private CommunityDirectory communityDirectory;
    private HouseDirectory houseDirectory;
    private EncounterDirectory encounterDirectory;
    
    private Admin systemAdmin;
    private Admin hospitalAdmin;
    private Admin communityAdmin;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        employeeProfileHistory = new EmployeeProfileHistory();
        patientDirectory= new PatientDirectory();
        doctorDirectory= new DoctorDirectory();
        hospitalDirectory = new HospitalDirectory();
        encounterDirectory = new EncounterDirectory();
        
        
        cityDirectory= new CityDirectory();
        communityDirectory = new CommunityDirectory();
        houseDirectory = new HouseDirectory();
        
        systemAdmin = new Admin("System", "SystemAdmin",  22,  "Male",  "asd@gmail.com",  123123,  "sysadmin",  "sysadmin");
        hospitalAdmin = new Admin("Hospital", "HospitalAdmin",  22,  "Male",  "asd@gmail.com",  123123,  "hosadmin",  "hosadmin");
        communityAdmin = new Admin("Community", "CommunityAdmin",  22,  "Male",  "asd@gmail.com",  123123,  "comadmin",  "comadmin");
        
        patientDirectory.add(new Patient("Flu", "xyz", 22, "Male", "ass@gmai.com", 123123, "xyz", "xyz"));
        
        doctorDirectory.add(new Doctor("Heart", new Community("Boylston", "Boston"), "John", 22, "Male", "asdsa", 123123, "abc", "abc"));
        
        communityDirectory.add(new Community("Boylston", "Boston"));
        communityDirectory.add(new Community("xyz", "Bangalore"));
        communityDirectory.add(new Community("abc", "Chennai"));
        
        
        
        btnLogout.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        lblWelcomeText = new javax.swing.JLabel();
        workspacePanel = new javax.swing.JPanel();
        labelHospitalManagementSystem = new javax.swing.JLabel();
        labelHospitalManagementSystem1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        labelHospitalManagementSystem2 = new javax.swing.JLabel();
        labelHospitalManagementSystem3 = new javax.swing.JLabel();
        cmbLoginType = new javax.swing.JComboBox<>();
        labelHospitalManagementSystem4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(0, 71, 119));
        controlPanel.setForeground(new java.awt.Color(51, 51, 255));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblWelcomeText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblWelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeText.setText("Welcome");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblWelcomeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workspacePanel.setBackground(new java.awt.Color(239, 210, 141));

        labelHospitalManagementSystem.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        labelHospitalManagementSystem.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem.setText("Please enter the login credentials");
        labelHospitalManagementSystem.setToolTipText("To create new employee");

        labelHospitalManagementSystem1.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        labelHospitalManagementSystem1.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem1.setText("Hospital Management System");
        labelHospitalManagementSystem1.setToolTipText("To create new employee");

        txtUserName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        labelHospitalManagementSystem2.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        labelHospitalManagementSystem2.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem2.setText("Login As :");
        labelHospitalManagementSystem2.setToolTipText("To create new employee");

        labelHospitalManagementSystem3.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        labelHospitalManagementSystem3.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem3.setText("User Name :");
        labelHospitalManagementSystem3.setToolTipText("To create new employee");

        cmbLoginType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Patient" }));

        labelHospitalManagementSystem4.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        labelHospitalManagementSystem4.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem4.setText("Password :");
        labelHospitalManagementSystem4.setToolTipText("To create new employee");

        btnLogin.setBackground(new java.awt.Color(0, 71, 119));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout workspacePanelLayout = new javax.swing.GroupLayout(workspacePanel);
        workspacePanel.setLayout(workspacePanelLayout);
        workspacePanelLayout.setHorizontalGroup(
            workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspacePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workspacePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(494, 494, 494))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelHospitalManagementSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(workspacePanelLayout.createSequentialGroup()
                                            .addComponent(labelHospitalManagementSystem3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                                            .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelHospitalManagementSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelHospitalManagementSystem4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbLoginType, 0, 284, Short.MAX_VALUE)
                                                .addComponent(txtPassword)))))
                                .addGap(332, 332, 332))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacePanelLayout.createSequentialGroup()
                        .addComponent(labelHospitalManagementSystem1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        workspacePanelLayout.setVerticalGroup(
            workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspacePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(labelHospitalManagementSystem1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelHospitalManagementSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHospitalManagementSystem3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHospitalManagementSystem4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(workspacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLoginType, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHospitalManagementSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workspacePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String role = (String)cmbLoginType.getSelectedItem();
        
        System.out.println(username + password + role);
        
        if(systemAdmin.getUserName().equals(username) && systemAdmin.getPassword().equals(password) && role.equals("Admin") ){
            btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as System Admin");
            String text = "<html>";
            text+= "Welcome,<br>";
            text+="System<br>";
            text+="Admin";
            text+="</html>";
            lblWelcomeText.setText(text);
            
            SystemAdminDashboardJPanel adminDashboardJPanel = new SystemAdminDashboardJPanel(patientDirectory,doctorDirectory,hospitalDirectory,communityDirectory);
            splitPane.setRightComponent(adminDashboardJPanel);
            
        }
        
        else if(hospitalAdmin.getUserName().equals(username) && hospitalAdmin.getPassword().equals(password) && role.equals("Admin") ){
            btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as Hospital Admin");
            String text = "<html>";
            text+= "Welcome,<br>";
            text+="Hospital<br>";
            text+="Admin";
            text+="</html>";
            lblWelcomeText.setText(text);
            HospitalAdminDashboardJPanel hospitalAdminDashboardJPanel = new HospitalAdminDashboardJPanel(patientDirectory,doctorDirectory,hospitalDirectory,communityDirectory);
            splitPane.setRightComponent(hospitalAdminDashboardJPanel);
        }
        
        else if(communityAdmin.getUserName().equals(username) && communityAdmin.getPassword().equals(password) && role.equals("Admin") ){
            btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as Community Admin");
             String text = "<html>";
            text+= "Welcome,<br>";
            text+="Community<br>";
            text+="Admin";
            text+="</html>";
            lblWelcomeText.setText(text);
            CommunityAdminDashboardJPanel communityAdminDashboardJPanel = new CommunityAdminDashboardJPanel(cityDirectory, houseDirectory, communityDirectory);
            splitPane.setRightComponent(communityAdminDashboardJPanel);
        }
        else if(role.equals("Patient") && patientDirectory.login(username, password)){
                btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as "+username);
             String text = "<html>";
            text+= "Welcome,<br>";
            text+=username;
            text+="</html>";
            lblWelcomeText.setText(text);
            PatientJPanel patientJPanel = new PatientJPanel(patientDirectory, doctorDirectory, communityDirectory,encounterDirectory,username);
            splitPane.setRightComponent(patientJPanel);
        }
        
        else if(role.equals("Doctor") && doctorDirectory.login(username, password)){
                btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as "+username);
             String text = "<html>";
            text+= "Welcome,<br>";
            text+=username;
            text+="</html>";
            lblWelcomeText.setText(text);
            DoctorJPanel doctorJPanel = new DoctorJPanel(patientDirectory, doctorDirectory, communityDirectory,encounterDirectory,username);
            splitPane.setRightComponent(doctorJPanel);
        }
        else{
            JOptionPane.showMessageDialog(this,"Invalid Credentials, Try again :(");
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        String text = "<html>";
            text+= "Welcome,<br>";
           
            text+="</html>";
            lblWelcomeText.setText(text);
        splitPane.setRightComponent(workspacePanel);
        btnLogout.setVisible(false);
        txtPassword.setText("");
        txtUserName.setText("");

    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbLoginType;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel labelHospitalManagementSystem;
    private javax.swing.JLabel labelHospitalManagementSystem1;
    private javax.swing.JLabel labelHospitalManagementSystem2;
    private javax.swing.JLabel labelHospitalManagementSystem3;
    private javax.swing.JLabel labelHospitalManagementSystem4;
    private javax.swing.JLabel lblWelcomeText;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel workspacePanel;
    // End of variables declaration//GEN-END:variables
}
