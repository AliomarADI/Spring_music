package kz.iitu.spotify.services;

import kz.iitu.spotify.model.Album;
import kz.iitu.spotify.model.Album;

import java.util.List;

public interface AlbumServIn {

    Album create(Album o);
    Album update(Album o);
    void delete(int id);
    List<Album> getAll();
    Album getById(int id);
    List<Album> getByName(String s);

}
