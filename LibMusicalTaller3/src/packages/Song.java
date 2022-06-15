package packages;

import java.util.Comparator;

public class Song {

     private int id;
     private String title;
     private String year;
     private float duration;
     private String genre;
     private String coverPage;
     private String description;

     /** Constructor que permite crear la instancia de la clase Song */

     public Song(int id, String title, String year, float duration, String genre, String coverPage, String description) {
          this.id = id;
          this.title = title;
          this.year = year;
          this.duration = duration;
          this.genre = genre;
          this.coverPage = coverPage;
          this.description = description;
     }

     /** metodos de acceso para el atributo Id */

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     /** metodos de acceso para el atributo Title */

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     /** metodos de acceso para el atributo Year */

     public String getYear() {
          return year;
     }

     public void setYear(String year) {
          this.year = year;
     }

     /** metodos de acceso para el atributo Duration */

     public float getDuration() {
          return duration;
     }

     public void setDuration(float duration) {
          this.duration = duration;
     }

     /** metodos de acceso para el atributo Genre */

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     /** metodos de acceso para el atributo coverpage */

     public String getCoverPage() {
          return coverPage;
     }

     public void setCoverPage(String coverPage) {
          this.coverPage = coverPage;
     }

     /** metodos de acceso para el atributo Description */

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     /**
      * Metodo que compara las canciones por el atributo duration y luego son
      * ordenadas de forma ascendente.
      */
     public static Comparator<Song> durationComparatorAsc = (Song s1, Song s2) -> {
          float duration1 = s1.getDuration();
          float duration2 = s2.getDuration();
          if (duration1 < duration2)
               return -1;
          if (duration1 > duration2)
               return 1;
          return 0;
     };

     /**
      * Metodo que compara las canciones por el atributo duration y luego son
      * ordenadas de forma descendente
      */
     public static Comparator<Song> durationComparatorDesc = (Song s1, Song s2) -> {
          float duration1 = s1.getDuration();
          float duration2 = s2.getDuration();
          if (duration1 > duration2)
               return -1;
          if (duration1 < duration2)
               return 1;
          return 0;
          // return duration2 - duration1;
     };

     /**
      * Metodo que compara las canciones por el atributo year y luego son
      * ordenadas de forma ascendente
      */
     public static Comparator<Song> yearComparatorAsc = (Song s1, Song s2) -> {
          String year1 = s1.getYear();
          String year2 = s2.getYear();
          return year1.compareTo(year2);
     };

     /**
      * Metodo que compara las canciones por el atributo year y luego son
      * ordenadas de forma descendente
      */
     public static Comparator<Song> yearComparatorDesc = (Song s1, Song s2) -> {
          String year1 = s1.getYear();
          String year2 = s2.getYear();
          return year2.compareTo(year1);
     };

     /**
      * Sobreescribe el método toString para mostrar los datos de la canción.
      * 
      * @return
      */
     @Override
     public String toString() {
          return "\n" + id + ". " + title + ". " + year + ". " + duration + ". " + genre;
     }

}