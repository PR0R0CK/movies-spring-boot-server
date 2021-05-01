package pl.edu.pwsztar.movie.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@ToString
public class UpdateMovieDto implements Serializable {
    private String title;
    private String image;
    private Integer year;
    private String videoId;
}
