package com.ft.spikes.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by dan.murphy on 25/11/2015.
 */
@NodeEntity
public class Thing {

    @GraphId
    public Long id;
    public String uuid;
}
