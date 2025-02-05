package com.example.treino_noturno.movies;

import com.example.treino_noturno.ratings.Ratings;
import com.example.treino_noturno.tags.Tags;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Movies {
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private String text;

    @OneToMany(mappedBy = "movie_id")
    @JsonManagedReference
    private List<Ratings> ratings;

    @OneToMany(mappedBy = "movie_id")
    @JsonManagedReference
    private List<Tags> tags;


    public Movies() {
    }

    public Movies(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Ratings> getRatings() {
        return ratings;
    }

    public void setRatings(List<Ratings> ratings) {
        this.ratings = ratings;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }
}
