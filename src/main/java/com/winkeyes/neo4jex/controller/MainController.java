package com.winkeyes.neo4jex.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.winkeyes.neo4jex.entities.Movie;
import com.winkeyes.neo4jex.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private MovieService service;

    @GetMapping("/")
    public String getTested() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        return formattedDate;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return service.getAllMovies();
    }

}
