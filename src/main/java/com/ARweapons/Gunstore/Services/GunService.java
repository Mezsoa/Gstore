package com.ARweapons.Gunstore.Services;

import com.ARweapons.Gunstore.Models.Gun;
import com.ARweapons.Gunstore.Repositorys.GunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GunService {

    @Autowired
    GunRepository gunRepository;



    public Gun addGun(Gun gun) {
        return gunRepository.save(gun);
    }

    public List<Gun> getAllGun() {
        return gunRepository.findAll();
    }

    public Gun getOneGun(String id) {
        return gunRepository.findById(id).get();
    }

    public Gun updateGun(Gun gun) {
        return gunRepository.save(gun);
    }

    public String deleteOneGun(String id) {
        gunRepository.deleteById(id);
        return "Gun deleted successfully";
    }








}
