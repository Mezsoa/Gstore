package com.ARweapons.Gunstore.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rifle")
public class Rifle {

    @Id
    private String id;
    private String serialNumber;
    private String weaponType;
    private String model;
    private String[] aim;
    private String calibre;
    private String fireMode;
    private String[] attachments;

    public Rifle() {
    }

    public String getId() {
        return id;
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

    public String[] getAim() {
        return aim;
    }

    public String getCalibre() {
        return calibre;
    }

    public String getFireMode() {
        return fireMode;
    }

    public String[] getAttachments() {
        return attachments;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
