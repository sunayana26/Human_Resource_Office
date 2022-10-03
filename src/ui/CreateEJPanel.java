/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.ContactInfo;
import model.EmployeeProfile;
import model.EmployeeProfileHistory;

/**
 *
 * @author sunayanashivanagi
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    EmployeeProfileHistory employeeProfileHistory;
    Image employeeImage;
    
    public Image getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(Image employeeImage) {
        this.employeeImage = employeeImage;
    }

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(EmployeeProfileHistory employeeProfileHistory) {
        initComponents();
        this.employeeProfileHistory=employeeProfileHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createEmployeeLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        employeeId = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        teamInfo = new javax.swing.JLabel();
        positionTitle = new javax.swing.JLabel();
        cellPhoneNumber = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtCellPhoneNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        txtEmployeeId = new javax.swing.JTextField();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        drpPositionTitle = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JSpinner();
        drpGender = new javax.swing.JComboBox<>();
        btnPhoto = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        valName = new javax.swing.JLabel();
        valEmployeeId = new javax.swing.JLabel();
        valDate = new javax.swing.JLabel();
        valTeamInfo = new javax.swing.JLabel();
        valCellPhoneNumber = new javax.swing.JLabel();
        valEmailAddress = new javax.swing.JLabel();
        valPhoto = new javax.swing.JLabel();

        createEmployeeLabel.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Create Employee");
        createEmployeeLabel.setToolTipText("To create new employee");

        name.setText("Name:");

        employeeId.setText("Employee Id:");

        age.setText("Age:");

        gender.setText("Gender:");

        startDate.setText("Start Date:");

        level.setText("Level:");

        teamInfo.setText("Team Info:");

        positionTitle.setText("Position Title:");

        cellPhoneNumber.setText("Cell Phone Number:");

        emailAddress.setText("Email Address:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtLevel.setText("1");
        txtLevel.setEnabled(false);
        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(0, 51, 204));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        drpPositionTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intern", "Junior Software Engineer", "Senior Software Engineer", "Team lead", "Project Manager" }));
        drpPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpPositionTitleActionPerformed(evt);
            }
        });

        txtAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        btnPhoto.setText("Upload Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        photo.setForeground(new java.awt.Color(204, 204, 204));
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setText("Upload Employee Photo");

        valName.setForeground(new java.awt.Color(255, 0, 51));

        valEmployeeId.setForeground(new java.awt.Color(255, 0, 51));

        valDate.setForeground(new java.awt.Color(255, 0, 51));

        valTeamInfo.setForeground(new java.awt.Color(255, 0, 51));

        valCellPhoneNumber.setForeground(new java.awt.Color(255, 0, 51));

        valEmailAddress.setForeground(new java.awt.Color(255, 0, 51));

        valPhoto.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(employeeId, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(age)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gender)
                                .addGap(18, 18, 18)
                                .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startDate)
                                .addGap(18, 18, 18)
                                .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(positionTitle)
                                .addGap(18, 18, 18)
                                .addComponent(drpPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teamInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cellPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(level, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnPhoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(photo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valName)
                                    .addComponent(valEmployeeId)
                                    .addComponent(valDate)
                                    .addComponent(valTeamInfo)
                                    .addComponent(valCellPhoneNumber)
                                    .addComponent(valEmailAddress)
                                    .addComponent(valPhoto))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valEmployeeId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionTitle)
                    .addComponent(drpPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(teamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valTeamInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cellPhoneNumber)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valCellPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valEmailAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(valPhoto)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPhoto)
                            .addComponent(save)
                            .addComponent(reset)))
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
     //Reset validation
     valName.setText("");
     valEmployeeId.setText("");
     valDate.setText("");
     valTeamInfo.setText("");
     valCellPhoneNumber.setText("");
     valEmailAddress.setText("");
     valPhoto.setText("");
     
     if(validation()){
         String name = txtName.getText();
     int employeeId = Integer.parseInt(txtEmployeeId.getText()) ;
     int age = Integer.parseInt(txtAge.getValue().toString()) ;
     String gender = (String)drpGender.getSelectedItem(); 
     Date startDate = txtStartDate.getDate(); 
     int level = Integer.parseInt(txtLevel.getText()) ;
     String teamInfo = txtTeamInfo.getText() ;
     String positionTitle= (String)drpPositionTitle.getSelectedItem() ;
     long cellPhoneNumber = Long.parseLong(txtCellPhoneNumber.getText()) ;
     String emailAddress= txtEmailAddress.getText();
     
     
     EmployeeProfile ep = new EmployeeProfile();
     ContactInfo ci = new ContactInfo();
     ci.setEmailAddress(emailAddress);
     ci.setCellPhoneNumber(cellPhoneNumber);
     ep.setContact(ci);
     ep.setName(name);
     // ep.setCellPhoneNumber(cellPhoneNumber);
     // ep.setEmailAddress(emailAddress);
     ep.setEmployeeId(employeeId);
     ep.setGender(gender);
     ep.setLevel(level);
     ep.setPositionTitle(positionTitle);
     ep.setStartDate(startDate);
     ep.setTeamInfo(teamInfo);
     ep.setAge(age);
     ep.setPhoto(getEmployeeImage());
     
     employeeProfileHistory.addNewEmployee(ep);
     JOptionPane.showMessageDialog(this,"New Employee Details was added");
     txtName.setText("");
     txtEmployeeId.setText("");
     txtAge.setValue(18);
     drpGender.setSelectedItem("Male");
     txtStartDate.setDate(null);
     txtLevel.setText("");
     txtTeamInfo.setText("");
     drpPositionTitle.setSelectedItem("Intern");
     txtEmployeeId.setText("");
     txtEmailAddress.setText("");
     txtCellPhoneNumber.setText("");
     photo.setIcon(null);
     }
        
     
     
 
    }//GEN-LAST:event_saveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
     txtName.setText("");
     txtEmployeeId.setText("");
     txtAge.setValue(18);
     drpGender.setSelectedItem("Male");
     txtStartDate.setDate(null);
     txtLevel.setText("");
     txtTeamInfo.setText("");
     drpPositionTitle.setSelectedItem("Intern");
     txtEmployeeId.setText("");
     txtEmailAddress.setText("");
     txtCellPhoneNumber.setText("");
     photo.setIcon(null);
     valName.setText("");
     valEmployeeId.setText("");
     valDate.setText("");
     valTeamInfo.setText("");
     valCellPhoneNumber.setText("");
     valEmailAddress.setText("");
        
     //Reset validation
     valName.setText("");
     valEmployeeId.setText("");
     valDate.setText("");
     valTeamInfo.setText("");
     valCellPhoneNumber.setText("");
     valEmailAddress.setText("");
     valPhoto.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void drpPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpPositionTitleActionPerformed
        // TODO add your handling code here:
        if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Intern"))
            txtLevel.setText("1");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Junior Software Engineer"))
            txtLevel.setText("2");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Senior Software Engineer"))
            txtLevel.setText("3");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Team Lead"))
            txtLevel.setText("4");
        else if(drpPositionTitle.getSelectedItem().toString().equalsIgnoreCase("Project Manager"))
            txtLevel.setText("5");
    }//GEN-LAST:event_drpPositionTitleActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();    
    int i=fc.showOpenDialog(this);

    if(i==JFileChooser.APPROVE_OPTION){    
        File f=fc.getSelectedFile();    
        String filepath = f.getAbsolutePath();    
        ImageIcon icon = new ImageIcon(filepath);
        Image img = icon.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
        photo.setIcon(new ImageIcon(img));
        setEmployeeImage(img);
    }   
    }//GEN-LAST:event_btnPhotoActionPerformed
    private boolean validation(){
        boolean validation=true;
        String name = txtName.getText();
     String employeeId = txtEmployeeId.getText() ;
     Date startDate = txtStartDate.getDate(); 
     String teamInfo = txtTeamInfo.getText() ;
     String cellPhoneNumber = txtCellPhoneNumber.getText();
     String emailAddress= txtEmailAddress.getText();
        //Name Validation
        if(name.length()<=0){
            valName.setText("Please Enter Name");
            validation=false;
        }
        //EmployeeId validation
        if(employeeId.length()<=0){
            valEmployeeId.setText("Please Enter Employee Id");
            validation=false;
        }
        else{
            try 
		{ 
			Integer.parseInt(employeeId); 
                        ArrayList<Integer> eids= new ArrayList<>();
                        for(EmployeeProfile e:employeeProfileHistory.getHistory()){
                            eids.add(e.getEmployeeId());
                        }
                     
                        if(eids.contains(Integer.parseInt(employeeId))){
                            valEmployeeId.setText("EmployeeId must be unique");
                            validation=false;
                        }
		}  
		catch (NumberFormatException e)  
		{ 
			valEmployeeId.setText("EmployeeId must be an number");
                        validation=false;
		} 
        }
        
        //Date Validation
        if(startDate==null){
            valDate.setText("Please Enter Start Date");
                        validation=false;
        }
        //TeamInfo Validation
        if(teamInfo.length()<=0){
            valTeamInfo.setText("Please Enter Team Info");
            validation=false;
        }
        //CellphoneNumber validation
        if(!cellPhoneNumber.matches("^\\d{10}$")){
                valCellPhoneNumber.setText("Please Enter 10 digits");
                validation=false;
            }
        if(cellPhoneNumber.length()<=0 || cellPhoneNumber.length()>10){
            valCellPhoneNumber.setText("Please Enter 10 digits");
            validation=false;
        }
        else{
            try 
		{ 
			Long.parseLong(cellPhoneNumber); 
		}  
		catch (NumberFormatException e)  
		{ 
			valCellPhoneNumber.setText("CellPhoneNumber must be an number");
                        validation=false;
		} 
        }
        //EmailAddress Validation
        if(emailAddress.length()<=0 || !emailAddress.matches("^(.+)@(\\S+)$")){
            valEmailAddress.setText("Please Enter valid Email Address");
            validation=false;
        }
        //Photo Validation
        if(getEmployeeImage()==null){
            valPhoto.setText("Please Upload a photo");
            validation=false;
        }
        
        
        
        return validation;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JLabel cellPhoneNumber;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JComboBox<String> drpGender;
    private javax.swing.JComboBox<String> drpPositionTitle;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel level;
    private javax.swing.JLabel name;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel positionTitle;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JLabel startDate;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JSpinner txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JLabel valCellPhoneNumber;
    private javax.swing.JLabel valDate;
    private javax.swing.JLabel valEmailAddress;
    private javax.swing.JLabel valEmployeeId;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPhoto;
    private javax.swing.JLabel valTeamInfo;
    // End of variables declaration//GEN-END:variables
}