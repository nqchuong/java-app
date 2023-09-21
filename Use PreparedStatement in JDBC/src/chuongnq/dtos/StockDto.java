/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.dtos;

import java.sql.Date;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class StockDto {
    public int StockID;
    public String StockName;
    public String Address;
    public String Note;
    public Date DateAvailable;

    public StockDto() {
    }

    public StockDto(int StockID, String StockName, String Address, String Note, Date DateAvailable) {
        this.StockID = StockID;
        this.StockName = StockName;
        this.Address = Address;
        this.Note = Note;
        this.DateAvailable = DateAvailable;
    }

    public int getStockID() {
        return StockID;
    }

    public void setStockID(int StockID) {
        this.StockID = StockID;
    }

    public String getStockName() {
        return StockName;
    }

    public void setStockName(String StockName) {
        this.StockName = StockName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public Date getDateAvailable() {
        return DateAvailable;
    }

    public void setDateAvailable(Date DateAvailable) {
        this.DateAvailable = DateAvailable;
    }
    
}
