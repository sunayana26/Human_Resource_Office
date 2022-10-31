/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.CommunityDirectory;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author sunayanashivanagi
 */
public class ViewHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalJPanel
     */
    
    HospitalDirectory hospitalDirectory;
    CommunityDirectory communityDirectory;
    public ViewHospitalJPanel(HospitalDirectory hospitalDirectory,CommunityDirectory communityDirectory,boolean deleteFlag) {
        initComponents();
        this.hospitalDirectory=hospitalDirectory;
        this.communityDirectory=communityDirectory;
        btnDelete.setVisible(deleteFlag);
        
        for(Community c: communityDirectory.getHistory()){
            drpCommunityName.addItem(c.getCommunityName());
        }
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createEmployeeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeHistory = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        employeeId = new javax.swing.JLabel();
        employeeId1 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        drpCommunityName = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNumberOfDoctors = new javax.swing.JTextField();
        employeeId2 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();

        createEmployeeLabel.setBackground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("View Hospital");
        createEmployeeLabel.setToolTipText("To create new employee");

        tblEmployeeHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "Community Name", "City Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeHistory);

        btnDelete.setBackground(new java.awt.Color(163, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRead.setBackground(new java.awt.Color(0, 71, 119));
        btnRead.setForeground(new java.awt.Color(255, 255, 255));
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 119, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        employeeId.setText("Community Name:");

        employeeId1.setText("Hospital Name:");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of Doctors:");

        employeeId2.setText("Specilization:");

        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(employeeId))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employeeId2)
                            .addComponent(employeeId1))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSpecialization)
                    .addComponent(drpCommunityName, 0, 250, Short.MAX_VALUE)
                    .addComponent(txtHospitalName)
                    .addComponent(txtNumberOfDoctors, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(273, 273, 273))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnDelete)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnRead))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnRead))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumberOfDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId)
                    .addComponent(drpCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId1)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId2)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        } else {
            hospitalDirectory.delete(selectedRow);
            populateTable();
            JOptionPane.showMessageDialog(this, "Hospital was Deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        Hospital h = hospitalDirectory.getHistory().get(selectedRow);
       

       
        txtNumberOfDoctors.setText(String.valueOf(h.getNumberOfDoctors()));
        drpCommunityName.setSelectedItem(String.valueOf(h.getCommunityName()));
        txtHospitalName.setText(h.getHospitalName());
        txtSpecialization.setText(h.getSpeciality());
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        Hospital h = hospitalDirectory.getHistory().get(selectedRow);
        

        
        
        String communityName = (String) drpCommunityName.getSelectedItem();
        
        Community c = communityDirectory.search(communityName);
        
        String hospitalName = txtHospitalName.getText();
        
        int numberOfDoctors = Integer.parseInt(txtNumberOfDoctors.getText());
        String speciality = txtSpecialization.getText();

        
        Hospital temp = new Hospital(hospitalName, numberOfDoctors, speciality, c.getCommunityName(), c.getPinCode(), c.getLandMark(), c.getCityName(), c.getStateName(), c.getCountry());
       

        hospitalDirectory.update(temp, selectedRow);

        JOptionPane.showMessageDialog(this, "Row is updated!");

        populateTable();

        
        
        txtHospitalName.setText("");
        txtNumberOfDoctors.setText("");
        txtSpecialization.setText("");
        drpCommunityName.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblEmployeeHistory.getModel();
        model.setRowCount(0);

        for (Hospital p : hospitalDirectory.getHistory()) {
            Object row[] = new Object[10];
            row[0] = p.getHospitalName();
            row[1] = p.getCommunityName();
            row[2] = p.getCityName();
            
            model.addRow(row);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JComboBox<String> drpCommunityName;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel employeeId1;
    private javax.swing.JLabel employeeId2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployeeHistory;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtNumberOfDoctors;
    private javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables
}
