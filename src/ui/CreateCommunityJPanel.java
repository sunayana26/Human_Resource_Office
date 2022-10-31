/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;

/**
 *
 * @author sunayanashivanagi
 */
public class CreateCommunityJPanel extends javax.swing.JPanel {

    /** Creates new form CreateCommunityJPanel */
    CommunityDirectory communityDirectory;
    CityDirectory cityDirectory;
    public CreateCommunityJPanel(CommunityDirectory communityDirectory,CityDirectory cityDirectory) {
        initComponents();
        this.communityDirectory=communityDirectory;
        this.cityDirectory= cityDirectory;
        
        for(City c:cityDirectory.getHistory()){
            drpCityName.addItem(c.getCityName());
        }
        for(City c:cityDirectory.getHistory()){
            drpUpdateCityName.addItem(c.getCityName());
        }
        populateTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        splitWorkspace = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        createEmployeeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeHistory = new javax.swing.JTable();
        btnRead = new javax.swing.JButton();
        name1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        createEmployeeLabel1 = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        txtUpdateCommunityName = new javax.swing.JTextField();
        drpUpdateCityName = new javax.swing.JComboBox<>();
        name4 = new javax.swing.JLabel();
        txtPinCode = new javax.swing.JTextField();
        name5 = new javax.swing.JLabel();
        txtLandMark = new javax.swing.JTextField();
        txtUpdatePinCode = new javax.swing.JTextField();
        name6 = new javax.swing.JLabel();
        txtUpdateLandMark = new javax.swing.JTextField();
        name7 = new javax.swing.JLabel();
        drpCityName = new javax.swing.JComboBox<>();

        splitWorkspace.setBackground(new java.awt.Color(204, 204, 255));

        save.setBackground(new java.awt.Color(255, 119, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Register");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        name.setText("City Name:");

        createEmployeeLabel.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Add New Community");
        createEmployeeLabel.setToolTipText("To create new employee");

        tblEmployeeHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "Community Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeHistory);

        btnRead.setBackground(new java.awt.Color(0, 71, 119));
        btnRead.setForeground(new java.awt.Color(255, 255, 255));
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        name1.setText("City Name:");

        btnUpdate.setBackground(new java.awt.Color(255, 119, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        createEmployeeLabel1.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel1.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel1.setText("View and Update Community");
        createEmployeeLabel1.setToolTipText("To create new employee");

        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        name2.setText("Community Name:");

        name3.setText("Community Name:");

        txtUpdateCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateCommunityNameActionPerformed(evt);
            }
        });

        drpUpdateCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpUpdateCityNameActionPerformed(evt);
            }
        });

        name4.setText("Pin Code:");

        txtPinCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeActionPerformed(evt);
            }
        });

        name5.setText("LandMark:");

        txtLandMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLandMarkActionPerformed(evt);
            }
        });

        txtUpdatePinCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdatePinCodeActionPerformed(evt);
            }
        });

        name6.setText("Pin Code:");

        txtUpdateLandMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateLandMarkActionPerformed(evt);
            }
        });

        name7.setText("LandMark:");

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createEmployeeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(name6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUpdatePinCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(name3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUpdateCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(name7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUpdateLandMark, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(name1)
                                        .addGap(40, 40, 40)
                                        .addComponent(drpUpdateCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(name2)
                                .addGap(18, 18, 18)
                                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drpCityName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCommunityName, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(name4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(name5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLandMark, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRead)
                .addGap(413, 413, 413))
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(splitWorkspaceLayout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(name)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1086, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name4)
                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name5)
                    .addComponent(txtLandMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(save)
                .addGap(41, 41, 41)
                .addComponent(createEmployeeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1)
                    .addComponent(drpUpdateCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3)
                    .addComponent(txtUpdateCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name6)
                    .addComponent(txtUpdatePinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdateLandMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name7))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(46, 46, 46))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(name)
                    .addContainerGap(547, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(splitWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1302, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUpdateLandMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateLandMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateLandMarkActionPerformed

    private void txtUpdatePinCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdatePinCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdatePinCodeActionPerformed

    private void txtLandMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLandMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLandMarkActionPerformed

    private void txtPinCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeActionPerformed

    private void drpUpdateCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpUpdateCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drpUpdateCityNameActionPerformed

    private void txtUpdateCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateCommunityNameActionPerformed

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        Community c = communityDirectory.getHistory().get(selectedRow);

        String cityName = (String) drpCityName.getSelectedItem();
        City city= cityDirectory.search(cityName);
        String communityName = txtUpdateCommunityName.getText();
        String landMark = txtUpdateLandMark.getText();
        int pinCode = Integer.parseInt(txtUpdatePinCode.getText());

        Community temp = new Community(communityName, pinCode, landMark, city.getCityName(), city.getStateName(), city.getCountry());

        communityDirectory.update(temp, selectedRow);

        JOptionPane.showMessageDialog(this, "Row is updated!");

        populateTable();

        drpCityName.setSelectedIndex(0);
        txtUpdateCommunityName.setText("");
        txtUpdateLandMark.setText("");
        txtUpdatePinCode.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        Community c = communityDirectory.getHistory().get(selectedRow);

       
        
        drpCityName.setSelectedItem(c.getCityName());
        txtUpdateCommunityName.setText(String.valueOf(c.getCommunityName()));
        txtUpdateLandMark.setText(String.valueOf(c.getLandMark()));
        txtUpdatePinCode.setText(String.valueOf(c.getPinCode()));
    }//GEN-LAST:event_btnReadActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
        //        if(validation()){
            String cityName = (String) drpCityName.getSelectedItem();
            City city = cityDirectory.search(cityName);
            String communityName = txtCommunityName.getText();
            int pinCode = Integer.parseInt(txtPinCode.getText());
            String landMark = txtLandMark.getText();

            Community c = new Community(communityName, pinCode, landMark, city.getCityName(), city.getStateName(), city.getCountry());
            communityDirectory.add(c);

            JOptionPane.showMessageDialog(this, "New Community Details was created ! ");
            populateTable();
            txtCommunityName.setText("");
            txtPinCode.setText("");
            txtLandMark.setText("");

            //    }
    }//GEN-LAST:event_saveActionPerformed
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblEmployeeHistory.getModel();
        model.setRowCount(0);

        for (Community p : communityDirectory.getHistory()) {
            Object row[] = new Object[10];
            row[0] = p.getCityName();
            row[1] =  p.getCommunityName();
            
            
            model.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JLabel createEmployeeLabel1;
    private javax.swing.JComboBox<String> drpCityName;
    private javax.swing.JComboBox<String> drpUpdateCityName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JButton save;
    private javax.swing.JPanel splitWorkspace;
    private javax.swing.JTable tblEmployeeHistory;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtLandMark;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtUpdateCommunityName;
    private javax.swing.JTextField txtUpdateLandMark;
    private javax.swing.JTextField txtUpdatePinCode;
    // End of variables declaration//GEN-END:variables

}