package com.ARweapons.Gunstore.Controllers;

import com.ARweapons.Gunstore.Models.Gun;
import com.ARweapons.Gunstore.Services.GunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gun")
public class GunController {


    @Autowired
    GunService gunService;


    @PostMapping("/add")
    public Gun addGun(@RequestBody Gun gun) {
        return gunService.addGun(gun);
    }

    @GetMapping("/list")
    public List<Gun> getAllGun() {
        return gunService.getAllGun();
    }

    @GetMapping("/get/{id}")
    public Gun getOneGun(@PathVariable String id) {
        return gunService.getOneGun(id);
    }

    @PutMapping("/update/{id}")
    public Gun updateGun(@RequestBody Gun gun, @PathVariable("id") String _id) {
        return gunService.updateGun(gun);
    }


}
