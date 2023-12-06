package com.santanajs.todolist.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santanajs.todolist.entities.Todo;
import com.santanajs.todolist.services.TodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/todos")
public class TodoController {
  private TodoService todoService;
  
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  // GET /api/v1/todos - Get all todos
  @GetMapping
  public List<Todo> getAllTodos() {
    return todoService.findAll();
  }
  // POST /api/v1/todos - Create a new todo
 @PostMapping
  public List<Todo> createTodo(Todo todo) {
    todoService.create(todo);
    return getAllTodos();
  }

  @PutMapping
  public List<Todo> updateTodo(@RequestBody Todo todo) {
    
    todoService.update(todo);
    return getAllTodos();
  }

  @DeleteMapping("{id}")
  public List<Todo> updateTodo(@RequestBody @PathVariable UUID id) {
    
    todoService.delete(id);
    return getAllTodos();
  }
  
}
