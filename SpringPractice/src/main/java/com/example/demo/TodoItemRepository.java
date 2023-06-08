package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> 
{

    List<TodoItem> findByUserId(Long userId);

    TodoItem findByIdAndUserId(Long todoItemId, Long userId);

    
}