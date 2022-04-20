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
public class Reservation {
    private int reservationNumber ,customerId ,roomNumber , numberOfGuests ;
    private String checkInDate , checkOutDate ,reservationDate ;
    
    public Reservation(int reservationNumber , int customerId , int roomNumber , int numberOfGuests ,
            String checkInDate,String checkOutDate,String reservationDate){
        this.reservationNumber = reservationNumber;
        this.customerId = customerId;
        this.roomNumber = roomNumber;
        this.numberOfGuests = numberOfGuests;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationDate = reservationDate;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    
    
}
