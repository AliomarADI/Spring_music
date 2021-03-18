package kz.iitu.spotify.model;

import javax.persistence.*;

@Entity
@Table(name = "albumsWithMusics")
public class AlbumMusics {
    //+ repo
    // getByAlbum
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Album album;
    @ManyToOne
    private Music music;
}
