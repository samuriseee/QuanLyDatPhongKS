/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.*;
import Model.User;
import java.sql.SQLException;

/**
 *
 * @author MSII
 */
public class UserService {
    private UserDAO userDao;
    public UserService(){
        userDao = new UserDAO();
    }
    
    /*
        write the logic you want to do with the data returned from the server ^^
    */
    public User getUser(String email) throws SQLException{
        return userDao.getUser(email);
    }
    public void register(String idRole , String FirstName , String lastName ,String PhoneNumber ,String email ,String passwordd) throws SQLException{
        userDao.register(idRole, FirstName, lastName, PhoneNumber, email, passwordd);
    }
}
