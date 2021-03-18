package kz.iitu.spotify.services;

import kz.iitu.spotify.model.Music;

import java.util.List;

public interface MusicServIn {

    public void createMusic(Music music);
    void deleteMusic(Music music);
    List<Music> findAllByNameAndAuthor(String name, String author);
    public List<Music> getAll();
    public List<Music> getByDistinctGenre(String genre);
    void deleteAllByNameAndAuthor(String name,String author);

    List<Music> getByName(String name);

    Music getByNameAndAndAuthor(String name,String author);
}
