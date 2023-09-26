package com.example.springjpaintro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "tokens")
@Entity
public class TokenEntity {

  @Id
  private int id;

  private String token;

}
