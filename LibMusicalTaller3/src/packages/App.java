package packages;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase App(main) permite construir canciones y listas de estas ingresando todos sus atributos  llamando
 * los metodos para  aplicar la funcionalidad, tiene las opciones de filtrado por genero y año, ordenamiento de la lista principal ascendente y descendente.
 *
 * @author Daniel Romero Cortes.
**/

public class App {

    public static void main(String[] args) {
        Library tracks = new Library(new ArrayList<>()) {
        };
        ArrayList<Playlist> playlists = new ArrayList<>();

        Song s1 = new Song(001, "Solo tu", "2019", 3.22f, "Pop", "Caratula.jpg",
                "escrita y producida por german lozano en colaboracion con Diana del Mar");
        tracks.addSong(s1);

        Song s2 = new Song(002, "Ella", "2008", 2.33f, "Balada", "Caratula.jpg",
                "escrita y producida por Antonio Contreras y varios asrtistas invitados");
        tracks.addSong(s2);

        Song s3 = new Song(003, "La cruz de Santiago", "2007", 5.43f, "Metal", "Caratula.jpg",
                "Cancion escrita por el grupo español Mago de Oz");
        tracks.addSong(s3);

        Song s4 = new Song(004, "Adios", "2022", 1.59f, "Pop", "Caratula.jpg",
                "Antonio Cipriany y Vyky autores de la cancion");
        tracks.addSong(s4);

        Song s5 = new Song(005, "Soledad", "1995", 4.53f, "Balada", "Caratula.jpg",
                "Maria Jimena Lozano creador musical y compositora");
        tracks.addSong(s5);

        Song s6 = new Song(006, "Hijo de la luna", "2009", 5.43f, "Metal", "Caratula.jpg",
                "version producida por el grupo zaratoga cambiando su genero original");
        tracks.addSong(s6);

        Scanner s = new Scanner(System.in);
        int menu1 = 0;
        try {
            do {

                System.out.println("\n Reproductor Musical");
                System.out.println("""

                        Seleccione alguna de las siguientes opciones:

                        1. Listar todas las canciones.\n
                        2. Crear Playlist.\n
                        3. Aplicar filtros a la busqueda.\n
                        4. Modificar Orden a lista de Canciones.\n
                        5. Salir del Reproductor:""");

                menu1 = Integer.parseInt(s.nextLine());
                switch (menu1) {
                    case 1:
                        System.out.println(tracks);
                        break;

                    case 2:
                        System.out.println("Por favor indique un nombre para su Playlist");
                        String name = s.nextLine();
                        Playlist pl = new Playlist(name, new ArrayList<>());
                        playlists.add(pl);
                        int menu2 = 0;
                        do {
                            System.out.println("Opciones de la playlist " + name
                                    + "\n1. Agregar canciones.\n2. Mostrar canciones."
                                    + "\n3. Regresar al menú principal");

                            menu2 = Integer.parseInt(s.nextLine());
                            switch (menu2) {
                                case 1: {

                                    System.out.println(
                                            "Por favor indique el identificador de la canción que desea agregar:");
                                    int song = Integer.parseInt(s.nextLine());
                                    pl.addSong(tracks.getSong(song));
                                }

                                case 2: {
                                    System.out.println(pl);
                                }
                                    break;
                            }
                        } while (menu2 != 3);
                        

                }
            } while (menu1 != 5);
        } catch (NumberFormatException e) {
            System.out.println("Error: Verificar el dato ingresado");
        }
    }
}