package com.anderscore.samples.data;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {

    private String name;
    private LocalDate due;
    private boolean done;

    public TodoItem(String name, LocalDate due, boolean done) {
        this.name = name;
        this.due = due;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return done == todoItem.done && Objects.equals(name, todoItem.name) && Objects.equals(due, todoItem.due);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, due, done);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", due=" + due +
                ", done=" + done +
                '}';
    }
}
