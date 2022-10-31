/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;

/**
 *
 * @author sunayanashivanagi
 */
public class SystemAdminDashboardJPanel extends javax.swing.JPanel {

    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    CommunityDirectory communityDirectory;
    EncounterDirectory encounterDirectory;
    HouseDirectory houseDirectory;
    CityDirectory cityDirectory;
    private boolean deleteFlag=true;
    /**
     * Creates new form AdminDashboardJPanel
     */
    public SystemAdminDashboardJPanel(PatientDirectory patientDirectory, DoctorDirectory doctorDirectory,HospitalDirectory hospitalDirectory,CommunityDirectory communityDirectory,EncounterDirectory encounterDirectory,HouseDirectory houseDirectory,CityDirectory cityDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.communityDirectory=communityDirectory;
        this.encounterDirectory=encounterDirectory;
        this.houseDirectory= houseDirectory;
        this.cityDirectory=cityDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabPatient = new javax.swing.JPanel();
        splitPanePatient = new javax.swing.JSplitPane();
        splitNavigation = new javax.swing.JPanel();
        btnViewPatient = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        splitWorkspace = new javax.swing.JPanel();
        tabDoctor = new javax.swing.JPanel();
        splitPaneDoctor = new javax.swing.JSplitPane();
        splitNavigation1 = new javax.swing.JPanel();
        btnViewDoctor = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        splitWorkspace1 = new javax.swing.JPanel();
        tabHospital = new javax.swing.JPanel();
        splitPaneHospital = new javax.swing.JSplitPane();
        splitNavigation2 = new javax.swing.JPanel();
        btnViewHospital = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        splitWorkspace2 = new javax.swing.JPanel();
        tabEncounters = new javax.swing.JPanel();
        splitPaneEncounter = new javax.swing.JSplitPane();
        splitNavigation3 = new javax.swing.JPanel();
        btnViewEncounter = new javax.swing.JButton();
        btnCreateEncounter = new javax.swing.JButton();
        splitWorkspace3 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System Admin Dashboard");

        jTabbedPane1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        btnViewPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnCreatePatient.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigationLayout = new javax.swing.GroupLayout(splitNavigation);
        splitNavigation.setLayout(splitNavigationLayout);
        splitNavigationLayout.setHorizontalGroup(
            splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        splitNavigationLayout.setVerticalGroup(
            splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigationLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        splitPanePatient.setLeftComponent(splitNavigation);

        splitWorkspace.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        splitPanePatient.setRightComponent(splitWorkspace);

        javax.swing.GroupLayout tabPatientLayout = new javax.swing.GroupLayout(tabPatient);
        tabPatient.setLayout(tabPatientLayout);
        tabPatientLayout.setHorizontalGroup(
            tabPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanePatient)
                .addContainerGap())
        );
        tabPatientLayout.setVerticalGroup(
            tabPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanePatient)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Patient", tabPatient);

        btnViewDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnCreateDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation1Layout = new javax.swing.GroupLayout(splitNavigation1);
        splitNavigation1.setLayout(splitNavigation1Layout);
        splitNavigation1Layout.setHorizontalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnViewDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        splitNavigation1Layout.setVerticalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        splitPaneDoctor.setLeftComponent(splitNavigation1);

        splitWorkspace1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace1Layout = new javax.swing.GroupLayout(splitWorkspace1);
        splitWorkspace1.setLayout(splitWorkspace1Layout);
        splitWorkspace1Layout.setHorizontalGroup(
            splitWorkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        splitWorkspace1Layout.setVerticalGroup(
            splitWorkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        splitPaneDoctor.setRightComponent(splitWorkspace1);

        javax.swing.GroupLayout tabDoctorLayout = new javax.swing.GroupLayout(tabDoctor);
        tabDoctor.setLayout(tabDoctorLayout);
        tabDoctorLayout.setHorizontalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneDoctor)
                .addContainerGap())
        );
        tabDoctorLayout.setVerticalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneDoctor)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Doctor", tabDoctor);

        btnViewHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewHospital.setText("View Hospital");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        btnCreateHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation2Layout = new javax.swing.GroupLayout(splitNavigation2);
        splitNavigation2.setLayout(splitNavigation2Layout);
        splitNavigation2Layout.setHorizontalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateHospital, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnViewHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        splitNavigation2Layout.setVerticalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        splitPaneHospital.setLeftComponent(splitNavigation2);

        splitWorkspace2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace2Layout = new javax.swing.GroupLayout(splitWorkspace2);
        splitWorkspace2.setLayout(splitWorkspace2Layout);
        splitWorkspace2Layout.setHorizontalGroup(
            splitWorkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        splitWorkspace2Layout.setVerticalGroup(
            splitWorkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        splitPaneHospital.setRightComponent(splitWorkspace2);

        javax.swing.GroupLayout tabHospitalLayout = new javax.swing.GroupLayout(tabHospital);
        tabHospital.setLayout(tabHospitalLayout);
        tabHospitalLayout.setHorizontalGroup(
            tabHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHospital)
                .addContainerGap())
        );
        tabHospitalLayout.setVerticalGroup(
            tabHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHospital)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hospital", tabHospital);

        btnViewEncounter.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        btnCreateEncounter.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation3Layout = new javax.swing.GroupLayout(splitNavigation3);
        splitNavigation3.setLayout(splitNavigation3Layout);
        splitNavigation3Layout.setHorizontalGroup(
            splitNavigation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitNavigation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnViewEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        splitNavigation3Layout.setVerticalGroup(
            splitNavigation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        splitPaneEncounter.setLeftComponent(splitNavigation3);

        splitWorkspace3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace3Layout = new javax.swing.GroupLayout(splitWorkspace3);
        splitWorkspace3.setLayout(splitWorkspace3Layout);
        splitWorkspace3Layout.setHorizontalGroup(
            splitWorkspace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        splitWorkspace3Layout.setVerticalGroup(
            splitWorkspace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        splitPaneEncounter.setRightComponent(splitWorkspace3);

        javax.swing.GroupLayout tabEncountersLayout = new javax.swing.GroupLayout(tabEncounters);
        tabEncounters.setLayout(tabEncountersLayout);
        tabEncountersLayout.setHorizontalGroup(
            tabEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEncountersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneEncounter)
                .addContainerGap())
        );
        tabEncountersLayout.setVerticalGroup(
            tabEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEncountersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneEncounter)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Encounters", tabEncounters);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel createPatientJPanel= new CreatePatientJPanel(patientDirectory,houseDirectory);
        splitPanePatient.setRightComponent(createPatientJPanel);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientJPanel viewPatientJPanel= new ViewPatientJPanel(patientDirectory,houseDirectory,deleteFlag);
        splitPanePatient.setRightComponent(viewPatientJPanel);
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
        ViewDoctorJPanel viewDoctorJPanel= new ViewDoctorJPanel(doctorDirectory,communityDirectory,deleteFlag);
        splitPaneDoctor.setRightComponent(viewDoctorJPanel);
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel createDoctorJPanel= new CreateDoctorJPanel(doctorDirectory,communityDirectory);
        splitPaneDoctor.setRightComponent(createDoctorJPanel);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        ViewHospitalJPanel viewHospitalJPanel= new ViewHospitalJPanel(hospitalDirectory,communityDirectory,deleteFlag);
        splitPaneHospital.setRightComponent(viewHospitalJPanel);
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
        CreateHospitalJPanel createHospitalJPanel= new CreateHospitalJPanel(hospitalDirectory,communityDirectory,cityDirectory);
        splitPaneHospital.setRightComponent(createHospitalJPanel);
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncounterJPanel viewEncounterJPanel = new ViewEncounterJPanel(patientDirectory, doctorDirectory, encounterDirectory,true);
        splitPaneEncounter.setRightComponent(viewEncounterJPanel);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        CreateEncounterJPanel createEncounterJPanel = new CreateEncounterJPanel(patientDirectory, doctorDirectory, encounterDirectory);
        splitPaneEncounter.setRightComponent(createEncounterJPanel);
    }//GEN-LAST:event_btnCreateEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel splitNavigation;
    private javax.swing.JPanel splitNavigation1;
    private javax.swing.JPanel splitNavigation2;
    private javax.swing.JPanel splitNavigation3;
    private javax.swing.JSplitPane splitPaneDoctor;
    private javax.swing.JSplitPane splitPaneEncounter;
    private javax.swing.JSplitPane splitPaneHospital;
    private javax.swing.JSplitPane splitPanePatient;
    private javax.swing.JPanel splitWorkspace;
    private javax.swing.JPanel splitWorkspace1;
    private javax.swing.JPanel splitWorkspace2;
    private javax.swing.JPanel splitWorkspace3;
    private javax.swing.JPanel tabDoctor;
    private javax.swing.JPanel tabEncounters;
    private javax.swing.JPanel tabHospital;
    private javax.swing.JPanel tabPatient;
    // End of variables declaration//GEN-END:variables
}
