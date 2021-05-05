package kz.iitu.spotify.services.impl;

import kz.iitu.spotify.model.Account;
import kz.iitu.spotify.model.Album;
import kz.iitu.spotify.repo.AccountRepo;
import kz.iitu.spotify.repo.AlbumRepo;
import kz.iitu.spotify.services.AccountServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServImpl implements AccountServIn, UserDetailsService {

    @Autowired
    private AccountRepo accountRepo;
    @Autowired
    private AlbumRepo albumRepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account user = accountRepo.findByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("User: " /*+ user.getUsername()*/ + " not found");
        }
        return user;
    }

    @Override
    public Account create(Account o) {
        o.setPassword(passwordEncoder.encode(o.getPassword()));
        return accountRepo.save(o);
    }

    @Override
    public Account update(Account o) {
        o.setPassword(passwordEncoder.encode(o.getPassword()));
        return accountRepo.save(o);
    }

    @Override
    public void delete(int id) {
        accountRepo.delete(getById(id));
    }

    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }

    @Override
    public Account getById(int id) {
        return accountRepo.getById(id);
    }

    @Override
    public Account getByUsername(String username) {
        return accountRepo.getByUsername(username);
    }

    @Override
    public Account addAlbum(int user_id, int album_id) {
        Account account = accountRepo.getById(user_id);
        Album album = albumRepo.getById(album_id);

        if (account != null &&  album != null){
            account.getAlbums().add(album);
            return accountRepo.save(account);
        }else{
            System.out.println("<------ Account or album is null ------->");
            return null;
        }
    }

    @Override
    public Account deleteAlbum(int user_id, int album_id) {
        Account account = accountRepo.getById(user_id);
        Album album = albumRepo.getById(album_id);

        if (account != null &&  album != null){
            account.getAlbums().remove(album);
            return accountRepo.save(account);
        }else{
            System.out.println("<------ Account or album is null ------->");
            return null;
        }
    }
}
