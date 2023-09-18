package com.example.springjpaintro.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "customdatabase")
@Data
public class DataBaseDetails {

    private String url;
    private String port;
    private String username;
    private String password;
}
