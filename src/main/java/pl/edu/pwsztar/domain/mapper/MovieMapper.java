package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieMapper implements Converter<Movie, CreateMovieDto>{

    @Override
    public Movie convert(CreateMovieDto createMovieDto) {
        return new Movie.Builder()
                .image(createMovieDto.getImage())
                .title(createMovieDto.getTitle())
                .year(createMovieDto.getYear())
                .videoId(createMovieDto.getVideoId())
                .build();
    }
}
