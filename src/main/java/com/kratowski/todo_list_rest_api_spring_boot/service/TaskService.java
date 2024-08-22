package com.kratowski.todo_list_rest_api_spring_boot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kratowski.todo_list_rest_api_spring_boot.model.Task;
import com.kratowski.todo_list_rest_api_spring_boot.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
