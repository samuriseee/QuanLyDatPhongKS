/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author MSII
 */
public class ListReservation {
    private ArrayList<Reservation> arrReservation = new ArrayList<Reservation>() ;

    public ListReservation(ArrayList<Reservation> listReser) {
        arrReservation = listReser;
    }

    public ArrayList<Reservation> getArrReservation() {
        return arrReservation;
    }
    
}
