package com.example.springjpaintro.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "specialities")
@Entity
public class SpecialityEntity {

  @GeneratedValue(strategy = IDENTITY)
  @Id
  private Integer id;

  private String name;

  private String description;
}
