/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.ui;

import static chuongnq.ui.ProcessBar.lbProgress;
import static chuongnq.ui.ProcessBar.pb;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class main {

    public static void main(String[] args) {
        try {
            ProcessBar probar = new ProcessBar();
            probar.setVisible(true);
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                pb.setValue(i);
                lbProgress.setText("Operation is " + i + "% complete");
            }
        } catch (Exception ex) {

        }
    }
}
