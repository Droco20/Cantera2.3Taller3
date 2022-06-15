package packages;

import java.util.ArrayList;
import java.util.Collections;
import static packages.Song.durationComparatorAsc;
import static packages.Song.durationComparatorDesc;
import static packages.Song.yearComparatorAsc;
import static packages.Song.yearComparatorDesc;

public abstract class Library {
    public ArrayList<Song> songs;

    /**
     * Metodo Constructor que permite crear una instancia de la clase Library.
     * 
     */
    public Library(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * Metodo de acceso pare el atributo songs.
     * 
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Metodo modificador del atributo songs.
     * 
     */
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * este metodo permite agregar una canción al array.
     *
     */
    public void addSong(Song s) {
        this.songs.add(s);
    }

      /**
     * este metodo permite acceder a una canción del array.
     * 
     */
    public Song getSong(int id) {
        int index = 0;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getId() == id) {
                index = i;
            }
        }
        return this.songs.get(index);
    }



    /**
     * este metodo permite filtrar las canciones por el atributo genre.
     *
     */
    public void Genre(String genre, ArrayList<Song> filterSongs) {
        filterSongs.stream()
                .filter(song -> song.getGenre().equals(genre))
                .forEach(System.out::println);
    }

    /**
     * este metodo permite filtrar las canciones por el atributo year.
     */
    public void Date(String year, ArrayList<Song> filterSongs) {
        filterSongs.stream()
                .filter(song -> song.getYear().equals(year))
                .forEach(System.out::println);
    }

    
  
    /**
     * este metodo permite ordenar las canciones de forma ascendente por el atributo
     * duration por medio del método durationComparatorAsc de la clase Song.
     */
    public void sortDurationAsc() {
        Collections.sort(songs, durationComparatorAsc);
    }

    /**
     * este metodo permite ordenar las canciones de forma descendente por el
     * atributo duration por medio del método durationComparatorDesc de la clase
     * Song.
     */
    public void sortDurationDesc() {
        Collections.sort(songs, durationComparatorDesc);
    }

    /**
     * este metodo permite ordenar las canciones de forma ascendente por el atributo
     * year por medio del método yearComparatorAsc de la clase Song.
     */
    public void sortYearAsc() {
        Collections.sort(songs, yearComparatorAsc);
    }

    /**
     * este metodo permite ordenar las canciones de forma ascendente por el atributo
     * year por medio del metodo yearComparatorDesc de la clase Song.
     */
    public void sortYearDesc() {
        Collections.sort(songs, yearComparatorDesc);
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la canción.
     */
    @Override
    public String toString() {
        return "Coleccion Musical: " + getSongs();
    }

}
