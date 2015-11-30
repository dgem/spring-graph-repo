package com.ft.spikes;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.ft.spikes"})
@EnableNeo4jRepositories(basePackages = "com.ft.spikes")
public class Neo4jConfiguration extends org.springframework.data.neo4j.config.Neo4jConfiguration {
    public static final String URL = System.getenv("NEO4J_URL") != null ? System.getenv("NEO4J_URL") : "http://neo4j:badch1mp@localhost:7474";

    @Override
    public Neo4jServer neo4jServer() {
        return new RemoteServer(URL);
    }

    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.ft.spikes");
    }
}
