package ru.redandspring.springdemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ru.redandspring.springdemo.model.Greeting;

public interface GreetingDao
{
    List<Greeting> getAll();

    Greeting save(Greeting g);
}
