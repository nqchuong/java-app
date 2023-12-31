/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.ui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class ComboBoxDemo extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ComboBoxDemo
     */
    ImageIcon pig = new ImageIcon(getClass().getResource("/Image/pig.png"));
    ImageIcon bird = new ImageIcon(getClass().getResource("/Image/bird.png"));
    ImageIcon rabbit = new ImageIcon(getClass().getResource("/Image/rabbit.png"));
    ImageIcon dog = new ImageIcon(getClass().getResource("/Image/dog.png"));
    ImageIcon cat = new ImageIcon(getClass().getResource("/Image/cat.png"));

    public ComboBoxDemo() {
        initComponents();
        cbPicture.setEditable(true);
        cbPicture.addItem("Bird");
        cbPicture.addItem("Cat");
        cbPicture.addItem("Dog");
        cbPicture.addItem("Rabbit");
        cbPicture.addItem("Pig");

        lbPicture.setHorizontalAlignment(lbPicture.CENTER);
        cbPicture.setSelectedIndex(4);
        cbPicture.addActionListener(this);
        String item = (String) cbPicture.getSelectedItem();
        if (item.equals("Pig")) {
            lbPicture.setIcon(pig);
        } else if (item.equals("Bird")) {
            lbPicture.setIcon(bird);
        } else if (item.equals("Cat")) {
            lbPicture.setIcon(cat);
        } else if (item.equals("Dog")) {
            lbPicture.setIcon(dog);
        } else if (item.equals("Rabbit")) {
            lbPicture.setIcon(rabbit);
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

        lbPicture = new javax.swing.JLabel();
        cbPicture = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ComboBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPicture;
    private javax.swing.JLabel lbPicture;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String item = (String) cb.getSelectedItem();
        if (item.equals("Pig")) {
            lbPicture.setIcon(pig);
        } else if (item.equals("Bird")) {
            lbPicture.setIcon(bird);
        } else if (item.equals("Cat")) {
            lbPicture.setIcon(cat);
        } else if (item.equals("Dog")) {
            lbPicture.setIcon(dog);
        } else if (item.equals("Rabbit")) {
            lbPicture.setIcon(rabbit);
        }
    }
}
