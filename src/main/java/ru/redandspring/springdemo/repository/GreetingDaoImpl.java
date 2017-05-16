package ru.redandspring.springdemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ru.redandspring.springdemo.model.Greeting;

@Repository
@Transactional(readOnly = true)
public class GreetingDaoImpl implements GreetingDao
{
    private static final Logger logger = LoggerFactory.getLogger(GreetingDaoImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Greeting> getAll()
    {
        return em.createNamedQuery(Greeting.ALL_SORTED, Greeting.class).getResultList();
    }

    @Override
    @Transactional
    public Greeting save(Greeting g)
    {
        if (g.isNew()) {
            em.persist(g);
            return g;
        } else {
            return em.merge(g);
        }
    }
}
