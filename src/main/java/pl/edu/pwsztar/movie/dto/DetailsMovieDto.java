package pl.edu.pwsztar.movie.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder(toBuilder = true)
public class DetailsMovieDto {
    private String title;
    private String videoId;
    private String image;
    private Integer year;
}
