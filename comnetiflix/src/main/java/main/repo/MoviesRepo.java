package main.repo;

import main.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepo extends JpaRepository<Movies, Long> {

}
