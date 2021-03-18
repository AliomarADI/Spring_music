package kz.iitu.spotify.services;

import kz.iitu.spotify.model.Album;

import java.util.List;

public interface AlbumServIn {

    void createAlbum(Album album);

    List<Album> getAllAlbums();

    List<Album> getByName(String name);


}
