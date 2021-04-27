package kz.iitu.spotify.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "musics")
@NoArgsConstructor
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String genre; //Rock,Popular,Jazz,HipHop,Pop
    @ManyToMany(mappedBy = "musics")
    List<Album> album;

    public int getId() {
        return id;
    }
}
