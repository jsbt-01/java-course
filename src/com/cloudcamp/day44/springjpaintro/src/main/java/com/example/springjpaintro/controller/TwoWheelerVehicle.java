package com.example.springjpaintro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("twowheeler")
@Slf4j
public class TwoWheelerVehicle implements VehicleService{
    @Override
    public void startEngine() {
        log.info("Start 2 wheeler vehicle");
    }
}
