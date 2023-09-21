/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class PuzzleGame extends javax.swing.JFrame implements ActionListener {

    private boolean win = false;
    private int state = 0;
    private int count = 0;
    private int time = 0;

    /**
     * Creates new form PuzzleGame
     */
    public PuzzleGame() {
        initComponents();
        btnNewGame.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        cbSize.setSelectedIndex(1);
    }

    //random game 4x4 array
    public void randomGame4x4() {
        JButton[] arrButtons = new JButton[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16};
        ArrayList<Integer> checkNumber = new ArrayList<>();
        btn16.setText(" ");
        for (int i = 0; i < 15;) {
            int temp = (int) (Math.random() * 100) % 15 + 1;
            if (!checkNumber.contains(temp)) {
                checkNumber.add(temp);
                arrButtons[i].setText(String.valueOf(temp));
                i++;
            }
        }
    }

    //xet dieu kien game 4x4 int
    public boolean valid4x4() throws NumberFormatException {
        JButton[] arrButtons = new JButton[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16};
        int[] temp = new int[16];
        for (int i = 0; i < 16; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 15; j++) {
                if (Integer.parseInt(arrButtons[i].getText()) > Integer.parseInt(arrButtons[j].getText())) {
                    temp[i] += 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum = sum + temp[i];
        }
        //System.out.println(sum);
        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    //random game 3x3 array
    public void randomGame3x3() {
        JButton[] arrButtons = new JButton[]{btn1, btn2, btn3, btn5, btn6, btn7, btn9, btn10, btn11};
        ArrayList<Integer> checkNumber = new ArrayList<>();
        btn11.setText(" ");
        for (int i = 0; i < 8;) {
            int temp = (int) (Math.random() * 100) % 8 + 1;
            if (!checkNumber.contains(temp)) {
                checkNumber.add(temp);
                arrButtons[i].setText(String.valueOf(temp));
                i++;
            }
        }
    }

    //xet dieu kien game 3x3
    public boolean valid3x3() throws NumberFormatException {
        JButton[] arrButtons = new JButton[]{btn1, btn2, btn3, btn5, btn6, btn7, btn9, btn10, btn11};
        int[] temp = new int[9];
        for (int i = 0; i < 9; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (Integer.parseInt(arrButtons[i].getText()) > Integer.parseInt(arrButtons[j].getText())) {
                    temp[i] += 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum = sum + temp[i];
        }
        System.out.println(sum);
        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    //thiet lap bo dem thoi gian
    public void count() {
        time = 0;
        Thread th = new Thread() {
            @Override
            public void run() {
                while (!win) {
                    try {
                        lbTime.setText(" " + time);
                        time++;
                        sleep(1000);
                    } catch (Exception ex) {
                        System.out.println("Error at count " + ex.getMessage());
                    }
                }
            }
        };
        th.start();
    }

    public void moveTwo(JButton center, JButton next, JButton prev) {
        if (next.getText().equals(" ")) {
            next.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + ++count);
        }
        if (prev.getText().equals(" ")) {
            prev.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + ++count);
        }
    }

    public void moveThree(JButton center, JButton next, JButton near, JButton prev) {
        if (next.getText().equals(" ")) {
            next.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + count++);
        }
        if (near.getText().equals(" ")) {
            near.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + count++);
        }
        if (prev.getText().equals(" ")) {
            prev.setText(center.getText());

            center.setText(" ");
            lbMoveCount.setText(" " + count++);
        }
    }

    public void moveFour(JButton center, JButton left, JButton right, JButton top, JButton bot) {
        if (right.getText().equals(" ")) {
            right.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + ++count);
        }
        if (left.getText().equals(" ")) {
            left.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + ++count);
        }
        if (top.getText().equals(" ")) {
            top.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + ++count);
        }
        if (bot.getText().equals(" ")) {
            bot.setText(center.getText());
            center.setText(" ");
            lbMoveCount.setText(" " + ++count);
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

        btn3 = new javax.swing.JButton();
        cbSize = new javax.swing.JComboBox<>();
        btn7 = new javax.swing.JButton();
        lbMoveCount = new javax.swing.JLabel();
        btn11 = new javax.swing.JButton();
        lbTime = new javax.swing.JLabel();
        btn15 = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn14 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn3.setText("3");

        cbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3x3", "4x4" }));
        cbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSizeActionPerformed(evt);
            }
        });

        btn7.setText("7");

        btn11.setText("11");

        btn15.setText("15");

        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        btn4.setText("4");

        btn8.setText("8");

        btn12.setText("12");

        btn16.setText("16");

        jLabel1.setText("Time:");

        btn5.setText("5");

        btn9.setText("9");

        btn13.setText("13");

        btn2.setText("2");

        btn1.setText("1");

        btn6.setText("6");

        btn10.setText("10");

        jLabel2.setText("Move:");

        btn14.setText("14");

        jLabel3.setText("Game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTime)
                                    .addComponent(lbMoveCount)
                                    .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnNewGame)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMoveCount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnNewGame)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSizeActionPerformed
        // TODO add your handling code here:
        //game 4x4
        if (cbSize.getSelectedIndex() == 1) {
            btn4.setVisible(true);
            btn8.setVisible(true);
            btn12.setVisible(true);
            btn13.setVisible(true);
            btn14.setVisible(true);
            btn15.setVisible(true);
            btn16.setVisible(true);

            btn1.setText("1");
            btn2.setText("2");
            btn3.setText("3");
            btn4.setText("4");
            btn5.setText("5");
            btn6.setText("6");
            btn7.setText("7");
            btn8.setText("8");
            btn9.setText("9");
            btn10.setText("10");
            btn11.setText("11");
            btn12.setText("12");
            btn13.setText("13");
            btn14.setText("14");
            btn15.setText("15");
            btn16.setText("16");

        }
