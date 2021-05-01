package pl.edu.pwsztar.movie.domain;

import pl.edu.pwsztar.movie.dto.CreateMovieDto;
import static java.util.Objects.requireNonNull;

class MovieCreator {

    Movie fromCreateMovieDto(CreateMovieDto createMovieDto) {
        requireNonNull(createMovieDto);
        return Movie.builder()
                .title(createMovieDto.getTitle())
                .image(createMovieDto.getImage())
                .year(createMovieDto.getYear())
                .videoId(createMovieDto.getVideoId())
                .build();
    }
}
