package com.example.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemService 
{
    private final TodoItemRepository todoItemRepository;

    public TodoItemService(TodoItemRepository todoItemRepository) 
    {
        this.todoItemRepository = todoItemRepository;
    }

    public List<TodoItem> findAllByUserId(Long userId) 
    {
        return todoItemRepository.findByUserId(userId);
    }

    public TodoItem findByIdAndUserId(Long todoItemId, Long userId) 
    {
        return todoItemRepository.findByIdAndUserId(todoItemId, userId);
                
    }

    public TodoItem save(Long userId, TodoItem todoItem) 
    {
        todoItem.setUserId(userId);
        return todoItemRepository.save(todoItem);

    }

    public TodoItem update(Long userId, Long todoItemId, TodoItem todoItem) 
    {
        TodoItem existingTodoItem = findByIdAndUserId(todoItemId, userId);
    
        existingTodoItem.setTitle(todoItem.getTitle());
        existingTodoItem.setDescription(todoItem.getDescription());
    
        return todoItemRepository.save(existingTodoItem);
    }

    public void deleteByIdAndUserId(Long todoItemId, Long userId) 
    {
        TodoItem existingTodoItem = findByIdAndUserId(todoItemId, userId);
        todoItemRepository.delete(existingTodoItem);
        
    }
}
