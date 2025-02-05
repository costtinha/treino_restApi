package com.example.treino_noturno.users;

import com.example.treino_noturno.ratings.Ratings;
import com.example.treino_noturno.tags.Tags;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Users {
    @GeneratedValue
    @Id
    private int id;

    @Column(
            length = 50
    )
    private String first_name;
    @Column(
            length = 50
    )
    private String last_name;
    private String email;

    @OneToMany(mappedBy = "user_id")
    @JsonManagedReference
    private List<Ratings> ratings;

    @OneToMany(mappedBy = "user_id")
    @JsonManagedReference
    private List<Tags> tags;



    public Users() {
    }

    public Users(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
