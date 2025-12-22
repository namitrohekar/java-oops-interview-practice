package oops1;

import java.util.ArrayList;

public class Movie {

    private String name;
    private String genre;
    private double rating; // 0–10

    public Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = (rating >= 0 && rating <= 10) ? rating : 0;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{name='" + name +
                "', genre='" + genre +
                "', rating=" + rating + '}';
    }

    public static void main(String[] args) {

        Movie m1 = new Movie("Dead Poets Society", "Drama", 9.9);
        Movie m2 = new Movie("Dhurandhar", "Fiction", 9.0);
        Movie m3 = new Movie("Saiyara", "Drama", 6.0);
        Movie m4 = new Movie("Laal Singh Chaddha", "Drama", 7.9);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);

        for (Movie m : movies) {
            if (m.getRating() > 8) {
                System.out.println(m);
            }
        }
    }
}
