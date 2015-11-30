package com.ft.spikes.models;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Person extends Thing {

    public String name;

    public Person(){
        super();
    }
    public Person(String name) {
        this();
        this.name = name;
    }
}