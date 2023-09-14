package com.example.springjpaintro.controller;

import lombok.*;

/**
 * lombok
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class PersonUpdated {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private String gender;
}
