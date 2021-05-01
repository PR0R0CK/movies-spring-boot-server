package pl.edu.pwsztar.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class MovieDto implements Serializable {
    private Long movieId;
    private String title;
    private String image;
    private Integer year;
}
