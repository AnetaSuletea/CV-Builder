/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_menu;

/**
 *
 * @author Aneta
 */
import java.util.List;
import java.util.Map;

//import pl.jsolve.sweetener.collection.Collections;
//import pl.jsolve.sweetener.collection.Maps;
//import templ4docx.util.Key;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
 
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;


import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import org.apache.poi.xwpf.usermodel.*;
import java.awt.Graphics.*;
import java.util.*;
import org.apache.xmlbeans.XmlCursor;
import java.io.File;

import org.apache.poi.xwpf.usermodel.XWPFDocument;



public class MainFrame4 extends javax.swing.JFrame {
    MainMenu p5;
    /**
     * Creates new form MainFrame
     */
    public MainFrame4() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize= (int) tk.getScreenSize().getHeight();
        this.setSize(ysize,xsize);
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

        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        DontIndicate = new javax.swing.JRadioButton();
        bg5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Text1 = new javax.swing.JLabel();
        bg3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Text2 = new javax.swing.JLabel();
        bStart = new javax.swing.JLabel();
        bg4 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/closeButton.png"))); // NOI18N
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });
        jPanel1.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, -1, -1));

        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizeButton.png"))); // NOI18N
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseExited(evt);
            }
        });
        jPanel1.add(MinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        jPanel5.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        Female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        jPanel5.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        DontIndicate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DontIndicate.setText("Don't indicate");
        DontIndicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DontIndicateActionPerformed(evt);
            }
        });
        jPanel5.add(DontIndicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 140, -1));

        bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrameButtons/background.jpg"))); // NOI18N
        jPanel5.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1440, 790));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1290, 730));
        jPanel5.setVisible(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Text/textJpanel3.png"))); // NOI18N
        jPanel3.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 220));

        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrameButtons/background.jpg"))); // NOI18N
        jPanel3.add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1440, 790));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 980, 220));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Text/textJpanel4.png"))); // NOI18N
        jPanel4.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        bStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrameButtons/bStart.png"))); // NOI18N
        bStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bStartMouseExited(evt);
            }
        });
        jPanel4.add(bStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrameButtons/background.jpg"))); // NOI18N
        jPanel4.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1440, 790));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 980, 480));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initWorkScreen(){
        if(jPanel3.isDisplayable()){
            jPanel3.remove(Text1);
            jPanel3.remove(bg3);
        }
        if(jPanel4.isDisplayable()){
            jPanel4.remove(Text2);
            jPanel4.remove(bg4);
            jPanel4.remove(bStart);
        }
        jPanel5.setVisible(false);
    }
    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/Images/closeButtonP.png"));
        CloseButton.setIcon(I);
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
        ImageIcon I = new ImageIcon(getClass().getResource("/Images/closeButton.png"));
        CloseButton.setIcon(I);
    }//GEN-LAST:event_CloseButtonMouseExited

    private void MinimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/Images/minimizeButtonP.png"));
        MinimizeButton.setIcon(I);
    }//GEN-LAST:event_MinimizeButtonMouseEntered

    private void MinimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseExited
        ImageIcon I = new ImageIcon(getClass().getResource("/Images/minimizeButton.png"));
        MinimizeButton.setIcon(I);
    }//GEN-LAST:event_MinimizeButtonMouseExited

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
       setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonMouseClicked

    private void bStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStartMouseExited
        ImageIcon I = new ImageIcon(getClass().getResource("/FrameButtons/bStart.png"));
        bStart.setIcon(I);
    }//GEN-LAST:event_bStartMouseExited

    private void bStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStartMouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/FrameButtons/bStartP.png"));
        bStart.setIcon(I);
    }//GEN-LAST:event_bStartMouseEntered

    private void bStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStartMouseClicked
        initWorkScreen();
        jPanel5.setVisible(true);
    }//GEN-LAST:event_bStartMouseClicked

    private void DontIndicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DontIndicateActionPerformed
        if(!AddPersonalInformationPressed){
            if(DontIndicate.isSelected()){
                Male.setSelected(false);
                Female.setSelected(false);
                SexFlag=true;
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"You have already added personal information");
        }
    }//GEN-LAST:event_DontIndicateActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        if(!AddPersonalInformationPressed){
            if(Female.isSelected()){
                Male.setSelected(false);
                DontIndicate.setSelected(false);
                SexFlag=true;
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"You have already added personal information");
        }
    }//GEN-LAST:event_FemaleActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        if(!AddPersonalInformationPressed){
            if(Male.isSelected()){
                Female.setSelected(false);
                DontIndicate.setSelected(false);
                SexFlag=true;
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"You have already added personal information");
        }
    }//GEN-LAST:event_MaleActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseButton;
    private javax.swing.JRadioButton DontIndicate;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel bStart;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel bg3;
    private javax.swing.JLabel bg4;
    private javax.swing.JLabel bg5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
    
    private boolean AddPersonalInformationPressed=false;
    
    //Vars for Personal Information
    private String Fname="Numeleblabla";
    private boolean FirstNameFlag=false;
    private String Lname="Prenumeleblabla";
    private boolean LastNameFlag=false;
    private String DOB;
    private boolean DOBFlag=false;
    private String Sex;
    private boolean SexFlag=false;
    private String City;
    private  boolean CityFlag=false;
    private String Country;
    private boolean CountryFlag=false;
    private String StreetAddress;
    private boolean StreetAddressFlag=false;
    private String Telephone;
    private boolean TelephoneFlag=false;
    private String Email;
    private boolean EmailFlag=false;
    
    //Vars for work experience
    DefaultListModel StartWorkDate = new DefaultListModel();
    private boolean StartWorkDateFlag=false;
    DefaultListModel EndWorkDate = new DefaultListModel();
    private boolean EndWorkDateFlag=false;
    DefaultListModel PositionHeld = new DefaultListModel();
    private boolean PositionHeldFlag=false;   
    DefaultListModel EmployerName = new DefaultListModel();
    private  boolean EmployerNameFlag=false;
    DefaultListModel EmployerCity = new DefaultListModel();
    private  boolean EmployerCityFlag=false;
    DefaultListModel EmployerCountry = new DefaultListModel();
    private boolean EmployerCountryFlag=false;
    DefaultListModel MainActivities = new DefaultListModel();
    private boolean MainActivitiesFlag=false;
    int NumberOfJobs=0;
    
    //Vars for education
    DefaultListModel StartEducationDate = new DefaultListModel();
    private boolean StartEducationDateFlag=false;
    DefaultListModel EndEducationDate = new DefaultListModel();
    private boolean EndEducationDateFlag=false;
    DefaultListModel Qualification = new DefaultListModel();
    private boolean QualificationFlag=false;   
    DefaultListModel OrganisationName = new DefaultListModel();
    private  boolean OrganisationNameFlag=false;
    DefaultListModel OrganisationCity = new DefaultListModel();
    private  boolean OrganisationCityFlag=false;
    DefaultListModel OrganisationCountry = new DefaultListModel();
    private boolean OrganisationCountryFlag=false;
    DefaultListModel MainSubjects = new DefaultListModel();
    private boolean MainSubjectsFlag=false;
    int NumberOfStudies=0;
    
    //Vars for personal skills
    DefaultListModel MotherTongue = new DefaultListModel();
    private boolean MotherTongueFlag=false;
    private int NumberOfMT=0;
    DefaultListModel FL = new DefaultListModel();
    private boolean FLFlag=false;
    DefaultListModel FLReading = new DefaultListModel();
    private boolean FLReadingFlag=false;
    DefaultListModel FLListening = new DefaultListModel();
    private boolean FLListeningFlag=false;   
    DefaultListModel FLInteraction = new DefaultListModel();
    private  boolean FLInteractionFlag=false;
    DefaultListModel FLProduction = new DefaultListModel();
    private  boolean FLProductionFlag=false;
    DefaultListModel FLWriting = new DefaultListModel();
    private boolean FLWritingFlag=false;
    DefaultListModel FLCertificate = new DefaultListModel();
    private boolean FLCertificateFlag=false;
    private int NumberOfFL=0;
    
    DefaultListModel DCInformationProcessing = new DefaultListModel();
    private boolean DCInformationProcessingFlag=false;
    DefaultListModel DCCommunication = new DefaultListModel();
    private boolean DCCommunicationFlag=false;
    DefaultListModel DCContentCreation = new DefaultListModel();
    private boolean DCContentCreationFlag=false;   
    DefaultListModel DCSafety = new DefaultListModel();
    private  boolean DCSafetyFlag=false;
    DefaultListModel DCProblemSolving = new DefaultListModel();
    private  boolean DCProblemSolvingFlag=false;
    DefaultListModel DCCertificate = new DefaultListModel();
    private boolean DCCertificateFlag=false;
    private int NumberOfDC=0;
    
    DefaultListModel CommunicationSkills = new DefaultListModel();
    private boolean CommunicationSkillsFlag=false;
    private int NumberOfCS=0;
    DefaultListModel OrganisationalSkills = new DefaultListModel();
    private boolean OrganisationalSkillsFlag=false;
    int NumberOfOS=0;
    DefaultListModel JobRelatedSkills = new DefaultListModel();
    private boolean JobRelatedSkillsFlag=false;
    private int NumberOfJRS=0;
    
    File At1,At2,At3;
    Image Photo;
}
