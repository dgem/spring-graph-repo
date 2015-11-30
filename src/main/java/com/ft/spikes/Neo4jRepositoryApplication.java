package com.ft.spikes;

import com.ft.spikes.models.Person;
import com.ft.spikes.repositories.PersonRepository;
import org.neo4j.io.fs.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.io.File;

@SpringBootApplication
@Import(Neo4jConfiguration.class)
public class Neo4jRepositoryApplication implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    public void run(String... args) throws Exception {

//        Person greg = new Person("Greg");
//        Person roy = new Person("Roy");
//        Person craig = new Person("Craig");
//
//        System.out.println("Before linking up with Neo4j...");
//        for (Person person : new Person[] { greg, roy, craig }) {
//            System.out.println(person);
//        }
//
//            personRepository.save(greg);
//            personRepository.save(roy);
//            personRepository.save(craig);
//
//            greg = personRepository.findByName(greg.name);
//
//            System.out.println("Lookup each person by name...");
//            for (String name : new String[] { greg.name, roy.name, craig.name }) {
//                System.out.println(personRepository.findByName(name));
//            }
//
////            System.out.println("Looking up who works with Greg...");
////            for (Person person : personRepository.findByTeammatesName("Greg")) {
////                System.out.println(person.name + " works with Greg.");
////            }

    }

    public static void main(String[] args) throws Exception {
        FileUtils.deleteRecursively(new File("accessingdataneo4j.db"));

        SpringApplication.run(Neo4jRepositoryApplication.class, args);
    }
}