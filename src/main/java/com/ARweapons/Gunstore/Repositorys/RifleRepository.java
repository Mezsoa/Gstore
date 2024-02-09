package com.ARweapons.Gunstore.Repositorys;

import com.ARweapons.Gunstore.Models.Rifle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RifleRepository extends MongoRepository<Rifle, String> {
}
