/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.daos;

import chuongnq.db.MyConnection;
import chuongnq.dtos.StockDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class StockDao {

    private Connection conn = null;
    private PreparedStatement stm = null;

    private void closeConnection() {
        try {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception ex) {

        }
    }
//2 try

    public boolean insertStock(ArrayList<StockDto> list) throws SQLException {
        boolean result = false;
        try {
            conn = MyConnection.getConnection();
            if (conn != null) {
                String sql = "Insert into tblStock(StockID,StockName,Address,DateAvailable,Note) values(?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                int count = 0;
                for (StockDto dto : list) {
                    try {
                        stm.setInt(1, dto.getStockID());
                        stm.setString(2, dto.getStockName());
                        stm.setString(3, dto.getAddress());
                        stm.setDate(4, dto.getDateAvailable());
                        stm.setString(5, dto.getNote());
                        count = count + stm.executeUpdate();
                    } catch (SQLException ex) {
                        System.out.println("Error at insertStock try 1 " + ex.getMessage());
                    }
                }
                JOptionPane.showMessageDialog(null, count + " is affect");
                result = true;
            }
        } catch (Exception ex) {
            System.out.println("Error at insertStock try 2 " + ex.getMessage());
        } finally {
            closeConnection();
        }
        return result;
    }
}
