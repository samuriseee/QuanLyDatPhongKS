/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.*;
import Model.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author MSII
 */
public class UserService {

    private UserDAO userDao;
    private RoomsDAO roomsDAO;

    public UserService() {
        userDao = new UserDAO();
        roomsDAO = new RoomsDAO();
    }
    public void addUser(String firstName , String lastName , String phoneNumber , String email , String passWord){
        userDao.addUser( firstName ,  lastName ,  phoneNumber ,  email ,  passWord);
    }
    public void deleteUser(int id ){
        userDao.deleteUser(id);
    }
    /*
        write the logic you want to do with the data returned from the server ^^
     */
    public User getUser(String email) throws SQLException {
        return userDao.getUser(email);
    }

    public User getUserById(int idUser) throws SQLException{
        return userDao.getUserById(idUser);
    }
    
    public void register(String idRole, String FirstName, String lastName, String PhoneNumber, String email, String passwordd) throws SQLException {
        userDao.register(idRole, FirstName, lastName, PhoneNumber, email, passwordd);
    }

    public ArrayList<Room> getRoomByCategory(String category) throws SQLException {
        ArrayList<Room> rooms_thanhHung155;
        rooms_thanhHung155 = roomsDAO.getAllRoom();
        if (category.equals("All")) {
            return rooms_thanhHung155;
        }
        if (category.equals("Avainable")) {
            rooms_thanhHung155.removeIf(item -> !item.isAvainable());
            return rooms_thanhHung155 ;
        }
        if (category.equals("UnAvainable")) {
            rooms_thanhHung155.removeIf(item -> item.isAvainable());
            return rooms_thanhHung155 ;
        }
        return null;
    }
    
    public void bookingRom(int customerId, int roomNumber, String checkInDate, int numberOfGuests, String reservationDate) throws SQLException {
        userDao.bookingRom(customerId, roomNumber, checkInDate, numberOfGuests, reservationDate);
    }
    public ArrayList<User> getAllUser() throws SQLException{
        return userDao.getAllUser();
    }
}
