package pl.edu.pwsztar.domain.dto;

public class MovieCounterDto {

    private final long counter;

    public MovieCounterDto(long counter) {
        this.counter = counter;
    }

    public long getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "MovieCounterDto{" +
                "counter=" + counter +
                '}';
    }
}
