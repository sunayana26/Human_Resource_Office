/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterDirectory;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author sunayanashivanagi
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private CommunityDirectory communityDirectory;
    private EncounterDirectory encounterDirectory;

    private Doctor currentDoctor;
    private Patient selectedPatient;
    private Patient selectedUpdatePatient;
    private int updateIndex;
    private ArrayList<Doctor> patientList = new ArrayList<>();

    public DoctorJPanel(PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, CommunityDirectory communityDirectory, EncounterDirectory encounterDirectory, String username) {
        initComponents();
        
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.communityDirectory = communityDirectory;
        this.encounterDirectory = encounterDirectory;
        this.currentDoctor = doctorDirectory.search(username);

        for (Patient p : patientDirectory.getHistory()) {
            drpPatientName.addItem(p.getUserName());
        }

        for (Doctor d : doctorDirectory.getHistory()) {
            if (d.getUserName().equals(username)) {
                this.currentDoctor = d;
            }
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
        jLabel1 = new javax.swing.JLabel();
        createEncounterTab = new javax.swing.JTabbedPane();
        tabCreateEncounter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drpPatientName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        txtHearRate = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        lblHeartRate1 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblHeartRate2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        tabViewEditEncounter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncountersPatient = new javax.swing.JTable();
        lblHeartRate3 = new javax.swing.JLabel();
        txtUpdateHearRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblHeartRate4 = new javax.swing.JLabel();
        txtUpdateHeight = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblHeartRate5 = new javax.swing.JLabel();
        txtUpdateWeight = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        txtUpdateDate = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Dashboard");

        createEncounterTab.setBackground(new java.awt.Color(204, 0, 51));
        createEncounterTab.setForeground(new java.awt.Color(255, 255, 255));
        createEncounterTab.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        jLabel2.setText("Select a Patient :");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel3.setText("Step 1:");

        drpPatientName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        drpPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpPatientNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Book Appointment");

        jLabel7.setText("Choose a date:");

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel8.setText("Step 2:");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fill Vitals Signs");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel10.setText("Step 3:");

        lblHeartRate.setText("Heart Rate:");

        lblHeartRate1.setText("Height:");

        lblHeartRate2.setText("Weight:");

        jLabel4.setText("BPM");

        jLabel5.setText("cm");

        jLabel11.setText("kg");

        javax.swing.GroupLayout tabCreateEncounterLayout = new javax.swing.GroupLayout(tabCreateEncounter);
        tabCreateEncounter.setLayout(tabCreateEncounterLayout);
        tabCreateEncounterLayout.setHorizontalGroup(
            tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(64, 64, 64)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCreateEncounterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                                        .addComponent(lblHeartRate1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(83, 83, 83)
                                        .addComponent(lblHeartRate)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHearRate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                                        .addComponent(lblHeartRate2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addGap(0, 369, Short.MAX_VALUE))))
                    .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                        .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(drpPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                                .addGap(402, 402, 402)
                                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabCreateEncounterLayout.setVerticalGroup(
            tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(drpPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(tabCreateEncounterLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeartRate)
                            .addComponent(txtHearRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate1)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(tabCreateEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate2)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(44, 44, 44)
                .addComponent(btnBook)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        createEncounterTab.addTab("Create Encounter", tabCreateEncounter);

        tblEncountersPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Date", "Community Name", "City Name", "Specilization", "Disease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncountersPatient);

        lblHeartRate3.setText("Heart Rate:");

        jLabel12.setText("BPM");

        lblHeartRate4.setText("Height:");

        jLabel13.setText("cm");

        lblHeartRate5.setText("Weight:");

        jLabel14.setText("kg");

        jLabel15.setText("Choose a date:");

        btnEdit.setBackground(new java.awt.Color(0, 71, 119));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 119, 0));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabViewEditEncounterLayout = new javax.swing.GroupLayout(tabViewEditEncounter);
        tabViewEditEncounter.setLayout(tabViewEditEncounterLayout);
        tabViewEditEncounterLayout.setHorizontalGroup(
            tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                                .addComponent(lblHeartRate4)
                                .addGap(18, 18, 18)
                                .addComponent(txtUpdateHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                                .addComponent(lblHeartRate3)
                                .addGap(18, 18, 18)
                                .addComponent(txtUpdateHearRate, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                                .addComponent(lblHeartRate5)
                                .addGap(18, 18, 18)
                                .addComponent(txtUpdateWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337)
                        .addComponent(btnEdit)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        tabViewEditEncounterLayout.setVerticalGroup(
            tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabViewEditEncounterLayout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15))
                    .addComponent(txtUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate3)
                    .addComponent(txtUpdateHearRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate4)
                    .addComponent(txtUpdateHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(tabViewEditEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate5)
                    .addComponent(txtUpdateWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(Update)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        createEncounterTab.addTab("View Encounters", tabViewEditEncounter);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createEncounterTab, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(createEncounterTab))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:

        String patientName = (String) drpPatientName.getSelectedItem();

        Patient p = patientDirectory.search(patientName);

        Date date = txtDate.getDate();
        VitalSigns vs = new VitalSigns(Integer.parseInt(txtHearRate.getText()), Integer.parseInt(txtWeight.getText()), Integer.parseInt(txtHeight.getText()));

        Encounter encounter = new Encounter(date, vs, p, this.currentDoctor);
        encounterDirectory.add(encounter);
        populateTable();

        JOptionPane.showMessageDialog(this, "Added a new Encounter for " + this.currentDoctor.getName() + " with " + p.getName());
    }//GEN-LAST:event_btnBookActionPerformed

    private void drpPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpPatientNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_drpPatientNameActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEncountersPatient.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        Encounter e = encounterDirectory.getHistory().get(selectedRow);

        this.selectedUpdatePatient = encounterDirectory.getHistory().get(selectedRow).getPatient();
        this.updateIndex = selectedRow;

        txtUpdateHearRate.setText(String.valueOf(e.getVitalSigns().getHeartRate()));
        txtUpdateHeight.setText(String.valueOf(e.getVitalSigns().getHeight()));
        txtUpdateWeight.setText(String.valueOf(e.getVitalSigns().getWeight()));
        txtUpdateDate.setDate((e.getDate()));
    }//GEN-LAST:event_btnEditActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
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
        Date date = txtUpdateDate.getDate();
        VitalSigns vs = new VitalSigns(Integer.parseInt(txtUpdateHearRate.getText()), Integer.parseInt(txtUpdateWeight.getText()), Integer.parseInt(txtUpdateHeight.getText()));
        Encounter e = new Encounter(date, vs, selectedUpdatePatient, currentDoctor);
        encounterDirectory.update(e, updateIndex);
        JOptionPane.showMessageDialog(this, " Encounter Was updated! ");
        populateTable();

        //    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblEncountersPatient.getModel();
        model.setRowCount(0);

        for (Encounter e : encounterDirectory.searchByDoctor(currentDoctor.getUserName())) {
            Object row[] = new Object[10];
            row[0] = e.getDoctor().getName();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String strDate = dateFormat.format(e.getDate());
            row[1] = strDate;
            row[2] = e.getDoctor().getCommunity().getCommunityName();
            row[3] = e.getDoctor().getCommunity().getCityName();
            row[4] = e.getDoctor().getSpecialization();
            row[5] = e.getPatient().getDisease();

            model.addRow(row);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTabbedPane createEncounterTab;
    private javax.swing.JComboBox<String> drpPatientName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeartRate1;
    private javax.swing.JLabel lblHeartRate2;
    private javax.swing.JLabel lblHeartRate3;
    private javax.swing.JLabel lblHeartRate4;
    private javax.swing.JLabel lblHeartRate5;
    private javax.swing.JPanel tabCreateEncounter;
    private javax.swing.JPanel tabViewEditEncounter;
    private javax.swing.JTable tblEncountersPatient;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtHearRate;
    private javax.swing.JTextField txtHeight;
    private com.toedter.calendar.JDateChooser txtUpdateDate;
    private javax.swing.JTextField txtUpdateHearRate;
    private javax.swing.JTextField txtUpdateHeight;
    private javax.swing.JTextField txtUpdateWeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
