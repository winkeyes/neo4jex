package com.winkeyes.neo4jex.entities;

import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
	@GeneratedValue
	private Long id;
    
    private String title;
    @Relationship(type = "DIRECTED" ,direction=Direction.INCOMING)
    private Set<Person> director;

    @Relationship(type = "ACTED_IN" ,direction=Direction.INCOMING)
    private Set<ActorRelationship> actor;

}
