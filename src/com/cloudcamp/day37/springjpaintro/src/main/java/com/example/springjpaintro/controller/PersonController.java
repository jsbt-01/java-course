package com.example.springjpaintro.controller;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.PersonView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public Person getperson(){
        Person person = personService.getPerson();

        log.info("returning person {}",person);

        return person;
    }

    @GetMapping("/updatedperson")
    public PersonUpdated getUpdatedPerson(){
        PersonUpdated personUpdated =  personService.getPersonUpdated();

        log.info("returning person updated {}",personUpdated);

        return personUpdated;
    }



    /**
     * {
     *     "firstName": "Sailendra",
     *     "lastName": "L",
     *     "age": 34,
     *     "height": 5,
     *     "gender": "M"
     * }
     */

}
