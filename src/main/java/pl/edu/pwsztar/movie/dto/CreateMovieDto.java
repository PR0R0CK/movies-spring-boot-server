package pl.edu.pwsztar.movie.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@ToString
public class CreateMovieDto implements Serializable {
    private String title;
    private String image;
    private Integer year;
    private String videoId;
}
