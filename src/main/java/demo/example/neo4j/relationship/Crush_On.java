package demo.example.neo4j.relationship;

import demo.example.neo4j.node.Person;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.EndNode;

@RelationshipEntity(type = "CRUSH_ON")
public class Crush_On {
    @GraphId
    private Long relationshipId;

    @StartNode
    Person personA;

    @EndNode
    Person personB;

    public Crush_On() {}

    public Crush_On(Person personA, Person personB) {
        this.personA = personA;
        this.personB = personB;
    }
}
