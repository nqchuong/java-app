/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class VerifyData extends javax.swing.JFrame {

    /**
     * Creates new form VerifyData
     */
    public VerifyData() {
        initComponents();

    }
    //check student code max length 10
    String checkLenghtSC = "^[a-zA-Z0-9]{1,10}$";
    Pattern patternSC = Pattern.compile(checkLenghtSC);
    //check student name max length 30

    //check birthdate format mm/dd/yyyy
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    //checck phone number max length 15
    String checkPhone = "^[0-9]{1,15}$";
    Pattern patternPhonne = Pattern.compile(checkPhone);
    //check email only 1 @ is special
    String checkEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern patternEmail = Pattern.compile(checkEmail);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfStudentCode = new javax.swing.JTextField();
        tfStudentName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfBirthdate = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Code");

        jLabel2.setText("Student Name");

        jLabel3.setText("Birthdate");

        jLabel4.setText("Phone number");

        jLabel5.setText("Email");

        tfStudentCode.setText(" ");
        tfStudentCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStudentCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStudentCodeFocusLost(evt);
            }
        });
        tfStudentCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfStudentCodeKeyPressed(evt);
            }
        });

        tfStudentName.setText(" ");
        tfStudentName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStudentNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStudentNameFocusLost(evt);
            }
        });

        tfPhone.setText(" ");
        tfPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPhoneFocusLost(evt);
            }
        });

        tfBirthdate.setText(" ");
        tfBirthdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBirthdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBirthdateFocusLost(evt);
            }
        });

        tfEmail.setText(" ");
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailFocusLost(evt);
            }
        });
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(tfStudentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfStudentName)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(tfBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(70, 70, 70)
                                .addComponent(tfEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfPhone)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfStudentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfStudentCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStudentCodeFocusLost
        // TODO add your handling code here:
        if (tfStudentCode.getText().equals("")) {
            tfStudentCode.setText(" ");
            tfStudentCode.setBackground(Color.red);
            // JOptionPane.showMessageDialog(null, "Student Code is empty, please insert!!");
        } else if (tfStudentCode.getText() != null) {
            Matcher matcher = patternSC.matcher(tfStudentCode.getText());
            System.out.println(matcher.matches());
            if (matcher.matches() == false) {
                tfStudentCode.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Please insert incorrect format!!");
            } else {
                tfStudentCode.setBackground(Color.white);
            }
        }
    }//GEN-LAST:event_tfStudentCodeFocusLost

    private void tfStudentNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStudentNameFocusLost
        // TODO add your handling code here:
        if (tfStudentName.getText().equals("")) {
            tfStudentName.setText(" ");
            tfStudentName.setBackground(Color.red);
            //  JOptionPane.showMessageDialog(null, "Student Namem is empty, please insert!!");
        } else if (tfStudentName.getText().length() <= 30) {
            if (tfStudentName.getText().equals("")) {
                tfStudentName.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Please insert incorrect format!!");
            } else {
                tfStudentName.setBackground(Color.white);
            }
        } else if (tfStudentName.getText().length() > 30) {
            tfStudentName.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Please insert incorrect format!!");
        }
    }//GEN-LAST:event_tfStudentNameFocusLost

    private void tfBirthdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBirthdateFocusLost
        // TODO add your handling code here:
        sdf.setLenient(false);
        if (tfBirthdate.getText().equals(" ")) {
            tfBirthdate.setText("");
            tfBirthdate.setBackground(Color.red);
            //  JOptionPane.showMessageDialog(null, "Birthdate empty, please insert!!");
        } else if (tfBirthdate.getText() != null) {
            try {
                Date d1 = sdf.parse(tfBirthdate.getText());
                System.out.println(d1);
                System.out.println("true");
                tfBirthdate.setBackground(Color.white);
            } catch (Exception e) {
                System.out.println("false");
                tfBirthdate.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Please insert incorrect format MM/DD/YYYY!!");
            }
        }
    }//GEN-LAST:event_tfBirthdateFocusLost

    private void tfPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPhoneFocusLost
        // TODO add your handling code here:
        if (tfPhone.getText().equals(" ")) {
            tfPhone.setText("");
            tfPhone.setBackground(Color.red);
            //JOptionPane.showMessageDialog(null, "Phone is empty, please insert!!");
        } else if (tfPhone.getText() != null) {
            Matcher matcher = patternPhonne.matcher(tfPhone.getText());
            System.out.println(matcher.matches());
            if (matcher.matches() == false) {
                tfPhone.setBackground(Color.red);
             //   JOptionPane.showMessageDialog(null, "Please insert incorrect format!!");
            } else {
                tfPhone.setBackground(Color.white);
            }
        }
    }//GEN-LAST:event_tfPhoneFocusLost

    private void tfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusLost
        // TODO add your handling code here:
        if (tfEmail.getText().equals("")) {
            tfEmail.setText(" ");
            tfEmail.setBackground(Color.red);
            // JOptionPane.showMessageDialog(null, "Email is empty, please insert!!");
        } else if (tfEmail.getText() != null) {
            Matcher matcher = patternEmail.matcher(tfEmail.getText());
            System.out.println(matcher.matches());
            if (matcher.matches() == false) {
                tfEmail.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Please insert incorrect format!!");
            } else {
                tfEmail.setBackground(Color.white);
            }
        }
    }//GEN-LAST:event_tfEmailFocusLost

    private void tfStudentCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStudentCodeFocusGained
        // TODO add your handling code here:
        if (tfStudentCode.getText().equals(" ")) {
            tfStudentCode.setText("");
        }
    }//GEN-LAST:event_tfStudentCodeFocusGained

    private void tfStudentNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStudentNameFocusGained
        // TODO add your handling code here:
        if (tfStudentName.getText().equals(" ")) {
            tfStudentName.setText("");
        }
    }//GEN-LAST:event_tfStudentNameFocusGained

    private void tfBirthdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBirthdateFocusGained
        // TODO add your handling code here:
        if (tfBirthdate.getText().equals(" ")) {
            tfBirthdate.setText("");
        }
    }//GEN-LAST:event_tfBirthdateFocusGained

    private void tfPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPhoneFocusGained
        // TODO add your handling code here:
        if (tfPhone.getText().equals(" ")) {
            tfPhone.setText("");
        }
    }//GEN-LAST:event_tfPhoneFocusGained

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        // TODO add your handling code here:
        if (tfEmail.getText().equals(" ")) {
            tfEmail.setText("");
        }
    }//GEN-LAST:event_tfEmailFocusGained

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (tfBirthdate != null && tfEmail != null && tfPhone != null && tfStudentCode != null && tfStudentName != null
                        && tfBirthdate.getBackground() == Color.white
                        && tfEmail.getBackground() == Color.white
                        && tfPhone.getBackground() == Color.white
                        && tfStudentCode.getBackground() == Color.white
                        && tfStudentName.getBackground() == Color.white) {
                    JOptionPane.showMessageDialog(null, "All Data is valid!!!");
                }
            } catch (NullPointerException ex) {

            }
        }
    }//GEN-LAST:event_tfEmailKeyPressed

    private void tfStudentCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStudentCodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (tfBirthdate != null && tfEmail != null && tfPhone != null && tfStudentCode != null && tfStudentName != null
                        && tfBirthdate.getBackground() == Color.white
                        && tfEmail.getBackground() == Color.white
                        && tfPhone.getBackground() == Color.white
                        && tfStudentCode.getBackground() == Color.white
                        && tfStudentName.getBackground() == Color.white) {
                    JOptionPane.showMessageDialog(null, "All Data is valid!!!");
                }
            } catch (NullPointerException ex) {

            }
        }
    }//GEN-LAST:event_tfStudentCodeKeyPressed

    /**
     * z
     *
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
            java.util.logging.Logger.getLogger(VerifyData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyData().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfBirthdate;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfStudentCode;
    private javax.swing.JTextField tfStudentName;
    // End of variables declaration//GEN-END:variables

}
