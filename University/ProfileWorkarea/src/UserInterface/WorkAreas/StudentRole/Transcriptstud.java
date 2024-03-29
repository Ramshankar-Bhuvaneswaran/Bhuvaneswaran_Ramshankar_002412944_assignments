/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

import Business.Course.Course;
import Business.Course.CourseCatalog;
import Business.Course.CourseLoad;
import Business.Course.CourseOffer;
import Business.Course.CourseSchedule;
import UserInterface.WorkAreas.AdminRole.ManagePersonnelWorkResp.*;
import Business.Department;
import Business.Profiles.StudentProfile;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Course.SeatAssignment;
import static java.lang.Math.random;

/**
 *
 * @author Ram
 */
public class Transcriptstud extends javax.swing.JPanel {

    /**
     * Creates new form CourseschJPanel
     */
      JPanel CardSequencePanel;

    Department business;
    StudentProfile s;
    public Transcriptstud(Department bz, JPanel jp, StudentProfile s) {
             business = bz;
             this.s=s;
        this.CardSequencePanel = jp;
        initComponents();
//        refreshTable();
    }
    public void refreshTable() {

//clear supplier table
        int rc = tblTranscript.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tblTranscript.getModel()).removeRow(i);
        }
        String te=  (String) term1.getSelectedItem();
         
        CourseSchedule courseschedule = business.getCourseSchedule(te);

        
        CourseCatalog uad = business.getCourseCatalog();
        int p=1;

        for (CourseOffer ua : courseschedule.getSchedule()) {
            
            Object[] row = new Object[5];
            row[0] = p++;
            row[1] = ua.getCourseName(); //complete this..
            row[2] = ua.getCourseNumber();
            
           row[3] = ua.getCreditHours();    
           row[4]=ua.getFacultyProfile().getPerson().getPersonId();

            ((DefaultTableModel) tblTranscript.getModel()).addRow(row);
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

        lblGPA = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTranscript = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        term1 = new javax.swing.JComboBox<>();
        btns = new javax.swing.JButton();

        lblGPA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGPA.setText("Your GPA is");

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Transcripts");

        tblTranscript.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Grades"
            }
        ));
        jScrollPane1.setViewportView(tblTranscript);

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Semester:");

        term1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall2023", "Spring2023", "Fall2024", "Spring2024", "Fall2025", "Spring2025" }));
        term1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                term1ActionPerformed(evt);
            }
        });

        btns.setText("Select");
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack)
                        .addGap(56, 56, 56)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(lblGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(term1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btns))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(term1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btns))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblGPA)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
            CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void term1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_term1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_term1ActionPerformed

    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed
        refreshTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblTranscript;
    private javax.swing.JComboBox<String> term1;
    // End of variables declaration//GEN-END:variables
}
