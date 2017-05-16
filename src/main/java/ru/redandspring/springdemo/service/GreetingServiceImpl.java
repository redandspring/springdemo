package ru.redandspring.springdemo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ru.redandspring.springdemo.model.Greeting;
import ru.redandspring.springdemo.repository.GreetingDao;

/**
 * @author Alexander Tretyakov
 */
@Component
public class GreetingServiceImpl implements GreetingService
{
    private static final Logger logger = LoggerFactory.getLogger(GreetingServiceImpl.class);

    @Resource
    public GreetingDao greetingDao;

    @Override
    public List<String> say()
    {
        List<Greeting> greetings = greetingDao.getAll();
        return greetings.stream().map(greeting -> "Hi " + greeting.getName()).collect(Collectors.toList());
    }

    @Override
    public void heard(String s)
    {
        Greeting greeting = new Greeting();
        greeting.setName(s);
        Greeting result = greetingDao.save(greeting);
        logger.info(result.toString());

    }
}
