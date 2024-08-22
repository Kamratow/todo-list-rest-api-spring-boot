package com.kratowski.todo_list_rest_api_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kratowski.todo_list_rest_api_spring_boot.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
