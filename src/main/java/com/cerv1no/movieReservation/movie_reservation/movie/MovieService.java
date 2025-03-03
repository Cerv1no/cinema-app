package com.cerv1no.movieReservation.movie_reservation.movie;

import com.cerv1no.movieReservation.movie_reservation.exception.ResourceNotFoundException;
import com.cerv1no.movieReservation.movie_reservation.genre.GenreRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieService {

    private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie", id));
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie request) {
        return movieRepository.save(request);
    }

    @Transactional
    public Movie updateMovie(Long id, Movie request) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie", id));
        movie.setTitle(request.getTitle());
        movie.setDescription(request.getDescription());
        movie.setImageUrl(request.getImageUrl());

        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        if(!movieRepository.existsById(id))
            throw new ResourceNotFoundException("Movie", id);
        movieRepository.deleteById(id);
    }
}
