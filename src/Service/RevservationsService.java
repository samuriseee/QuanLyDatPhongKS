/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.*;
import Model.Reservation;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MSII
 */
public class RevservationsService {
    private ReservationsDAO reservationsDAO;
    public RevservationsService(){
        reservationsDAO = new ReservationsDAO();
    }
    
    /*
        write the logic you want to do with the data returned from the server ^^
    */
    public ArrayList<Reservation> getReservationById(int idUser) throws SQLException{
        return reservationsDAO.getReservationById(idUser);
    }
    public ArrayList<Reservation> getAllReservation() throws SQLException{
        return reservationsDAO.getAllReservation();
    }
    public void setReservationCheckOutDate(int idReservation_thanhHung155 , String checkOutDate_thanhHung155) throws SQLException{
        reservationsDAO.setReservationCheckOutDate(idReservation_thanhHung155, checkOutDate_thanhHung155);
    }
    public Double getAllRates() throws SQLException {
        return reservationsDAO.getAllRates();
    }
}
