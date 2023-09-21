/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.view;

import chuongnq.daos.StockDao;
import chuongnq.dtos.StockDto;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class StockTable extends javax.swing.JFrame {

    /**
     * Creates new form StockTable
     */
    public StockTable() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Stock one", "No1-Washington street", "11/01/2010", "Not S1epecial  "},
                {"2", "Stock two				", "372 Cave Town", "09/01/2011", "Good 1store"},
                {"3", "Stock three", "Nary angel", "13/01/2010", "Store1 dangerous materials"},
                {"4", "Stock four", "Twin tower", "04/01/2015", "Store 1dangerous materials"},
                {"5", "Stock five", "Victory anniversary", "08/01/2014", "Store 1dangerous materials"}
            },
            new String [] {
                "StockID", "StockName", "Address", "DateAvailable", "Note"
            }
        ));
        jScrollPane1.setViewportView(tblStock);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(btnInsert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsert)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//aray
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        ArrayList<StockDto> list = new ArrayList<StockDto>();
        for (int i = 0; i < tblStock.getRowCount(); i++) {
            try {
                int StockID = Integer.parseInt(tblStock.getValueAt(i, 0).toString());
                String StockName = tblStock.getValueAt(i, 1).toString();
                String Address = tblStock.getValueAt(i, 2).toString();
                java.util.Date date1 = new SimpleDateFormat("dd/mm/yyyy").parse(tblStock.getValueAt(i, 3).toString());
                Date DateAvailable = new java.sql.Date(date1.getTime());
                String Note = tblStock.getValueAt(i, 4).toString();
                StockDto dto = new StockDto(StockID, StockName, Address, Note, DateAvailable);
                list.add(dto);
            } catch (Exception ex) {
                System.out.println("Error at btnInsert try 1 " + ex.getMessage());
            }
        }
        StockDao dao = new StockDao();
        try {
            dao.insertStock(list);
        } catch (Exception ex) {
            System.out.println("Error at btnInsert try 2 " + ex.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(StockTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblStock;
    // End of variables declaration//GEN-END:variables
}
