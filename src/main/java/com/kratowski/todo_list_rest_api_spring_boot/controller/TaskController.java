package com.kratowski.todo_list_rest_api_spring_boot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.kratowski.todo_list_rest_api_spring_boot.model.Task;
import com.kratowski.todo_list_rest_api_spring_boot.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("task")
    public @ResponseBody List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("task/{taskId}")
    public @ResponseBody Task getSingleTask(@PathVariable String taskId) {
        return taskService.getSingleTaskById(Integer.parseInt(taskId));
    }

    @DeleteMapping("task/{taskId}")
    public @ResponseBody Task deleteTaskById(@PathVariable String taskId) {
        Task taskToBeRemoved = taskService.getSingleTaskById(Integer.parseInt(taskId));

        taskService.deleteTaskById(Integer.parseInt(taskId));

        return taskToBeRemoved;
    }

    @PostMapping("task")
    public @ResponseBody Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("task/{id}")
    public @ResponseBody Task putMethodName(@PathVariable String id, @RequestBody Task task) {
        if (task.getId() == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Please provide task id");
        }

        return taskService.updateTask(task);
    }
}
