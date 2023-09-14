package com.example.springjpaintro.controller;

import com.example.springjpaintro.view.ClinicView;
import com.example.springjpaintro.view.PersonView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonController {


    @Autowired
    private PersonService personService;

    @Qualifier("twowheeler")
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    DataBaseService dataBaseService;

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

    @GetMapping("/start")
    public void startVehicle(){
        vehicleService.startEngine();
    }

    @GetMapping("/database")
    public void getdatabaseDetails(){
        DataBaseDetails dataBaseDetails =  dataBaseService.getDataBaseDetails();
        log.info("database details are {}", dataBaseDetails);
        return;
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


    /**
     *LOMBOK
     *         @NoArgsConstructor
     * @AllArgsConstructor
     * @Getter
     * @Setter
     * @ToString
     * @EqualsAndHashCode
     * @Builder
     *
     *
     * @Qualifier
     *
     * @ConfigurationProperties
     *
     * @value
     *
     */

}
