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
//batch com

    public boolean insertStock(ArrayList<StockDto> list) throws SQLException {
        boolean ressult = false;
        try{
            conn = MyConnection.getConnection();
            conn.setAutoCommit(false);
            if(conn!=null){
                String sql ="insert into tblStock(StockID,StockName,Address,DateAvailable,Note) values(?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                for(StockDto dto : list){
                    stm.setInt(1, dto.getStockID());
                    stm.setString(2, dto.getStockName());
                    stm.setString(3, dto.getAddress());
                    stm.setDate(4, dto.getDateAvailable());
                    stm.setString(5, dto.getNote());
                    stm.addBatch();
                }
                int[] e = stm.executeBatch();
                JOptionPane.showMessageDialog(null, e.length + " is affect");
                conn.commit();
                stm.clearBatch();
                ressult = true;
            }
        }catch(Exception ex){
            conn.rollback();
            JOptionPane.showMessageDialog(null, "Have Stock Insert already or duplicate stock, please check data!!");
        }finally{
            closeConnection();
        }
        return ressult;
    }
}
