package com.example.springjpaintro.controller;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public Person getPerson() {

        Person person =  new Person();
        person.setAge(34);
        person.setFirstName("Sailendra");
        person.setLastName("L");
        person.setGender("M");
        person.setHeight(5);

        return person;
    }

    // What is Builder pattern
    public PersonUpdated getPersonUpdated(){
//        PersonUpdated.PersonUpdatedBuilder builder = PersonUpdated.builder();
//        builder = builder.firstName("Sailendra");
//        builder = builder.lastName("L");
//        builder = builder.age(44);
//        builder = builder.height(7);
//        builder = builder.gender("M");
//        PersonUpdated per = builder.build();


        return PersonUpdated.builder()
                .firstName("Sailendra")
                .lastName("L")
                .age(34)
                .height(6)
                .gender("M")
                .build();
    }
}
