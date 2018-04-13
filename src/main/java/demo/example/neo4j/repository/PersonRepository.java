package demo.example.neo4j.repository;

import demo.example.neo4j.node.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person>{
}
