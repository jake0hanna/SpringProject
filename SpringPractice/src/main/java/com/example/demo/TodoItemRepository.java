package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> 
{

    List<TodoItem> findByUserId(Long userId);

    Object findByIdAndUserId(Long todoItemId, Long userId);

    
}