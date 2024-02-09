package com.ARweapons.Gunstore.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gun")
public class Gun {

    @Id
    private String id;
    private String serialNumber;
    private String weaponType;
    private String model;
    private String calibre;
    private String fireMode;



    public Gun() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getModel() {
        return model;
    }

    public String getCalibre() {
        return calibre;
    }

    public String getFireMode() {
        return fireMode;
    }

    public String getId() {
        return id;
    }
}
