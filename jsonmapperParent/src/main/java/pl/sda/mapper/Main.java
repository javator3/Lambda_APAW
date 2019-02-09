package pl.sda.mapper;

import pl.sda.lambda.Movie;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Movie> movies = Arrays.asList(
                new Movie("Tytul",
                        "Jan",
                        LocalDate.of(2012,02,12),
                        60,
                        Arrays.asList("Jan", "Maciek")),
                new Movie("Tytul2",
                        "Jan",
                        LocalDate.of(2012,02,12),
                        20,
                        Arrays.asList("Michal", "Maciek")),
                new Movie("Tytul3",
                        "Kamil",
                        LocalDate.of(2005, 05,30),
                        33,
                        Arrays.asList("Jan", "Maciek"))
        );
    }
}
