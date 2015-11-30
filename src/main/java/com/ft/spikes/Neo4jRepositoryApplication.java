package com.ft.spikes;

import org.neo4j.io.fs.FileUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.io.File;

@SpringBootApplication
@Import(Neo4jConfiguration.class)
public class Neo4jRepositoryApplication implements CommandLineRunner {

    public void run(String... args) throws Exception {

    }

    public static void main(String[] args) throws Exception {
        FileUtils.deleteRecursively(new File("accessingdataneo4j.db"));
        SpringApplication.run(Neo4jRepositoryApplication.class, args);
    }
}