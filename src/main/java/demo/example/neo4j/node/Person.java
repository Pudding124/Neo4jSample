package demo.example.neo4j.node;

import demo.example.neo4j.relationship.Crush_On;
import demo.example.neo4j.relationship.Hate;
import demo.example.neo4j.relationship.Like;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;

@NodeEntity
public class Person {

    // neo4j節點編號
    @GraphId
    private Long id;

    // 以下皆定義節點的屬性
    private String name;

    private String gender;

    private String description;

    @Relationship(type="CRUSH_ON")
    ArrayList<Crush_On> crush_Ons = new ArrayList<Crush_On>();

    @Relationship(type="HATE")
    ArrayList<Hate> hates = new ArrayList<Hate>();

    @Relationship(type="LIKE")
    ArrayList<Like> likes = new ArrayList<Like>();

    public Person(){}

    public Person(String name, String gender, String description){
        this.name = name;
        this.gender =gender;
        this.description = description;
    }

    public void addCrushOnRelationship(Person personA, Person personB) {
        Crush_On crush_On = new Crush_On(personA, personB);
        crush_Ons.add(crush_On);
    }

    public void addHateRelationship(Person personA, Person personB) {
        Hate hate = new Hate(personA, personB);
        hates.add(hate);
    }

    public void addLikeRelationship(Person personA, Person personB) {
        Like like = new Like(personA, personB);
        likes.add(like);
    }


}
