package kz.iitu.spotify.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "albums")
@Data
@NoArgsConstructor
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Music> musics;

    @JsonIgnore
    @ManyToMany(mappedBy = "albums")
    private List<Account> accounts;

    public void addMusic(Music music){
        musics.add(music);
    }

    public void removeMusic(Music music){
        musics.remove(music);
    }




}
