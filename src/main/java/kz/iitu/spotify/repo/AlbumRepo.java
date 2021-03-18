package kz.iitu.spotify.repo;

import kz.iitu.spotify.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepo extends JpaRepository<Album,Integer> {

    @Override
    List<Album> findAll();

    List<Album> getAlbumByName(String name);



}
