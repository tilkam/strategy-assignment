package se.yrgo;

public interface AdvancedGenreFilter extends GenreFilter {
    boolean permit(Album album);
    boolean permit(Album album, String genre);
}
