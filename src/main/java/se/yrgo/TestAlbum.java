package se.yrgo;

public class TestAlbum {
    public static void main(String[] args) {
        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        AdvancedGenreFilter exclude = new ExcludeGenreFilter();
        AdvancedGenreFilter include = new IncludeGenreFilter();

        //Exclude POP
        printAlbums(albums, exclude);
        System.out.println("-----");

        //Only POP
        printAlbums(albums, include);

        //ONLY ROCK
        System.out.println("-----");
        printAlbums(albums, include, Album.Genre.ROCK.toString());

    }

    static void printAlbums(Album[] albums, AdvancedGenreFilter filter) {
        for (Album a : albums) {
            if (filter.permit(a)) {
                System.out.println(a);
            }
        }
    }
    static void printAlbums(Album[] albums, AdvancedGenreFilter filter, String genre) {
        for (Album a : albums) {
            if (filter.permit(a, genre)) {
                System.out.println(a);
            }
        }
    }
}