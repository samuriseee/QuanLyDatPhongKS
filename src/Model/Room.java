/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSII
 */
public class Room {
    private int roomNumber , numberOfBed ;
    private String roomType ;
    private double rates;
    private boolean Avainable;
    public Room(int roomNumber , String roomType , double rates , int numberOfBed, boolean Avainable) {
        this.roomNumber = roomNumber ;
        this.roomType = roomType ;
        this.rates = rates;
        this.numberOfBed = numberOfBed ;
        this.Avainable = Avainable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    public boolean isAvainable() {
        return Avainable;
    }

    public void setAvainable(boolean Avainable) {
        this.Avainable = Avainable;
    }


    
}
