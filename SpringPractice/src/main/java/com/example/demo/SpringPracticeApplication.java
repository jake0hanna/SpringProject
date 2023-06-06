package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPracticeApplication 
{

	/*  
		REST API Endpoints

        createUser: POST /api/users
        deleteUser: DELETE /api/users/{userId}

        getUserTodos: GET /api/users/{userId}/todo  
        getUserTodo: GET /api/users/{userId}/todo/{todoItemId}
        createUserTodo: POST /api/users/{userId}/todo
        updateUserTodo: PUT /api/users/{userId}/todo/{todoItemId}
        deleteUserTodo: DELETE /api/users/{userId}/todo/{todoItemId}

    */

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringPracticeApplication.class, args);
	}



}
