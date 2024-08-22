package com.kratowski.todo_list_rest_api_spring_boot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kratowski.todo_list_rest_api_spring_boot.model.Task;
import com.kratowski.todo_list_rest_api_spring_boot.service.TaskService;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("task")
    public @ResponseBody List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
}
