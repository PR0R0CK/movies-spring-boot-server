package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieDetailsMapper implements Converter<DetailsMovieDto,Movie> {

    @Override
    public DetailsMovieDto convert(Movie movie) {
        return new DetailsMovieDto.Builder()
                .image(movie.getImage()).year(movie.getYear())
                .title(movie.getTitle()).videoId(movie.getVideoId())
                .build();
    }
}
