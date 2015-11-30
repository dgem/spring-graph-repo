package com.ft.spikes;

import com.ft.spikes.models.Person;
import com.ft.spikes.repositories.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Neo4jRepositoryApplication.class)
@Import(Neo4jConfiguration.class)
public class Neo4jRepositoryApplicationTests {

    @Autowired
    PersonRepository personRepository;


    @Test
    public void canCreateSomePeople() {
        Person greg = new Person("Greg");
        Person roy = new Person("Roy");
        Person craig = new Person("Craig");

        System.out.println("Before linking up with Neo4j...");
        for (Person person : new Person[]{greg, roy, craig}) {
            System.out.println(person);
        }

        personRepository.save(greg);
        personRepository.save(roy);
        personRepository.save(craig);

        greg = personRepository.findByName(greg.name);

        System.out.println("Lookup each person by name...");
        for (String name : new String[]{greg.name, roy.name, craig.name}) {
            System.out.println(personRepository.findByName(name));
        }
    }


}
