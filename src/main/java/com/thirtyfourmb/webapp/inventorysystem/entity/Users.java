package com.thirtyfourmb.webapp.inventorysystem.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Users {
    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int id;

    @Column(name="user_name")
    private String userName;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="password")
    private int password;

    @Column(name="phone_number")
    private int phoneNumber;

    // define constructors
    public Users() {

    }

    public Users(String userName,int password,String emailAddress,int phoneNumber){
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getphoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // define toString
    @Override
    public String toString() {
        return "Users [id=" + id + ", userName=" + userName + ", emailAddress=" + emailAddress + ", password="
                + password + ", phoneNumber=" + phoneNumber + "]";
    }

    
    
}
