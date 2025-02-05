package com.example.treino_noturno.tags;

import com.example.treino_noturno.movies.Movies;
import com.example.treino_noturno.users.Users;
import org.springframework.stereotype.Service;

@Service
public class TagsMapper {
    public TagsDto toTagsDto(Tags tags){
        return new TagsDto(tags.getTag(),tags.getUser_id().getId(),tags.getMovie_id().getId());
    }
    public Tags toTags(TagsDto dto){
        Users users = new Users();
        users.setId(dto.user_id());
        Movies movies = new Movies();
        movies.setId(dto.movie_id());
        Tags_Key key = new Tags_Key();
        key.setMovie_id(dto.movie_id());
        key.setUser_id(dto.user_id());
        return new Tags(key, dto.tag(), users,movies);

    }
}
