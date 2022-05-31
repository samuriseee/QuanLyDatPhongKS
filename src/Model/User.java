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
//    public User(){
//        
//    }
    public User(int UserId ,String idRole , String FirstName ,String lastName , String phoneNumber , String email ,String password){
        this.UserId = UserId;
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.idRole = idRole ;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }
    
}
