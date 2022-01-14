package com.winkeyes.neo4jex.entities;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    @Id
	@GeneratedValue
	private Long id;
    private String name;
    
    
}
