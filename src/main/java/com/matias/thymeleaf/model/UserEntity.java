package com.matias.thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USER_ENTITY")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String email;
  
}
