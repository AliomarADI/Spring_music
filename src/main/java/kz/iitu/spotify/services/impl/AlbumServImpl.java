package kz.iitu.spotify.services.impl;

import kz.iitu.spotify.model.Album;
import kz.iitu.spotify.model.Music;
import kz.iitu.spotify.repo.AlbumRepo;
import kz.iitu.spotify.repo.MusicRepo;
import kz.iitu.spotify.services.AlbumServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlbumServImpl implements AlbumServIn {

    @Autowired
    private AlbumRepo albumRepo;

    @Autowired
    private MusicRepo musicRepo;


    @Override
    public Album create(Album o) {
        return albumRepo.save(o);
    }

    @Override
    public Album update(Album o) {
        return albumRepo.save(o);
    }

    @Override
    public void delete(int id) {
        albumRepo.delete(getById(id));
    }

    @Override
    public List<Album> getAll() {
        return albumRepo.findAll();
    }

    @Override
    public Album getById(int id) {
        return albumRepo.findById(id).get();
    }

    @Override
    public List<Album> getByName(String name) {
        return albumRepo.getAlbumByName(name);
    }

    @Override
    public Album addMusic(int album_id, int music_id) {
        Album album = albumRepo.getById(album_id);
        Music music = musicRepo.getById(music_id);

        album.addMusic(music);

        return albumRepo.save(album);
    }

    @Override
    public Album deleteMusic(int album_id, int music_id) {
        Album album = albumRepo.getById(album_id);
        Music music = musicRepo.getById(music_id);

        album.removeMusic(music);

        return albumRepo.save(album);
    }
}
