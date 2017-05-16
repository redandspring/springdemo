package ru.redandspring.springdemo;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.redandspring.springdemo.config.MainConfiguration;
import ru.redandspring.springdemo.service.GreetingService;

/**
 * @author Alexander Tretyakov
 */
public class Starter
{
    private static final Logger logger = LoggerFactory.getLogger(Starter.class);

    public static void main(String[] args)
    {
        logger.info("Starting configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        logFormat(Arrays.stream(context.getBeanDefinitionNames()).collect(Collectors.joining("\n")));

        GreetingService service = context.getBean(GreetingService.class);
        logFormat(service.say());
    }

    private static void logFormat(String message)
    {
        logger.info("\n----------------------------------------\n"
                + message
                +"\n----------------------------------------\n");
    }
}
