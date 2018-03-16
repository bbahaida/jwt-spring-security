package com.bahaida.jwtsecurity.web.controllers;

import com.bahaida.jwtsecurity.backend.persistence.domain.Task;
import com.bahaida.jwtsecurity.backend.persistence.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskRestController {
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/tasks")
    public List<Task> taskList(){
        return taskRepository.findAll();
    }

    @PostMapping("/tasks")
    public Task save(@RequestBody Task task){
        return taskRepository.save(task);
    }
}
