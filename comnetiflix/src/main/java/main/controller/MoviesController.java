package main.controller;
import java.util.List;

import javax.validation.Valid;

import main.dao.MoviesDao;
import main.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comp")
public class MoviesController {
    @Autowired
    MoviesDao moviesdao;
    /* to save */
    @PostMapping("/movies")
    public Movies createMovies(@Valid @RequestBody Movies emp) {
        return moviesdao.save(emp);
    }

    /*get all movies*/
    @GetMapping("/movies")
    public List<Movies> getAllMovies(){
        return moviesdao.findAll();
    }

    /*get movie */
    @GetMapping("/movies/{id}")
    public ResponseEntity<Movies> getMoviesById(@PathVariable(value="id") Long empid){

        Movies emp=moviesdao.findOne(empid);

        if(emp==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(emp);

    }


    /*update an */
    @PutMapping("/movies/{id}")
    public ResponseEntity<Movies> updateMovies(@PathVariable(value="id") Long empid,@Valid @RequestBody Movies empDetails){

        Movies emp=moviesdao.findOne(empid);
        if(emp==null) {
            return ResponseEntity.notFound().build();
        }

        emp.setName(empDetails.getName());
        emp.setCategory(empDetails.getCategory());
        emp.setLength(empDetails.getLength());

        Movies updateMovies=moviesdao.save(emp);
        return ResponseEntity.ok().body(updateMovies);



    }

    /*Delete */
    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Movies> deleteMovies(@PathVariable(value="id") Long empid){

        Movies emp=moviesdao.findOne(empid);
        if(emp==null) {
            return ResponseEntity.notFound().build();
        }
        moviesdao.delete(emp);

        return ResponseEntity.ok().build();


    }
}
