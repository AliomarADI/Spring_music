package kz.iitu.spotify.repo;

import kz.iitu.spotify.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {

    Account getAccountByUsernameAndPassword(String username, String password);

    Account deleteByUsernameAndPassword(String username, String password);

    Account getById(int id);

    Account getByUsername(String username);
    Account findByUsername(String username);
}
