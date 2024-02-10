package com.ARweapons.Gunstore.Models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class Account {

    @Id
    private String id;
 //   @NotBlank(message = "Field cannnot be empty")
    private String username;
//    @NotBlank(message = "Field cannot be empty")
    private String password;
    @NotBlank(message = "Field cannot be empty")
    private String email;
//    @NotNull(message = "Field cannot be blank")
    private String dateOfBirth;
    private String gender;
    private String firstname;
    private String lastname;
    private String[] criminalCharges;
    private String[] typeOfWeaponLicense;

    public Account() {
    }


    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String[] getCriminalCharges() {
        return criminalCharges;
    }

    public String[] getTypeOfWeaponLicense() {
        return typeOfWeaponLicense;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
