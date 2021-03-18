package kz.iitu.spotify.services;

import kz.iitu.spotify.model.Account;

public interface AccountServIn {

    Account getAccountByUsernameAndPassword(String username, String password);

    Account deleteByUsernameAndPassword(String username, String password);

    Account createAccount(Account account);
}
