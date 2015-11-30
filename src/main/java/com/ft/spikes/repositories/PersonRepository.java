package com.ft.spikes.repositories;

import com.ft.spikes.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {

    Person findByName(String name);

    //Iterable<Person> findByTeammatesName(String name);

}