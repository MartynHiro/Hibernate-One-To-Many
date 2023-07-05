package model;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(name = "director_id")
    private int directorId;
    @Column(name = "name")
    private String name;
    @Column(name = "year_of_production")
    private int yearOfProduction;
    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director director;

    public Movie() {
    }

    public Movie(int directorId, String name, int yearOfProduction) {
        this.directorId = directorId;
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", directorId=" + directorId +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", director=" + director +
                '}';
    }
}
