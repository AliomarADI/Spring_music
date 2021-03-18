package kz.iitu.spotify.services.impl;

import kz.iitu.spotify.model.Music;
import kz.iitu.spotify.repo.MusicRepo;
import kz.iitu.spotify.services.MusicServIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicServImpl implements MusicServIn {

    @Autowired
    MusicRepo musicRepo;

    @Override
    public void createMusic(Music music) {
        musicRepo.save(music);
    }

    @Override
    public void deleteMusic(Music music) {
        musicRepo.delete(music);
    }

    @Override
    public List<Music> findAllByNameAndAuthor(String name, String author) {
        return musicRepo.findAllByNameAndAuthor(name,author);
    }

    @Override
    public List<Music> getAll() {
        return musicRepo.findAll();
    }

    @Override
    public List<Music> getByDistinctGenre(String genre) {
        return musicRepo.findDistinctByGenre(genre);
    }

    @Override
    public void deleteAllByNameAndAuthor(String name, String author) {
        musicRepo.deleteAllByNameAndAuthor(name,author);
    }

    @Override
    public List<Music> getByName(String name) {
        return musicRepo.getByName(name);
    }

    @Override
    public Music getByNameAndAndAuthor(String name, String author) {
        return musicRepo.getByNameAndAndAuthor(name,author);
    }
}
