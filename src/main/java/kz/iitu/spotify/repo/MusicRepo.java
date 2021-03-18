package kz.iitu.spotify.repo;

import kz.iitu.spotify.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepo extends JpaRepository<Music,Integer> {

//    List<Music> findAllByName(String name);

    List<Music> findDistinctByGenre(String genre);

    List<Music> findAllByNameAndAuthor(String name, String author);

    void deleteAllByNameAndAuthor(String name,String author);

    List<Music> getByName(String name);

    Music getByNameAndAndAuthor(String name,String author);
}
