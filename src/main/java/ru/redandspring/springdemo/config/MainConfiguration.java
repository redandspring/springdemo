package ru.redandspring.springdemo.config;

import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

import ru.redandspring.springdemo.repository.GreetingDao;
import ru.redandspring.springdemo.repository.GreetingDaoImpl;

/**
 * @author Alexander Tretyakov
 */
@Configuration
@ComponentScan(basePackages = {
        "ru.redandspring.**.service",
        "ru.redandspring.**.repository"
})
@ImportResource("classpath:spring-config.xml")
@Import(H2DataSource.class)
public class MainConfiguration
{

    @Bean
    PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }

    /* @Bean GreetingDao greetingDao() {
        return  new GreetingDaoImpl();
    }*/

}
