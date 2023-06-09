/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.Address;
import data.InPatientClass;
import data.OutPatientClass;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Mpho.Makhari
 */
public class PatientManagementApplication extends javax.swing.JFrame {

    /**
     * Creates new form PatientManagementApplication
     */
    public PatientManagementApplication() {
        initComponents();
        radButtonGroup();

        for (int i = 100; i <= 2000; i += 50) {

            cmbAmount.addItem(String.valueOf(i));
        }

    }

    private void radButtonGroup() {
        ButtonGroup radButtonGroup = new ButtonGroup();

        radButtonGroup.add(radOutPatient);
        radButtonGroup.add(radInPatient);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        pnlAddress = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTown = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPostalCode = new javax.swing.JTextField();
        pnlIntPatient = new javax.swing.JPanel();
        chkIntensiveCare = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtDaysSpent = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        pnlType1 = new javax.swing.JPanel();
        radOutPatient = new javax.swing.JRadioButton();
        radInPatient = new javax.swing.JRadioButton();
        btnCreateandDisplay = new javax.swing.JButton();
        pnlOutPatient1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbAmount = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Management App (Makhari Mpho)");

        pnlGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel1.setText("Surname:");

        txtSurname.setColumns(20);

        jLabel2.setText("ID:");

        txtID.setColumns(20);

        jLabel3.setText("Telephone:");

        txtTelephone.setColumns(20);

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel4.setText("Street:");

        txtStreet.setColumns(20);

        jLabel5.setText("Town:");

        cmbTown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duduza", "Heidelburg", "Devon", " " }));
        cmbTown.setToolTipText("");

        jLabel6.setText("Postal code:");

        txtPostalCode.setColumns(20);

        javax.swing.GroupLayout pnlAddressLayout = new javax.swing.GroupLayout(pnlAddress);
        pnlAddress.setLayout(pnlAddressLayout);
        pnlAddressLayout.setHorizontalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddressLayout.createSequentialGroup()
                        .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(cmbTown, 0, 150, Short.MAX_VALUE)))
                    .addGroup(pnlAddressLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddressLayout.setVerticalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIntPatient.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "In Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        chkIntensiveCare.setSelected(true);
        chkIntensiveCare.setText("Intensive Care");

        jLabel7.setText("Days Spent:");

        txtDaysSpent.setColumns(20);

        javax.swing.GroupLayout pnlIntPatientLayout = new javax.swing.GroupLayout(pnlIntPatient);
        pnlIntPatient.setLayout(pnlIntPatientLayout);
        pnlIntPatientLayout.setHorizontalGroup(
            pnlIntPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntPatientLayout.createSequentialGroup()
                .addGroup(pnlIntPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkIntensiveCare)
                    .addGroup(pnlIntPatientLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDaysSpent, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        pnlIntPatientLayout.setVerticalGroup(
            pnlIntPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntPatientLayout.createSequentialGroup()
                .addComponent(chkIntensiveCare)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlIntPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDaysSpent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        taDisplay.setColumns(20);
        taDisplay.setRows(5);
        jScrollPane1.setViewportView(taDisplay);

        pnlType1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type of Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        radOutPatient.setText("OutPatient");
        radOutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radOutPatientActionPerformed(evt);
            }
        });

        radInPatient.setSelected(true);
        radInPatient.setText("InPatient");
        radInPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radInPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlType1Layout = new javax.swing.GroupLayout(pnlType1);
        pnlType1.setLayout(pnlType1Layout);
        pnlType1Layout.setHorizontalGroup(
            pnlType1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlType1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlType1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radInPatient)
                    .addComponent(radOutPatient))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        pnlType1Layout.setVerticalGroup(
            pnlType1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlType1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radOutPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radInPatient))
        );

        btnCreateandDisplay.setText("Create Patient and Display");
        btnCreateandDisplay.setActionCommand("");
        btnCreateandDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateandDisplayActionPerformed(evt);
            }
        });

        pnlOutPatient1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Out Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel8.setText("Medicine Amount: ");

        cmbAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Amount" }));
        cmbAmount.setToolTipText("");

        javax.swing.GroupLayout pnlOutPatient1Layout = new javax.swing.GroupLayout(pnlOutPatient1);
        pnlOutPatient1.setLayout(pnlOutPatient1Layout);
        pnlOutPatient1Layout.setHorizontalGroup(
            pnlOutPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutPatient1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbAmount, 0, 103, Short.MAX_VALUE))
        );
        pnlOutPatient1Layout.setVerticalGroup(
            pnlOutPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutPatient1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(pnlOutPatient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(pnlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlIntPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlOutPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnCreateandDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlIntPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOutPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateandDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radOutPatientActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radOutPatientActionPerformed
    {//GEN-HEADEREND:event_radOutPatientActionPerformed
        if (radInPatient.isSelected()) {
            pnlIntPatient.setVisible(true);
            pnlOutPatient1.setVisible(false);
            cmbAmount.setVisible(false);
        } else if (radOutPatient.isSelected()) {
            pnlIntPatient.setVisible(false);
            pnlOutPatient1.setVisible(true);
            cmbAmount.setVisible(true);
        }
    }//GEN-LAST:event_radOutPatientActionPerformed

    private void radInPatientActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radInPatientActionPerformed
    {//GEN-HEADEREND:event_radInPatientActionPerformed
        if (radInPatient.isSelected()) {
            pnlIntPatient.setVisible(true);
            pnlOutPatient1.setVisible(false);
            cmbAmount.setVisible(false);
        } else if (radOutPatient.isSelected()) {
            pnlIntPatient.setVisible(false);
            pnlOutPatient1.setVisible(true);
            cmbAmount.setVisible(true);
        }
    }//GEN-LAST:event_radInPatientActionPerformed

    private void btnCreateandDisplayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCreateandDisplayActionPerformed
    {//GEN-HEADEREND:event_btnCreateandDisplayActionPerformed
        double medicineAmount;
        String surname, id, telephone;

        Address address;
        int numberOfDays;
        boolean intensiveCare;
        OutPatientClass objOut = new OutPatientClass();
        InPatientClass objIn = new InPatientClass();

        String street;
        String town;
        String postalCode;

        try {
            surname = txtSurname.getText();
            id = txtID.getText();
            telephone = txtTelephone.getText();
            medicineAmount = Double.parseDouble((String) cmbAmount.getSelectedItem());
            numberOfDays = Integer.parseInt(txtDaysSpent.getText());

            street = txtStreet.getText();
            town = cmbTown.getSelectedItem().toString();
            postalCode = txtPostalCode.getText();

            address = new Address(street, town, postalCode);

            if (radInPatient.isSelected()) {

                if (chkIntensiveCare.isSelected()) {
                    intensiveCare = true;
                } else {
                    intensiveCare = false;
                }

                objIn = new InPatientClass(numberOfDays, intensiveCare, surname, id, telephone, address);

                taDisplay.append(objIn.toString() + "\n");
            } else if (radOutPatient.isSelected()) {
                objOut = new OutPatientClass(medicineAmount, surname, id, telephone, address);

                taDisplay.append(objOut.toString() + "\n");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_btnCreateandDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(PatientManagementApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientManagementApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientManagementApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientManagementApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientManagementApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateandDisplay;
    private javax.swing.JCheckBox chkIntensiveCare;
    private javax.swing.JComboBox<String> cmbAmount;
    private javax.swing.JComboBox<String> cmbTown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAddress;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlIntPatient;
    private javax.swing.JPanel pnlOutPatient1;
    private javax.swing.JPanel pnlType1;
    private javax.swing.JRadioButton radInPatient;
    private javax.swing.JRadioButton radOutPatient;
    private javax.swing.JTextArea taDisplay;
    private javax.swing.JTextField txtDaysSpent;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
