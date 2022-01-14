package com.winkeyes.neo4jex.repos;

import com.winkeyes.neo4jex.entities.Movie;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepo extends Neo4jRepository<Movie,Long> {
    
}
