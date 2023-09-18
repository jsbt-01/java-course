package com.example.springjpaintro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "users")
@Entity
public class UserEntity {

  @Id
  private int id;

  private String username;

  private String password;

}
