package com.example.springjpaintro.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DataBaseService {

    @Autowired
    DataBaseDetails dataBaseDetails;

    @Value("${servicesenabled}")
    private Boolean servicesEnabled;
    public DataBaseDetails getDataBaseDetails() {

        if(!servicesEnabled){
            log.warn("Dear user, we are experiencing some problem and not serving any requests today.");
            return null;
        }

        log.info("Services enabled. Hence returning results");

        return dataBaseDetails;
    }


}
