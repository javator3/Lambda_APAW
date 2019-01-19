package pl.sda.lambda;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       AddInterface add = (a, b) -> a + b;
        System.out.println(add.calc(4, 2));

//       AddInterface add1 = new AddInterface(){
//
//           public int calc (int a, int b){
//               return a+b;
//           }
//       };


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7); // tworzenie listy integerów

        for (Integer integer: numbers){
            System.out.println(numbers);
        }

        Consumer<Integer> integerConsumer = n -> System.out.println(n); // to tak samo się iterujemy jak powyżej w pętli for
        numbers.forEach(integerConsumer);

        numbers.forEach(System.out::println); // kolejna metoda tego samego

        List<Movie> movies = Arrays.asList(
                new Movie("Tytuł", "Andy", LocalDate.of(1987,12,22),12.01, Arrays.asList("Marek", "Andrzej")),
                new Movie("Tytuł2", "Marty", LocalDate.of(2002,03,20),43.01, Arrays.asList("Tadek", "Benek"))
        );

        List<String> titles = movies
                .stream()
                .map(f -> f.getTytul())
                .collect(Collectors.toList()); // iteruję się po tytułach

        System.out.println(titles);



        List<String> directors = movies
                .stream()
                .map(d -> d.getDirector())
                .collect(Collectors.toList());


        System.out.println(directors);

        // lista filmów których cena jest powyżej 40

      List<Movie> movieList=  movies.stream()
                .filter(f -> f.getPrice()>40)
                .collect(Collectors.toList());

        System.out.println(movieList);


    }
}
