package com.example.springjpaintro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("fourwheeler")
@Slf4j
public class FourWheelerVehicle implements VehicleService {
    @Override
    public void startEngine() {
        log.info("Four wheelr engine started");
    }
}
