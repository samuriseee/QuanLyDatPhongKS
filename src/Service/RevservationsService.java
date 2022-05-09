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
}
