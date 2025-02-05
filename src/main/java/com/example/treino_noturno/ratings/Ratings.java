package com.example.treino_noturno.ratings;

import com.example.treino_noturno.movies.Movies;
import com.example.treino_noturno.users.Users;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
public class Ratings {
    @GeneratedValue
    @Id
    private int id;
    private int rating;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name ="user_id")
    private Users user_id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "movie_id")
    private Movies movie_id;

    public Ratings() {
    }

    public Ratings(int rating, Users user_id, Movies movie_id) {
        this.id = id;
        this.rating = rating;
        this.user_id = user_id;
        this.movie_id = movie_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Movies getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Movies movie_id) {
        this.movie_id = movie_id;
    }


}
