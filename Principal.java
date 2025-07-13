package com.mycompany.a6friends;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(141, 141, 232));
        setBounds(new java.awt.Rectangle(353, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Number");

        txtNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtNumber.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Actividad #6 - Programación Orientada a Objetos");

        btnClear.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

            try {

                    String newName = String.valueOf(txtName.getText());

                    long newNumber = Long.parseLong(txtNumber.getText());

                    String nameNumberString;
                    String name;
                    long number;
                    int index;

                    File file = new File("C:\\Users\\user\\Documents\\Universidad\\2025-1S\\Programación Orientada a Objetos\\Actividad 6 POO\\A6Friends.txt");
                    
                    //creating the file object
                    if (file.exists() == false) {
                        file.createNewFile();
                    }
                    
                    //creating the raf
                    RandomAccessFile raf = new RandomAccessFile(file, "rw");
                    boolean found = false;
                    
                    //if friend exists
                    while (raf.getFilePointer() < raf.length()) {

                        nameNumberString = raf.readLine();

                        String[] lineSplit = nameNumberString.split("!");

                        name = lineSplit[0];
                        number = Long.parseLong(lineSplit[1]);

                        if (name.equals(newName) || number == newNumber) {
                            found = true;
                            break;
                        }
                    } // end of if friend exists

                    if (found == false) {

                        nameNumberString = newName + "!" + String.valueOf(newNumber);

                        raf.writeBytes(nameNumberString);

                        raf.writeBytes(System.lineSeparator());

                        JOptionPane.showMessageDialog(null, " Friend added.");

                        raf.close();
                    }
                    else {

                        raf.close();
                        
                        JOptionPane.showMessageDialog(null, " The contact exists.");
                    }
                }

        catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error");
            txtName.setText("");
            txtNumber.setText("");
        }
        catch (NumberFormatException nef) {
            JOptionPane.showMessageDialog(null, "Error");
            txtName.setText("");
            txtNumber.setText("");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed

    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try {

                    String nameNumberString;
                    String name;
                    String newName = String.valueOf(txtName.getText());
                    
                    long number;
                    int index;

                    File file = new File("C:\\Users\\user\\Documents\\Universidad\\2025-1S\\Programación Orientada a Objetos\\Actividad 6 POO\\A6Friends.txt");
                    
                    //creating the file object
                    if (file.exists() == false) {
                        file.createNewFile();
                    }
                    
                    //creating the raf
                    RandomAccessFile raf = new RandomAccessFile(file, "rw");
                    boolean found = false;
                    
                    //if friend exists
                    while (raf.getFilePointer() < raf.length()) {

                        nameNumberString = raf.readLine();

                        String[] lineSplit = nameNumberString.split("!");

                        name = lineSplit[0];
                        number = Long.parseLong(lineSplit[1]);

                        if (name.equals(newName)) {
                            txtName.setText(String.valueOf(name));
                            txtNumber.setText(String.valueOf(number));
                            // closing the raf
                            raf.close();
                                    found = true;
                        }
                    } // end of if friend exists
                    
                    if (found == false) {

                        raf.close();
                        txtName.setText("");
                        txtNumber.setText("");
                        JOptionPane.showMessageDialog(null, " The contact does not exists.");
                        }
                    
                }

        catch (IOException ioe) {
            
        }
        catch (NumberFormatException nef) {
            JOptionPane.showMessageDialog(null, "Error.");
            txtName.setText("");
            txtNumber.setText("");
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {

            String newName = txtName.getText();
            long newNumber = Long.parseLong(txtNumber.getText());

            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("C:\\Users\\user\\Documents\\Universidad\\2025-1S\\Programación Orientada a Objetos\\Actividad 6 POO\\A6Friends.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(newName) && number == newNumber) {
                        found = true;
                    break;
                }
            }

            if (found == true) {

                File tmpFile = new File("temp.txt");
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {

                    nameNumberString = raf.readLine();
                    
                    String[] lineSplit2 = nameNumberString.split("!");
                    
                    name = lineSplit2[0];
                    number = Long.parseLong(lineSplit2[1]);

                    if (name.equals(newName) && number == newNumber) {
                        continue;
                    }
                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();

                JOptionPane.showMessageDialog(null, "The contact was delete", "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtNumber.setText("");
        txtName.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {

            String nametoUpdate = txtName.getText();
            long numbertoUpdate = Long.parseLong(txtNumber.getText());

            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("C:\\Users\\user\\Documents\\Universidad\\2025-1S\\Programación Orientada a Objetos\\Actividad 6 POO\\A6Friends.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {
                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(nametoUpdate) && number == numbertoUpdate) {
                        found = true;
                    break;
                }
            }

            if (found == true) {

                File tmpFile = new File("temp.txt");
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {

                    nameNumberString = raf.readLine();
                    
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);

                    if (name.equals(nametoUpdate)) {
                        nameNumberString = name + "!" + String.valueOf(numbertoUpdate);
                    }
                    
                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();

                JOptionPane.showMessageDialog(null, "The contact was update", "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
            
            else {
                raf.close();
                
                JOptionPane.showMessageDialog(null, "The contact doesn't exist", "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }
        
        catch (NumberFormatException nef) {
            JOptionPane.showMessageDialog(null, "Error.");
            txtName.setText("");
            txtNumber.setText("");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}