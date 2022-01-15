package com.winkeyes.neo4jex.entities;

import java.util.List;

import javax.annotation.processing.Generated;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import lombok.Data;
@Data
@RelationshipProperties
public class ActorRelationship {
 
  @Id
  @GeneratedValue
	private Long id;

  @TargetNode
  private  Person actor;

  
  private List<String> roles;

    
}
