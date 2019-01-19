package pl.sda.lambda;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    private String tytul;
    private String director;
    private LocalDate localDate;
    private double price;
    private List<String> actorList;

    public Movie(String tytul, String director, LocalDate localDate, double price, List<String> actorList) {
        this.tytul = tytul;
        this.director = director;
        this.localDate = localDate;
        this.price = price;
        this.actorList = actorList;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public void setActorList(List<String> actorList) {
        this.actorList = actorList;
    }
}
