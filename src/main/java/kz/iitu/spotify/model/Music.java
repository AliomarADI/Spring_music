package kz.iitu.spotify.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "musics")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String genre; //Rock,Popular,Jazz,HipHop,Pop


    public Music(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public Music() { }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
