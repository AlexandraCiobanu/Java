package com.jetbrains;

import java.util.*;

public class Main {

    static List<Song> listOfItems = new ArrayList<> ();
    static List<String> nameOfSongs = new ArrayList<> ();
    static List<Song> historyOfItemsListened = new ArrayList<> ();
    static List<String> namesOfListenedSongs =new ArrayList<> ();
    static  Set<Song> songsListened = new HashSet<> ();
    static Map<String , Integer> playedSongsLogs = new HashMap<> ();
    static List<String> namesOfAllListenedSongs =new ArrayList<> ();


    public static void main( String[] args) {

            show ();

    }
    private static void show(){

        System.out.println ( "List of all songs in the playlist: " );
        for (String songName : printSongs ())
            System.out.println (songName);
        System.out.println ( "------------------------" );

        System.out.println ( "List of songs listened:" );
        for (String songName : printListenedSongs ())
            System.out.println (songName);
        System.out.println ( "------------------------" );

        System.out.println ( "Logs for played songs:" );
        for (Map.Entry<String,Integer> entries : printPlayedSongsLogs ().entrySet ())
            System.out.println ("The song "+ entries.getKey ()+" was repeated "+ entries.getValue () + " times");
    }

    private static List<String> printSongs() {

        //        Add songs to playlist
        listOfItems.add ( new Song ( "Cum era", 3, false ) );
        listOfItems.add ( new Song ( "Intamplator", 4, false ) );
        listOfItems.add ( new Song ( "Ce mai faci, straine?", 3, false ) );
        listOfItems.add ( new Song ( "Karma", 2, false ) );
        listOfItems.add ( new Song ( "Luna alba", 4, false ) );
        listOfItems.add ( new Song ( "Dorul", 5, false ) );

        for (Song item : listOfItems)
            nameOfSongs.add ( item.getName () );
        return nameOfSongs;
    }

    private static List<String> printListenedSongs(){

        listOfItems.get ( 0 ).setWasListened ( true );
        listOfItems.get ( 2 ).setWasListened ( true );
        listOfItems.get ( 3 ).setWasListened ( true );
        listOfItems.get ( 5 ).setWasListened ( true );

        //History of listened songs
        historyOfItemsListened.add ( listOfItems.get ( 0 ) );
        historyOfItemsListened.add ( listOfItems.get ( 3 ) );
        historyOfItemsListened.add ( listOfItems.get ( 2 ) );
        historyOfItemsListened.add ( listOfItems.get ( 3 ) );
        historyOfItemsListened.add ( listOfItems.get ( 5 ) );
        historyOfItemsListened.add ( listOfItems.get ( 5 ) );
        historyOfItemsListened.add ( listOfItems.get ( 0 ));

        for (Song song :historyOfItemsListened)
            songsListened.add (song);
        for (Song setSong : songsListened)
            namesOfListenedSongs.add ( setSong.getName () );

        return namesOfListenedSongs;
    }

    private static Map<String, Integer> printPlayedSongsLogs(){

            for(Song song : historyOfItemsListened)
                namesOfAllListenedSongs.add(song.getName ());

            for (String song : namesOfAllListenedSongs)
            playedSongsLogs.put ( song,Collections.frequency (namesOfAllListenedSongs ,song) );

            return playedSongsLogs;
    }
}


