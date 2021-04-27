package kz.iitu.spotify.repo;

import kz.iitu.spotify.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepo extends JpaRepository<Music,Integer> {


    List<Music> findDistinctByGenre(String genre);

    List<Music> findAllByNameAndAuthor(String name, String author);

    List<Music> getByName(String name);

    List<Music>  getByNameAndAuthor(String name,String author);
}
