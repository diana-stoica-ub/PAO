package compare.comparator;

import compare.comparable.Movie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movie forceAwakens = new Movie("Force Awakens", "SF", 2015, 10);
        Movie starWars = new Movie("Star Wars", "SF",1977, 10);
        Movie empireStrikesBack = new Movie("Empire Strikes Back", "SF",
                1980, 10);
        Movie[] movies = {forceAwakens, starWars, empireStrikesBack};
        System.out.println("Sorted by name: ");
        NameCompare nameCompare = new NameCompare();
        Arrays.sort(movies, nameCompare);
        for (Movie movie: movies) {
            System.out.println(movie.getName() + "-"+ movie.getYear());
        }
    }
}
