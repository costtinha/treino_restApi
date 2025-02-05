package com.example.treino_noturno.tags;

import java.io.Serializable;
import java.util.Objects;

public class Tags_Key implements Serializable {
    private int user_id;
    private int movie_id;

    public Tags_Key() {
    }

    public Tags_Key(int user_id, int movie_id) {
        this.user_id = user_id;
        this.movie_id = movie_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Tags_Key obj = (Tags_Key) o;
        return Objects.equals(this.user_id, obj.user_id) &&
                Objects.equals(this.movie_id,obj.movie_id);
    }

    @Override
    public int hashCode(){return Objects.hash(user_id,movie_id);}
}
