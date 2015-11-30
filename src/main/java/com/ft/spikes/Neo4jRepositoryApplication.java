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

    }

    public static void main(String[] args) throws Exception {
        FileUtils.deleteRecursively(new File("accessingdataneo4j.db"));

        SpringApplication.run(Neo4jRepositoryApplication.class, args);
    }
}