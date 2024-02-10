package com.ARweapons.Gunstore.Services;

import com.ARweapons.Gunstore.Exceptions.EntityNotFoundException;
import com.ARweapons.Gunstore.Models.Account;
import com.ARweapons.Gunstore.Repositorys.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    // Creating an Account
    public Account createAccount(Account account) {
        Account findAccount = accountRepository.findById(account.getEmail())
                .orElseThrow(() -> new RuntimeException("couldn't find account."));
        account.setEmail(findAccount.getEmail());
        return accountRepository.save(account);
    }

// Here we are getting all accounts
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // Here we go over to getting ONE account by comparing id
    public Account updateAccount(String id, Account updatedAccount) {
        return accountRepository.findById(id)
                .map(existingAccount -> {
                    if (updatedAccount.getEmail() != null) {
                        existingAccount.setEmail(updatedAccount.getEmail());
                    }
                    return  accountRepository.save(existingAccount);
                })
                .orElseThrow(() -> new EntityNotFoundException("The Account with this id: " + id + "was never found. Please try again later"));
    }

    /*public Account createAccount(Account account) {

        if (account == null ) {
            throw(() -> new EntityNotFoundException())
        }


        return accountRepository.save(account);
    }
*/


}
