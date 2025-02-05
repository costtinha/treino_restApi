package com.example.treino_noturno.tags;

import com.example.treino_noturno.movies.Movies;
import com.example.treino_noturno.users.Users;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Tags {
    @EmbeddedId
    private Tags_Key id;

    private String tag;

    @ManyToOne
    @MapsId("user_id")
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private Users user_id;

    @ManyToOne
    @MapsId("movie_id")
    @JsonBackReference
    @JoinColumn(name = "movie_id")
    private Movies movie_id;


    public Tags() {
    }


    public Tags(Tags_Key id, String tag, Users user_id, Movies movie_id) {
        this.id = id;
        this.tag = tag;
        this.user_id = user_id;
        this.movie_id = movie_id;
    }

    public Tags_Key getId() {
        return id;
    }

    public void setId(Tags_Key id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
