//package kz.iitu.spotify;
//
//import kz.iitu.spotify.config.Config;
//import kz.iitu.spotify.controller.MusicController;
//import kz.iitu.spotify.model.Account;
//import kz.iitu.spotify.model.Music;
//import kz.iitu.spotify.services.MusicServIn;
//import kz.iitu.spotify.services.impl.MusicServImpl;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
////        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
////
////        MusicController musicController = context.getBean("musicController", MusicController.class);
////        MusicServImpl musicServ = context.getBean("musicServImpl", MusicServImpl.class);
////
////        Music music = new Music();
////        music.setName("Bubble");
////        music.setGenre("rap");
////
////        musicServ.createMusic(music);
//
//        Scanner in = new Scanner(System.in);
//
//        Facade facade = new Facade();
//
//        Account account = facade.checkOrCreateNew();
//
//        int pick = 1000;
//
//        while (pick != 0){
//
//            facade.menu();
//
//            pick = in.nextInt();
//
//            switch (pick){
//                case 1:
//                    facade.createAlbum();
//                    break;
//
//                case 2:
//                    facade.createMusic();
//                    break;
//
//                case 3:
//                    //add music to album
//                    break;
//
//                case 4:
//
//                    break;
//
//                case 0:
//                    System.out.println("System.Exit");
//                    return;
//            }
//        }
//    }
//}