//game 3x3
        if (cbSize.getSelectedIndex() == 0) {
            btn4.setVisible(false);
            btn8.setVisible(false);
            btn12.setVisible(false);
            btn13.setVisible(false);
            btn14.setVisible(false);
            btn15.setVisible(false);
            btn16.setVisible(false);

            btn1.setText("1");
            btn2.setText("2");
            btn3.setText("3");

            btn5.setText("4");
            btn6.setText("5");
            btn7.setText("6");

            btn9.setText("7");
            btn10.setText("8");
            btn11.setText("9");

        }
    }//GEN-LAST:event_cbSizeActionPerformed


    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewGameActionPerformed

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
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbMoveCount;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        //bat dau bam new game
        if (e.getSource() == btnNewGame) {
            //game 4x4
            if (cbSize.getSelectedIndex() == 1) {
                lbMoveCount.setText("0");
                randomGame4x4();
                while (!valid4x4()) {
                    randomGame4x4();
                }
                win = false;
                count = 0;
                time = 0;
                if (state == 0) {
                    count();
                    state = 1;
                }
                //game 3x3
            } else if (cbSize.getSelectedIndex() == 0) {
                lbMoveCount.setText("0");
                randomGame3x3();
                while (!valid3x3()) {
                    randomGame3x3();
                }
                win = false;
                count = 0;
                time = 0;
                if (state == 0) {
                    count();
                    state = 1;
                }
            }
        } else {
            //set cac nut di chuyen
            if (e.getSource() == btn1) {
                moveTwo(btn1, btn2, btn5);
            }
            if (e.getSource() == btn2) {
                moveThree(btn2, btn1, btn3, btn6);
            }
            if (e.getSource() == btn3) {
                moveThree(btn3, btn2, btn4, btn7);
            }
            if (e.getSource() == btn4) {
                moveTwo(btn4, btn3, btn8);
            }
            if (e.getSource() == btn5) {
                moveThree(btn5, btn1, btn6, btn9);
            }
            if (e.getSource() == btn6) {
                moveFour(btn6, btn5, btn7, btn2, btn10);
            }
            if (e.getSource() == btn7) {
                moveFour(btn7, btn6, btn8, btn3, btn11);
            }
            if (e.getSource() == btn8) {
                moveThree(btn8, btn4, btn7, btn12);
            }
            if (e.getSource() == btn9) {
                moveThree(btn9, btn5, btn10, btn13);
            }
            if (e.getSource() == btn10) {
                moveFour(btn10, btn9, btn11, btn6, btn14);
            }
            if (e.getSource() == btn11) {
                moveFour(btn11, btn10, btn12, btn7, btn15);
            }
            if (e.getSource() == btn12) {
                moveThree(btn12, btn8, btn11, btn16);
            }
            if (e.getSource() == btn13) {
                moveTwo(btn13, btn9, btn14);
            }
            if (e.getSource() == btn14) {
                moveThree(btn14, btn13, btn10, btn15);
            }
            if (e.getSource() == btn15) {
                moveThree(btn15, btn14, btn11, btn16);
            }
            if (e.getSource() == btn16) {
                moveTwo(btn16, btn12, btn15);
            }
        }
        //win 4x4
        if (btn1.getText().equals("1") && btn2.getText().equals("2") && btn3.getText().equals("3") && btn4.getText().equals("4")
                && btn5.getText().equals("5") && btn6.getText().equals("6") && btn7.getText().equals("7") && btn8.getText().equals("8")
                && btn9.getText().equals("9") && btn10.getText().equals("10") && btn11.getText().equals("11") && btn12.getText().equals("12")
                && btn13.getText().equals("13") && btn14.getText().equals("14") && btn15.getText().equals("15") && btn16.getText().equals(" ")) {
            win = true;
            JOptionPane.showMessageDialog(this, "You won!! with " + count + " move" + " and " + time + " sec");
            state = 0;
        }
        //win3x3
        if (btn1.getText().equals("1") && btn2.getText().equals("2") && btn3.getText().equals("3")
                && btn5.getText().equals("4") && btn6.getText().equals("5") && btn7.getText().equals("6")
                && btn9.getText().equals("7") && btn10.getText().equals("8") && btn11.getText().equals(" ")) {
            win = true;
            JOptionPane.showMessageDialog(this, "You won!! with " + count + " move" + " and " + time + " sec");
            state = 0;
        }
    }
}
