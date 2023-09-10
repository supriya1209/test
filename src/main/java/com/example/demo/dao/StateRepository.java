package com.example.demo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends CrudRepository<State, Integer> {

    State findByName(String name);

/*    State findByCity(String name);*/
}
