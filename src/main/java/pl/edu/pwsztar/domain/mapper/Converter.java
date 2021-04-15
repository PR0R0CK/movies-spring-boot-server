package pl.edu.pwsztar.domain.mapper;

public interface Converter<T, F> {
    T convert(F from);
}
