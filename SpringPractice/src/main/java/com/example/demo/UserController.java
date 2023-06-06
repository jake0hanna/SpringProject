package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController 
{

    private final UserService userService;

    public UserController(UserService userService) 
    {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) 
    {
        try 
        {
            return userService.save(user);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return user;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) 
    {
        try 
        {
            userService.deleteById(userId);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return ResponseEntity.ok().build();
    }
}