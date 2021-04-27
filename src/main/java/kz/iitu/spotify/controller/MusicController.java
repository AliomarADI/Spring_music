package kz.iitu.spotify.controller;

import kz.iitu.spotify.model.Music;
import kz.iitu.spotify.services.MusicServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicServIn musicServIn;

    @PostMapping("/create")
    public Music create(@RequestBody Music music){
        return musicServIn.createMusic(music);
    }

    @GetMapping("")
    public List<Music> getAll(){
        return musicServIn.getAll();
    }

    @GetMapping("/{id}")
    public Music getById(@PathVariable int id){
        return musicServIn.getById(id);
    }


}

