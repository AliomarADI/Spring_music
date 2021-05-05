package kz.iitu.spotify.services;

import kz.iitu.spotify.model.Account;

import java.util.List;

public interface AccountServIn {

    Account create(Account o);
    Account update(Account o);
    void delete(int id);
    List<Account> getAll();
    Account getById(int id);
    Account getByUsername(String username);
    Account addAlbum(int user_id, int album_id);
    Account deleteAlbum(int user_id, int album_id);
}
