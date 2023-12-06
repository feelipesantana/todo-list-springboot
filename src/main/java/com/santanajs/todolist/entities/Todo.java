package com.santanajs.todolist.entities;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;
  private String description;
  private boolean priority; 
}
