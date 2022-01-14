package com.winkeyes.neo4jex.services;

import java.util.List;

import com.winkeyes.neo4jex.entities.Movie;
import com.winkeyes.neo4jex.repos.MovieRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepo repo;

    public List<Movie> getAllMovies(){
        return repo.findAll();
    }
    
}
