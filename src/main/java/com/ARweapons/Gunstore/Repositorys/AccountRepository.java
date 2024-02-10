package com.ARweapons.Gunstore.Repositorys;

import com.ARweapons.Gunstore.Models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {




}
