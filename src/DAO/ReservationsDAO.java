/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;
/**
 *
 * @author MSII
 */
public class ReservationsDAO {
    private JDBCgetConnection db;
    public ReservationsDAO(){
        db = new JDBCgetConnection();
    }
    /*
    
        This package is for interaction with database !!

        write logic , method ... interactive with database in here ^^
    
    */
}
