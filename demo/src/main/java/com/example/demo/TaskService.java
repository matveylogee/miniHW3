package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public Task addTask(String description, String title) {
        Task newTask = new Task(description, title);
        tasks.add(newTask);
        return newTask;
    }
}

