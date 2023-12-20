package com.prodevmanish.todolist.controller;

import com.prodevmanish.todolist.model.TodoItem;
import com.prodevmanish.todolist.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/todo")
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
