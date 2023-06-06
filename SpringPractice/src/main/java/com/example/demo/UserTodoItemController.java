package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
@RequestMapping("/api/users/{userId}/todo")
public class UserTodoItemController 
{
    private final TodoItemService todoItemService;

    public UserTodoItemController(TodoItemService todoItemService) 
    {
        this.todoItemService = todoItemService;
    }

    @GetMapping
    public List<TodoItem> getUserTodos(@PathVariable Long userId) 
    {
        return todoItemService.findAllByUserId(userId);
    }

    @GetMapping("/{todoItemId}")
    public TodoItem getUserTodo(@PathVariable Long userId, @PathVariable Long todoItemId) 
    {
        return todoItemService.findByIdAndUserId(todoItemId, userId);
    }

    @PostMapping
    public TodoItem createUserTodo(@PathVariable Long userId, @RequestBody TodoItem todoItem) 
    {
        return todoItemService.save(userId, todoItem);
    }

    @PutMapping("/{todoItemId}")
    public TodoItem updateUserTodo(@PathVariable Long userId, @PathVariable Long todoItemId, @RequestBody TodoItem todoItem) 
    {
        return todoItemService.update(userId, todoItemId, todoItem);
    }

    @DeleteMapping("/{todoItemId}")
    public ResponseEntity<Void> deleteUserTodo(@PathVariable Long userId, @PathVariable Long todoItemId) 
    {
        todoItemService.deleteByIdAndUserId(todoItemId, userId);
        return ResponseEntity.ok().build();
    }
}


