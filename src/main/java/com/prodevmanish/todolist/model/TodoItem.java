package com.prodevmanish.todolist.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import javax.validation.constraints.NotBlank;

@Entity
public class TodoItem {

    private long Id;
    @NotBlank
    private String title;
    private boolean done;

    public TodoItem(long id, String title, boolean done) {
        Id = id;
        this.title = title;
        this.done = done;
    }

    public TodoItem() {
    }
    @Id
    @GeneratedValue
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}