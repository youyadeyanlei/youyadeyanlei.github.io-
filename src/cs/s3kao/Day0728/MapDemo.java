package cs.s3kao.Day0728;


import java.util.ArrayList;
import java.util.List;

public class MapDemo{
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.stream()
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }


}
