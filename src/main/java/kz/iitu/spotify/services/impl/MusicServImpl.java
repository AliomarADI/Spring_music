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
    public Music createMusic(Music music) {
        return musicRepo.save(music);
    }
    @Override
    public Music updateMusic(Music music) {
        return musicRepo.save(music);
    }

    @Override
    public void deleteMusic(int id) {
        musicRepo.deleteById(id);
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
    public List<Music> getByName(String name) {
        return musicRepo.getByName(name);
    }

    @Override
    public Music getById(int id){
        return musicRepo.findById(id).get();
    }
    @Override
    public List<Music> getByNameAndAuthor(String name, String author) {
        return musicRepo.getByNameAndAuthor(name,author);
    }
}
