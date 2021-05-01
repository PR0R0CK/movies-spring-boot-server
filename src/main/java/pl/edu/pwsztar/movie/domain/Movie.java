package pl.edu.pwsztar.movie.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.edu.pwsztar.movie.dto.DetailsMovieDto;
import pl.edu.pwsztar.movie.dto.MovieDto;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)

@Entity
@Table(name = "movies")
class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "year")
    private Integer year;

    @Column(name = "video_id")
    private String videoId;

    MovieDto movieDto(){
        return MovieDto.builder()
                .movieId(this.movieId)
                .title(this.title)
                .image(this.image)
                .year(this.year)
                .build();
    }

    DetailsMovieDto detailsMovieDto(){
        return DetailsMovieDto.builder()
                .title(this.title)
                .image(this.image)
                .year(this.year)
                .videoId(this.videoId)
                .build();
    }
}
