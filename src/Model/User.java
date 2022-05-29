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
public class User {
    private int UserId ;
    private String FirstName ,lastName ,phoneNumber , email , password ,idRole ;
    
    public User(int UserId ,String idRole , String FirstName ,String lastName , String phoneNumber , String email ,String password){
        this.UserId = UserId;
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.idRole = idRole ;
    }

    public int getUserId() {
        return UserId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdRole() {
        return idRole;
    }
    
}
