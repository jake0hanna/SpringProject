package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService 
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) 
    {
        this.userRepository = userRepository;
    }

    public User add(User user) 
    {
        return userRepository.save(user);
    }

    public User get(Long id) 
    {
        Optional<User> user = userRepository.findById(id);

        return user.orElse(null);
    }

    public User save(User user) throws Exception 
    {
        Optional<User> existingUser = userRepository.findById(user.getId());

        if (existingUser.isPresent()) 
        {
            return userRepository.save(user);
        } 
        else 
        {
            throw new Exception("User not found with id " + user.getId());
        }
    }

    public void deleteById(Long userId) throws Exception 
    {
        if(userRepository.existsById(userId)) 
        {
            userRepository.deleteById(userId);
        } 
        else 
        {
            throw new Exception("User not found with id " + userId);
        }
    }
}
