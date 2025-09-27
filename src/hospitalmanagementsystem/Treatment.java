/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementsystem;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;

public class Treatment extends javax.swing.JFrame {

    public Treatment() {
        initComponents();
        populateTestIdComboBox();
        populateTestDepartmentMap();
        setupListeners();
        DisplayLabTests();
        DisplayInventory();
        DisplayTreatments();
        MedicalStaff.setActiveButton(TreatmentBtn);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MedicalStaff_img = new javax.swing.JLabel();
        Patients_img = new javax.swing.JLabel();
        LabTests_img = new javax.swing.JLabel();
        Inventory_img = new javax.swing.JLabel();
        MedicalStaffBtn = new javax.swing.JButton();
        PatientsBtn = new javax.swing.JButton();
        LabTestsBtn = new javax.swing.JButton();
        InventoryBtn = new javax.swing.JButton();
        TreatmentBtn = new javax.swing.JButton();
        Treatment_img = new javax.swing.JLabel();
        Logout_img1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TStatusCb = new javax.swing.JComboBox<>();
        AddTreatmentBtn = new javax.swing.JButton();
        UpdateTreatmentBtn = new javax.swing.JButton();
        DeleteTreatmentBtn = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TreatmentTable = new javax.swing.JTable();
        TNameCb = new javax.swing.JComboBox<>();
        TDepartmentCb = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        LabTestsTableResult = new javax.swing.JTable();
        TIdCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 526));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/hospital (2).png"))); // NOI18N

        MedicalStaff_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dragos Daniel\\Downloads\\nurse-male.png")); // NOI18N
        MedicalStaff_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicalStaff_imgMouseClicked(evt);
            }
        });

        Patients_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dragos Daniel\\Downloads\\patient.png")); // NOI18N
        Patients_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Patients_imgMouseClicked(evt);
            }
        });

        LabTests_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dragos Daniel\\Downloads\\atom.png")); // NOI18N
        LabTests_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabTests_imgMouseClicked(evt);
            }
        });

        Inventory_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/first-aid-kit.png"))); // NOI18N
        Inventory_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inventory_imgMouseClicked(evt);
            }
        });

        MedicalStaffBtn.setBackground(new java.awt.Color(255, 0, 0));
        MedicalStaffBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        MedicalStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        MedicalStaffBtn.setText("Medical Staff");
        MedicalStaffBtn.setMaximumSize(new java.awt.Dimension(104, 23));
        MedicalStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicalStaffBtnMouseClicked(evt);
            }
        });
        MedicalStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalStaffBtnActionPerformed(evt);
            }
        });

        PatientsBtn.setBackground(new java.awt.Color(255, 0, 0));
        PatientsBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        PatientsBtn.setForeground(new java.awt.Color(255, 255, 255));
        PatientsBtn.setText("Patients");
        PatientsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PatientsBtn.setMaximumSize(new java.awt.Dimension(104, 23));
        PatientsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientsBtnMouseClicked(evt);
            }
        });
        PatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientsBtnActionPerformed(evt);
            }
        });

        LabTestsBtn.setBackground(new java.awt.Color(255, 0, 0));
        LabTestsBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        LabTestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        LabTestsBtn.setText("Lab Tests");
        LabTestsBtn.setMaximumSize(new java.awt.Dimension(104, 23));
        LabTestsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabTestsBtnMouseClicked(evt);
            }
        });
        LabTestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabTestsBtnActionPerformed(evt);
            }
        });

        InventoryBtn.setBackground(new java.awt.Color(255, 0, 0));
        InventoryBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        InventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        InventoryBtn.setText("Inventory");
        InventoryBtn.setMaximumSize(new java.awt.Dimension(104, 23));
        InventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryBtnMouseClicked(evt);
            }
        });
        InventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryBtnActionPerformed(evt);
            }
        });

        TreatmentBtn.setBackground(new java.awt.Color(255, 0, 0));
        TreatmentBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        TreatmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        TreatmentBtn.setText("Treatment");
        TreatmentBtn.setMaximumSize(new java.awt.Dimension(104, 23));
        TreatmentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentBtnMouseClicked(evt);
            }
        });
        TreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentBtnActionPerformed(evt);
            }
        });

        Treatment_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/remedy.png"))); // NOI18N
        Treatment_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Treatment_imgMouseClicked(evt);
            }
        });

        Logout_img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/entry-door.png"))); // NOI18N
        Logout_img1.setAlignmentY(0.0F);
        Logout_img1.setMaximumSize(new java.awt.Dimension(50, 50));
        Logout_img1.setMinimumSize(new java.awt.Dimension(50, 50));
        Logout_img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_img1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Logout_img1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MedicalStaff_img)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MedicalStaffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabTestsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TreatmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Patients_img)
                        .addGap(132, 132, 132))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabTests_img, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Inventory_img, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Treatment_img)
                        .addGap(133, 133, 133))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(MedicalStaff_img)
                .addGap(0, 0, 0)
                .addComponent(MedicalStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Patients_img)
                .addGap(0, 0, 0)
                .addComponent(PatientsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(LabTests_img)
                .addGap(0, 0, 0)
                .addComponent(LabTestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Inventory_img, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(InventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Treatment_img, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(Logout_img1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Test ID");

        jLabel27.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Patient Test Result");

        jLabel28.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Inventory");

        jLabel30.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Test Status");

        TStatusCb.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        TStatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abnormal", "Positive", "Critical" }));
        TStatusCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TStatusCbActionPerformed(evt);
            }
        });

        AddTreatmentBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        AddTreatmentBtn.setForeground(new java.awt.Color(51, 204, 0));
        AddTreatmentBtn.setText("Add Treatment");
        AddTreatmentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTreatmentBtnMouseClicked(evt);
            }
        });
        AddTreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTreatmentBtnActionPerformed(evt);
            }
        });

        UpdateTreatmentBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        UpdateTreatmentBtn.setForeground(new java.awt.Color(204, 204, 0));
        UpdateTreatmentBtn.setText("Update Treatment");
        UpdateTreatmentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateTreatmentBtnMouseClicked(evt);
            }
        });
        UpdateTreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTreatmentBtnActionPerformed(evt);
            }
        });

        DeleteTreatmentBtn.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        DeleteTreatmentBtn.setForeground(new java.awt.Color(255, 0, 0));
        DeleteTreatmentBtn.setText("Delete Treatment");
        DeleteTreatmentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteTreatmentBtnMouseClicked(evt);
            }
        });
        DeleteTreatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTreatmentBtnActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Department");

        TreatmentTable.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        TreatmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Treatment ID", "Patient ID", "Test Name", "Department", "Status", "Item ID", "Item Name"
            }
        ));
        TreatmentTable.setRowHeight(32);
        TreatmentTable.setShowHorizontalLines(true);
        TreatmentTable.setShowVerticalLines(true);
        TreatmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TreatmentTable);

        TNameCb.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        TNameCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrocardiogram", "Magnetic Resonance Img", "Skin Biopsy", "Electroencephalogram", "Visual Field Test", "Newborn Screening", "Urinalysis", "Thyroid Function Test" }));
        TNameCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNameCbActionPerformed(evt);
            }
        });

        TDepartmentCb.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        TDepartmentCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Radiology", "Dermatology", "Neurology", "Ophthalmology", "Pediatrics", "Urology", "Endocrinology", "" }));
        TDepartmentCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDepartmentCbActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Test Name");

        InventoryTable.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Type", "Stock Quantity", "Location", "Supplier"
            }
        ));
        InventoryTable.setRowHeight(32);
        InventoryTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        InventoryTable.setShowHorizontalLines(true);
        InventoryTable.setShowVerticalLines(true);
        jScrollPane4.setViewportView(InventoryTable);

        LabTestsTableResult.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        LabTestsTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test ID", "Patient ID", "Test Name", "Department", "Doctor ID", "Technician ID", "Test Status"
            }
        ));
        LabTestsTableResult.setRowHeight(32);
        LabTestsTableResult.setShowHorizontalLines(true);
        LabTestsTableResult.setShowVerticalLines(true);
        LabTestsTableResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabTestsTableResultMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(LabTestsTableResult);

        TIdCb.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        TIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIdCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(438, 438, 438))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TNameCb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TDepartmentCb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TStatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(440, 440, 440))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(194, 194, 194)
                                        .addComponent(UpdateTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DeleteTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TStatusCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TNameCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TDepartmentCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteTreatmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;

    // Mapare Test ID -> Pacient ID
    HashMap<Integer, Integer> testPatientMap = new HashMap<>();
    // Map Test ID -> Test Info (Name, Department, Status)
    HashMap<Integer, String[]> testInfoMap = new HashMap<>();
    
    private void populateTestIdComboBox() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
        String Query = "SELECT test_id, patient_id FROM lab_tests WHERE status IN ('Abnormal', 'Positive', 'Critical')";
        St = Con.createStatement();
        Rs = St.executeQuery(Query);

        TIdCb.removeAllItems();
        testPatientMap.clear();

        while (Rs.next()) {
            int testId = Rs.getInt("test_id");
            int patientId = Rs.getInt("patient_id");
            TIdCb.addItem(String.valueOf(testId));   // pune ID-ul în ComboBox
            testPatientMap.put(testId, patientId); // legătura test->pacient 
        }

        Con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private void populateTestDepartmentMap() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
        String Query = "SELECT test_id, test_name, department, status FROM lab_tests WHERE status IN ('Abnormal', 'Positive', 'Critical')";
        St = Con.createStatement();
        Rs = St.executeQuery(Query);

        testInfoMap.clear();

        while (Rs.next()) {
            int testId = Rs.getInt("test_id");
            String testName = Rs.getString("test_name");
            String department = Rs.getString("department");
            String status = Rs.getString("status");

            testInfoMap.put(testId, new String[]{testName, department, status});
        }

        Con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
   private void syncTestSelection() {
    if (TIdCb.getSelectedItem() != null) {
        String selectedItem = (String) TIdCb.getSelectedItem();
        if (!selectedItem.isEmpty()) {
            int selectedTestId = Integer.parseInt(selectedItem);

            if (testInfoMap.containsKey(selectedTestId)) {
                String[] testData = testInfoMap.get(selectedTestId);
                TNameCb.setSelectedItem(testData[0]); 
                TDepartmentCb.setSelectedItem(testData[1]); 
                TStatusCb.setSelectedItem(testData[2]); 
            }
        }
    }
}
    
    private void FilterLabTestsBySelectedTest() {
    if (TIdCb.getSelectedItem() != null) {
        // Obtine ID-ul testului selectat din TIdCb
        String selectedItem = (String) TIdCb.getSelectedItem();
        if (!selectedItem.isEmpty()) {
            int selectedTestId = Integer.parseInt(selectedItem);

            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
                String Query = "SELECT * FROM lab_tests WHERE test_id = ?";
                PreparedStatement pst = Con.prepareStatement(Query);
                pst.setInt(1, selectedTestId);
                Rs = pst.executeQuery();

                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new String[]{"Test ID", "Patient ID", "Test Name", "Department", "Doctor ID", "Technician ID", "Status"});

                // Daca exista rezultate, le adaugam în tabel
                while (Rs.next()) {
                    model.addRow(new Object[]{
                        Rs.getInt("test_id"),
                        Rs.getInt("patient_id"),
                        Rs.getString("test_name"),
                        Rs.getString("department"),
                        Rs.getInt("employee1_id"), 
                        Rs.getInt("employee2_id"),
                        Rs.getString("status")
                    });
                }

                // Actualizeaza modelul tabelului cu datele obtinute
                LabTestsTableResult.setModel(model);
                Con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
    
    private void setupListeners() {
    TIdCb.addActionListener(evt -> {
        syncTestSelection(); // Actualizeaza comboboxurile pe baza testului selectat
        FilterLabTestsBySelectedTest(); // Filtreaza tabelul LabTestsTableResult pe baza testului selectat
    });

    // Blocam selectarea manuala a comboboxurilor
    TNameCb.setEnabled(false);
    TDepartmentCb.setEnabled(false);
    TStatusCb.setEnabled(false);
}
    private void DisplayLabTests() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
        String Query = "SELECT test_id, patient_id, test_name, department, employee1_id, employee2_id, status FROM lab_tests WHERE status IN ('Abnormal', 'Positive', 'Critical')";
        St = Con.createStatement();
        Rs = St.executeQuery(Query);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Test ID", "Patient ID", "Test Name", "Department", "Employee1 ID", "Employee2 ID", "Status"});

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getInt("test_id"),
                Rs.getInt("patient_id"),
                Rs.getString("test_name"),
                Rs.getString("department"),
                Rs.getInt("employee1_id"),
                Rs.getInt("employee2_id"),
                Rs.getString("status")
            });
        }

        LabTestsTableResult.setModel(model);
        Con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}




    private void DisplayInventory() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
        String Query = "SELECT * FROM inventory";
        St = Con.createStatement();
        Rs = St.executeQuery(Query);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Item ID", "Item Name", "Item Type", "Stock Quantity", "Location", "Supplier"});

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getInt("item_id"),
                Rs.getString("item_name"),
                Rs.getString("item_type"),
                Rs.getInt("stock_quantity"),
                Rs.getString("location"),
                Rs.getString("supplier")
            });
        }

        InventoryTable.setModel(model);
        Con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void DisplayTreatments() {
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
        String Query = "SELECT * FROM treatment";
        St = Con.createStatement();
        Rs = St.executeQuery(Query);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Treatment ID", "Patient ID", "Test Name", "Department", "Status", "Item ID", "Item Name"});

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getInt("treatment_id"),
                Rs.getInt("patient_id"),
                Rs.getString("test_name"),
                Rs.getString("department"),
                Rs.getString("status"),
                Rs.getInt("item_id"),
                Rs.getString("item_name")
            });
        }

        TreatmentTable.setModel(model);
        Con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    private void MedicalStaff_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicalStaff_imgMouseClicked
        new MedicalStaff().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MedicalStaff_imgMouseClicked

    private void Patients_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Patients_imgMouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Patients_imgMouseClicked

    private void LabTests_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabTests_imgMouseClicked
        new LabTests().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabTests_imgMouseClicked

    private void Inventory_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inventory_imgMouseClicked
        new Inventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Inventory_imgMouseClicked

    private void MedicalStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicalStaffBtnMouseClicked
        new MedicalStaff().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MedicalStaffBtnMouseClicked

    private void MedicalStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalStaffBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicalStaffBtnActionPerformed

    private void PatientsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientsBtnMouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PatientsBtnMouseClicked

    private void PatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientsBtnActionPerformed

    private void LabTestsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabTestsBtnMouseClicked
        new LabTests().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabTestsBtnMouseClicked

    private void LabTestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabTestsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabTestsBtnActionPerformed

    private void InventoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryBtnMouseClicked
        new Inventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InventoryBtnMouseClicked

    private void InventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InventoryBtnActionPerformed

    private void TStatusCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TStatusCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TStatusCbActionPerformed
    
    private void AddTreatmentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTreatmentBtnMouseClicked
        // Verificăm dacă au fost selectate un test și un obiect din inventar
    if (TIdCb.getSelectedItem() == null || InventoryTable.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Please select a Test and an Item.");
    } else {
        try {
            // Obținem ID-ul testului selectat
            int testId = Integer.parseInt((String) TIdCb.getSelectedItem());
            
            // Obținem detaliile testului din mapa 'testInfoMap'
            String[] testData = testInfoMap.get(testId);
            String testName = testData[0];
            String department = testData[1];
            String status = testData[2];

            // Obținem patient_id din testPatientMap folosind testId
            int patientId = testPatientMap.get(testId);

            // Obținem item_id și item_name din selecția din InventoryTable
            int itemId = (int) InventoryTable.getValueAt(InventoryTable.getSelectedRow(), 0);
            String itemName = (String) InventoryTable.getValueAt(InventoryTable.getSelectedRow(), 1);

            // Conectare la baza de date
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");

            // Interogare INSERT pentru a adăuga tratamentul în tabelul 'treatment'
            String query = "INSERT INTO treatment (test_id, patient_id, test_name, department, status, item_id, item_name) VALUES (?, ?, ?, ?, ?, ?, ?)";
PreparedStatement pst = Con.prepareStatement(query);

            // Setăm valorile corect
            pst.setInt(1, testId);        // test_id
            pst.setInt(2, patientId);     // patient_id
            pst.setString(3, testName);   // test_name
            pst.setString(4, department); // department
            pst.setString(5, status);     // status
            pst.setInt(6, itemId);        // item_id
            pst.setString(7, itemName);   // item_name

            // Executăm interogarea
            pst.executeUpdate();
            
            // Afișăm mesaj de succes și actualizăm tabelul TreatmentTable
            JOptionPane.showMessageDialog(this, "Treatment Added Successfully");
            DisplayTreatments();
           

            // Închidem conexiunea
            Con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_AddTreatmentBtnMouseClicked

    private void AddTreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTreatmentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddTreatmentBtnActionPerformed

    private void UpdateTreatmentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateTreatmentBtnMouseClicked
  if (TreatmentTable.getSelectedRow() == -1 || InventoryTable.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Please select a treatment from the table and a new item from the inventory.");
    } else {
        try {
            int treatmentId = (int) TreatmentTable.getValueAt(TreatmentTable.getSelectedRow(), 0);
            int itemId = (int) InventoryTable.getValueAt(InventoryTable.getSelectedRow(), 0);
            String itemName = (String) InventoryTable.getValueAt(InventoryTable.getSelectedRow(), 1);

            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
            String Query = "UPDATE treatment SET item_id = ?, item_name = ? WHERE treatment_id = ?";
            PreparedStatement Update = Con.prepareStatement(Query);
            Update.setInt(1, itemId);
            Update.setString(2, itemName);
            Update.setInt(3, treatmentId);

            int row = Update.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Treatment Updated Successfully");
                DisplayTreatments();
            } else {
                JOptionPane.showMessageDialog(this, "Update Failed");
            }

            Con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }        
        
    }//GEN-LAST:event_UpdateTreatmentBtnMouseClicked

    private void UpdateTreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTreatmentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateTreatmentBtnActionPerformed

    private void DeleteTreatmentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteTreatmentBtnMouseClicked
     if (TreatmentTable.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Please select a treatment to delete.");
    } else {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this treatment?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                int treatmentId = (int) TreatmentTable.getValueAt(TreatmentTable.getSelectedRow(), 0);

                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
                String Query = "DELETE FROM treatment WHERE treatment_id = ?";
                PreparedStatement Delete = Con.prepareStatement(Query);
                Delete.setInt(1, treatmentId);

                int row = Delete.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(this, "Treatment Deleted Successfully");
                    DisplayTreatments();
                } else {
                    JOptionPane.showMessageDialog(this, "Delete Failed");
                }

                Con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
        
    }//GEN-LAST:event_DeleteTreatmentBtnMouseClicked

    private void DeleteTreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTreatmentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteTreatmentBtnActionPerformed

    private void TreatmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentTableMouseClicked
        // TODO add your handling code here:      
    }//GEN-LAST:event_TreatmentTableMouseClicked

    private void TNameCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNameCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNameCbActionPerformed

    private void TDepartmentCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDepartmentCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TDepartmentCbActionPerformed

    private void LabTestsTableResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabTestsTableResultMouseClicked
       
        
    }//GEN-LAST:event_LabTestsTableResultMouseClicked

    private void TIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIdCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIdCbActionPerformed

    private void TreatmentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentBtnMouseClicked
        new Treatment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TreatmentBtnMouseClicked

    private void TreatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TreatmentBtnActionPerformed

    private void Treatment_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Treatment_imgMouseClicked
        new Treatment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Treatment_imgMouseClicked

    private void Logout_img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_img1MouseClicked
        if (JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to leave?",
            "Confirm Logout",
            JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION) {
        new Login().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_Logout_img1MouseClicked

    
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
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTreatmentBtn;
    private javax.swing.JButton DeleteTreatmentBtn;
    private javax.swing.JButton InventoryBtn;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JLabel Inventory_img;
    private javax.swing.JButton LabTestsBtn;
    private javax.swing.JTable LabTestsTableResult;
    private javax.swing.JLabel LabTests_img;
    private javax.swing.JLabel Logout_img1;
    private javax.swing.JButton MedicalStaffBtn;
    private javax.swing.JLabel MedicalStaff_img;
    private javax.swing.JButton PatientsBtn;
    private javax.swing.JLabel Patients_img;
    private javax.swing.JComboBox<String> TDepartmentCb;
    private javax.swing.JComboBox<String> TIdCb;
    private javax.swing.JComboBox<String> TNameCb;
    private javax.swing.JComboBox<String> TStatusCb;
    private javax.swing.JButton TreatmentBtn;
    private javax.swing.JTable TreatmentTable;
    private javax.swing.JLabel Treatment_img;
    private javax.swing.JButton UpdateTreatmentBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
