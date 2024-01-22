package se.yrgo;

public class IncludeGenreFilter implements AdvancedGenreFilter {
    @Override
    public boolean permit(Album album) {
        return album.genre().equals(Album.Genre.POP.toString());
    }

    @Override
    public boolean permit(Album album, String genre) {
        return album.genre().equals(genre);
    }
}
