package kz.iitu.spotify.controller;

import kz.iitu.spotify.model.Album;
import kz.iitu.spotify.services.AlbumServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumServIn albumServIn;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Album create(@RequestBody Album album){
        return albumServIn.create(album);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        albumServIn.delete(id);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Album> getAll(){
        return albumServIn.getAll();
    }
    @RequestMapping(value = "/{id}}",method = RequestMethod.GET)
    public Album getById(@PathVariable int id){
        return albumServIn.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Album update(@RequestBody Album Album){
        return albumServIn.update(Album);
    }
}
