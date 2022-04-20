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
public class Customer {
    private int CustomerId ;
    private String FirstName ,lastName ,phoneNumber , email , password ;
    
    public Customer(int CustomerId , String FirstName ,String lastName , String phoneNumber , String email ,String password){
        this.CustomerId = CustomerId;
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public int getCustomerId() {
        return CustomerId;
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
}
