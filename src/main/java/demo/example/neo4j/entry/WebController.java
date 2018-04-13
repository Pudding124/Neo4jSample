package demo.example.neo4j.entry;

import demo.example.neo4j.node.Person;
import demo.example.neo4j.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/Load")
    public void buildNodeAndRelationships(){

        // 以下是根據不同的人建立不同的Node
        Person otaku = new Person("宅男", "男", "喜歡宅在家裡面，不喜歡出門");
        Person dreamGirl = new Person("正妹", "女", "喜歡戶外運動，熱衷打扮");
        Person hunk = new Person("帥哥", "男", "喜歡社交，對於出門穿搭非常講究");

        // 建立關係以及儲存節點
        otaku.addCrushOnRelationship(otaku,dreamGirl);
        personRepository.save(otaku);
        dreamGirl.addLikeRelationship(dreamGirl, hunk);
        personRepository.save(dreamGirl);
        hunk.addHateRelationship(hunk, otaku);
        personRepository.save(hunk);

    }
}
