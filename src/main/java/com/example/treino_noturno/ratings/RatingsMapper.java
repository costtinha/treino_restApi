package com.example.treino_noturno.ratings;

import com.example.treino_noturno.movies.Movies;
import com.example.treino_noturno.users.Users;
import org.springframework.stereotype.Service;

@Service
public class RatingsMapper {
    public RatingsDto toRatingDto(Ratings ratings){
        return new RatingsDto(ratings.getRating(),
                ratings.getUser_id().getId(),
                ratings.getMovie_id().getId());
    }
    public Ratings toRating(RatingsDto dto){
        Users users = new Users();
        users.setId(dto.user_id());
        Movies movies = new Movies();
        movies.setId(dto.movie_id());
        return new Ratings(dto.rating(),users,movies);
    }
}
