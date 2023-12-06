package com.santanajs.todolist.services;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.santanajs.todolist.entities.Todo;
import com.santanajs.todolist.repositories.TodoRepository;

@Service
public class TodoService {

  
  private TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }
  public List<Todo> create(Todo todo){
    
    todoRepository.save(todo);

    return findAll();
  }
  public List<Todo> findAll(){
    Sort sort = Sort.by("priority").descending().and(
      Sort.by("name").ascending()
    );

    return  todoRepository.findAll(sort);
  }
  public List<Todo> update(Todo todo){
    this.todoRepository.save(todo);
    return findAll();
  }
  public List<Todo> delete(UUID id){
    this.todoRepository.deleteById(id);
    return findAll();
    
  }
}
