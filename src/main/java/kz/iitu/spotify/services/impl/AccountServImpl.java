package kz.iitu.spotify.services.impl;

import kz.iitu.spotify.model.Account;
import kz.iitu.spotify.repo.AccountRepo;
import kz.iitu.spotify.services.AccountServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServImpl implements AccountServIn {

    @Autowired
    private AccountRepo accountRepo;

    @Override
    public Account getAccountByUsernameAndPassword(String username, String password) {
        return accountRepo.getAccountByUsernameAndPassword(username,password);
    }

    @Override
    public Account deleteByUsernameAndPassword(String username, String password) {
        return accountRepo.deleteByUsernameAndPassword(username,password);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }


}
