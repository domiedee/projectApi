package main.dao;
import main.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.repo.MoviesRepo;

import java.util.List;

@Service
public class MoviesDao {
    @Autowired
    MoviesRepo moviesrepo;

    /*to save a movie*/

    public Movies save(Movies emp) {
        return moviesrepo.save(emp);
    }

    /* search all movies*/

    public List<Movies> findAll(){
        return moviesrepo.findAll();
    }


    /*get an movie by id*/
    public Movies findOne(Long empid) {
        return moviesrepo.findOne(empid);
    }


    /*delete a*/

    public void delete(Movies emp) {
        moviesrepo.delete(emp);
    }
}
