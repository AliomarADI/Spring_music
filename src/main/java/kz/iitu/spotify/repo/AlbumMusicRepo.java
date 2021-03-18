package kz.iitu.spotify.repo;

import kz.iitu.spotify.model.AlbumMusics;
import kz.iitu.spotify.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumMusicRepo extends JpaRepository<AlbumMusics,Integer> {

    List<AlbumMusics> findAll();


//    List<Music> getAlbumMusicsByAlbumAndMusic();


}
