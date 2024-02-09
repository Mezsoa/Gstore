package com.ARweapons.Gunstore.Services;

import com.ARweapons.Gunstore.Exceptions.EntityNotFoundException;
import com.ARweapons.Gunstore.Models.Rifle;
import com.ARweapons.Gunstore.Repositorys.RifleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RifleService {

    @Autowired
    RifleRepository rifleRepository;

    public Rifle addRifle(Rifle rifle) {
        return rifleRepository.save(rifle);
    }

    public List<Rifle> getAllRifle() {
        return rifleRepository.findAll();
    }

    public Rifle getOneRifle(String id) {
        return rifleRepository.findById(id).get();
    }

    public Rifle updateRifle(String id, Rifle updatedRifle) {
        return rifleRepository.findById(id)
                .map(existingRifle -> {
                    if (updatedRifle.getModel() != null) {
                        existingRifle.setModel(updatedRifle.getModel());
                    }
                    if (updatedRifle.getWeaponType() != null) {
                        existingRifle.setWeaponType(updatedRifle.getWeaponType());
                    }
                    if (updatedRifle.getSerialNumber() != null) {
                        existingRifle.setSerialNumber(updatedRifle.getSerialNumber());
                    }
                    return rifleRepository.save(existingRifle);
                })
                .orElseThrow(() -> new EntityNotFoundException("Rifle with the ID: " + id + " could not be found!"));
    }
}