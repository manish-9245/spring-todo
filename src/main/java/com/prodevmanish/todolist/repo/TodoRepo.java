package com.prodevmanish.todolist.repo;

import com.prodevmanish.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository <TodoItem,Long> {
}
