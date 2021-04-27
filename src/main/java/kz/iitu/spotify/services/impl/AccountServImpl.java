package kz.iitu.spotify.services.impl;

import kz.iitu.spotify.model.Account;
import kz.iitu.spotify.repo.AccountRepo;
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
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return accountRepo.getByUsername(s);
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
}
