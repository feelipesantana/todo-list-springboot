package com.santanajs.todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santanajs.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, UUID> {
  
}
