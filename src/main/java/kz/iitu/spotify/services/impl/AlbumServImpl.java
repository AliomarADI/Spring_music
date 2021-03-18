package kz.iitu.spotify.services.impl;

import kz.iitu.spotify.model.Album;
import kz.iitu.spotify.repo.AlbumRepo;
import kz.iitu.spotify.services.AlbumServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlbumServImpl implements AlbumServIn {

    @Autowired
    AlbumRepo albumRepo;

    @Override
    public void createAlbum(Album album) {
        albumRepo.save(album);
    }

    @Override
    public List<Album> getAllAlbums() {
        return albumRepo.findAll();
    }

    @Override
    public List<Album> getByName(String name) {
        return albumRepo.getAlbumByName(name);
    }
}
