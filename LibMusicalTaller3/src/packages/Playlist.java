package packages;

import java.util.ArrayList;

public class Playlist extends Library {

     private String namePlist;

     /** Metodo que permite crear una instancia de la clase Playlist. */

     public Playlist(String namePlist, ArrayList<Song> songs) {
          super(songs);
          this.namePlist = namePlist;
     }

     /** Metodos de acceso para el atributo namePlist */

     public String getNamePlist() {
          return namePlist;
     }

     public void setNamePlist(String namePlist) {
          this.namePlist = namePlist;
     }

     /**
      * Sobreescribe el método toString para mostrar los datos de la canción.
      */

     @Override
     public String toString() {
          return "Playlist: " + namePlist + "\n" + getSongs();
     }

}
