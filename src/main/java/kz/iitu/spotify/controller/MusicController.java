package kz.iitu.spotify.controller;

import kz.iitu.spotify.model.Music;
import kz.iitu.spotify.services.MusicServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private MusicServIn musicServIn;


    public List<Music> getDistinctByGenre(String genre){
        return musicServIn.getByDistinctGenre(genre);
    }
}

