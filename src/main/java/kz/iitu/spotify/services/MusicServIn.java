package kz.iitu.spotify.services;

import kz.iitu.spotify.model.Music;

import java.util.List;

public interface MusicServIn {

    Music createMusic(Music music);

    Music updateMusic(Music music);

    void deleteMusic(Music music);
    List<Music> findAllByNameAndAuthor(String name, String author);
    List<Music> getAll();
    List<Music> getByDistinctGenre(String genre);
    List<Music> getByName(String name);

    Music getById(int id);

    List<Music>  getByNameAndAuthor(String name, String author);
}
