package kz.iitu.spotify;

import kz.iitu.spotify.config.Config;
import kz.iitu.spotify.controller.MusicController;
import kz.iitu.spotify.model.Account;
import kz.iitu.spotify.model.Album;
import kz.iitu.spotify.model.Music;
import kz.iitu.spotify.services.impl.AccountServImpl;
import kz.iitu.spotify.services.impl.AlbumServImpl;
import kz.iitu.spotify.services.impl.MusicServImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Facade {

    static Scanner in = new Scanner(System.in);
    static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    static MusicController musicController = context.getBean("musicController", MusicController.class);
    static MusicServImpl musicServ = context.getBean("musicServImpl", MusicServImpl.class);
    static AlbumServImpl albumServ = context.getBean("albumServImpl", AlbumServImpl.class);
    static AccountServImpl accountServ= context.getBean("accountServImpl",AccountServImpl.class);

    public Account checkOrCreateNew(){
        System.out.println("Please enter unique username: ");
        String username = in.next();
        System.out.println("Please enter password: ");
        String password = in.next();



        if (accountServ.getAccountByUsernameAndPassword(username,password) == null){

            Account account = new Account();
            account.setUsername(username);
            account.setPassword(password);

            System.out.println("Created new account!");
            return accountServ.createAccount(account);
        }else{
            System.out.println("Мы снова рады вас видкть вас...");
            return accountServ.getAccountByUsernameAndPassword(username,password);
        }
    }


    public void createMusic(){
        System.out.println("Please enter name of music:");
        String name = in.next();
        System.out.println("Please enter genre of this music:");
        String genre = in.next();
        System.out.println("Please enter who is author:");
        String author = in.next();

        Music music = new Music();
        music.setName(name);
        music.setGenre(genre);
        music.setAuthor(author);

        musicServ.createMusic(music);
        System.out.println("Music created successfully!");
    }

    public void deleteMusic(){
        System.out.println("Please enter name of music:");
        String name = in.next();
        System.out.println("Please enter author:");
        String author = in.next();

        musicServ.deleteAllByNameAndAuthor(name,author);
    }

    public List<Music> allMusicList(){
        return musicServ.getAll();
    }

    public void createAlbum(){
        System.out.println("Please enter name:");
        String name = in.next();

        Album album = new Album();

        album.setName(name);

        albumServ.createAlbum(album);
    }




    public void menu(){
        System.out.println("1.Create album");
        System.out.println("2.Create music");
        System.out.println("3.Add music to album");
        System.out.println("4.Delete music from album");
        System.out.println("0.System.Exit");

    }
}
