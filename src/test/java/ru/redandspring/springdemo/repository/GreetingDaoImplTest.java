package ru.redandspring.springdemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.redandspring.springdemo.config.MainConfiguration;
import ru.redandspring.springdemo.model.Greeting;

@ContextConfiguration(classes = MainConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class GreetingDaoImplTest
{
    @PersistenceContext
    private EntityManager em;

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void getAll() throws Exception
    {
        List<Greeting> greetings = em.createNamedQuery(Greeting.ALL_SORTED, Greeting.class).getResultList();

        Assert.assertNotNull(greetings);
        //Assert.assertEquals("GREEN", greetings.get(0).getName());
    }

}