package ru.redandspring.springdemo.service;

import java.util.List;

/**
 * @author Alexander Tretyakov
 */
public interface GreetingService
{
    List<String> say();

    void heard(String s);
}
