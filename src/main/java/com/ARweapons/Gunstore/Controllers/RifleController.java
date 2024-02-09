package com.ARweapons.Gunstore.Controllers;

import com.ARweapons.Gunstore.Exceptions.EntityNotFoundException;
import com.ARweapons.Gunstore.Models.Rifle;
import com.ARweapons.Gunstore.Services.RifleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rifle")
public class RifleController {

    @Autowired
    RifleService rifleService;


    @PostMapping("/add")
    public Rifle addRifle(@RequestBody Rifle rifle) {
        return rifleService.addRifle(rifle);
    }

    @GetMapping("/list")
    public List<Rifle> getAllRifle() {
        return rifleService.getAllRifle();
    }

    @GetMapping("/get/{id}")
    public Rifle getOneRifle(@PathVariable String id) {
        return rifleService.getOneRifle(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateRifle(@PathVariable String id, @RequestBody Rifle rifleDetails) {
        try {
            Rifle updatedRifle = rifleService.updateRifle(id, rifleDetails);
            return ResponseEntity.ok(updatedRifle);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}

