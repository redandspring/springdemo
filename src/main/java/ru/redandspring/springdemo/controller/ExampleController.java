package ru.redandspring.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.redandspring.springdemo.service.GreetingService;

/**
 * @author Alexander Tretyakov
 */
@Controller
@RequestMapping("/")
public class ExampleController
{

    @Autowired
    GreetingService service;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring MVC - Hello World");
        model.addAttribute("preMessage", service.say());
        return "example";

    }
}
