package demo.example.neo4j.relationship;

import demo.example.neo4j.node.Person;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "LIKE")
public class Like {
    @GraphId
    private Long relationshipId;

    @StartNode
    Person personA;

    @EndNode
    Person personB;

    public Like() {}

    public Like(Person personA, Person personB) {
        this.personA = personA;
        this.personB = personB;
    }
}
