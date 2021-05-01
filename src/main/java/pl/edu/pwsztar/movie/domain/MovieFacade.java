package pl.edu.pwsztar.movie.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.pwsztar.movie.dto.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

@Transactional
public class MovieFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieFacade.class);

    private final MovieRepository movieRepository;
    private final MovieCreator movieCreator;

    @Autowired
    public MovieFacade(MovieRepository movieRepository,
                       MovieCreator movieCreator) {

        this.movieRepository = movieRepository;
        this.movieCreator = movieCreator;
    }

    public List<MovieDto> findAll() {
        return movieRepository
                .findAll()
                .stream()
                .map(Movie::movieDto)
                .collect(Collectors.toList());
    }

    public void creatMovie(CreateMovieDto createMovieDto) {
        requireNonNull(createMovieDto);

        Movie movie = movieCreator.fromCreateMovieDto(createMovieDto);
        movieRepository.save(movie);
    }

    public void deleteMovie(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public DetailsMovieDto findMovie(Long movieId) {
        requireNonNull(movieId);
        Movie movie = movieRepository.findOneByMovieId(movieId);

        if (movie == null) {
            return DetailsMovieDto.builder().build();
        }
        return movie.detailsMovieDto();
    }

    public MovieCounterDto countMovies() {
        return new MovieCounterDto(movieRepository.count());
    }

    public void updateMovie(Long movieId, UpdateMovieDto updateMovieDto) {
        requireNonNull(movieId);
        requireNonNull(updateMovieDto);

        Movie movie = movieRepository.findOneByMovieId(movieId);
        movieRepository.save(movie.toBuilder()
                .title(updateMovieDto.getTitle())
                .image(updateMovieDto.getImage())
                .year(updateMovieDto.getYear())
                .videoId(updateMovieDto.getVideoId())
                .build());
    }
}
