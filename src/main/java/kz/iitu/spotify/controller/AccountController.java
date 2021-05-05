package kz.iitu.spotify.controller;

import kz.iitu.spotify.model.Account;
import kz.iitu.spotify.services.AccountServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServIn accountServIn;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Account create(@RequestBody Account account){
        return accountServIn.create(account);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        accountServIn.delete(id);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Account> getAll(){
        return accountServIn.getAll();
    }
    @RequestMapping(value = "/{id}}",method = RequestMethod.GET)
    public Account getById(@PathVariable int id){
        return accountServIn.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Account update(@RequestBody Account account){
        return accountServIn.update(account);
    }
    @RequestMapping(value = "{user_id}/add_album/{album_id}",method = RequestMethod.PUT)
    public Account addAlbum(@PathVariable int user_id, @PathVariable int album_id){
        return accountServIn.addAlbum(user_id,album_id);
    }
    @RequestMapping(value = "{user_id}/remove_album/{album_id}",method = RequestMethod.PUT)
    public Account deleteAlbum(@PathVariable int user_id, @PathVariable int album_id){
        return accountServIn.deleteAlbum(user_id,album_id);
    }
}
