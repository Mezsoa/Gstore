package com.ARweapons.Gunstore.Repositorys;

import com.ARweapons.Gunstore.Models.Gun;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GunRepository extends MongoRepository<Gun, String> {


}
