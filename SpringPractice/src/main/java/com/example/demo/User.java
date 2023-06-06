package com.example.demo;

import org.springframework.data.annotation.Id;

@Entity
public class User 
{

    @Id
    private Long id;

    private String name;

    private String password;


    public User(Long id2, String name2, String password2) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    
}
