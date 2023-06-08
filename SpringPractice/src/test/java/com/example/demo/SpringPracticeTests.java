package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

	@Test
	void contextLoads() 
	{
	}

	@Test
	void testUser() 
	{
		User user = new User(1L, "test", "test");
		assert(user.getId() == 1L);
		assert(user.getName().equals("test"));
		assert(user.getPassword().equals("test"));
	}

	@Test
	void testTodoItem() 
	{
		TodoItem todoItem = new TodoItem();
		todoItem.setId(1L);
		todoItem.setTitle("test");
		todoItem.setDescription("test");
		assert(todoItem.getId() == 1L);
		assert(todoItem.getTitle().equals("test"));
		assert(todoItem.getDescription().equals("test"));

	}


	@Test
	ResponseEntity<User> clientStart()
	{

		UserController.get
		return new ResponseEntity<User>();

	}

	@Test
    public void createUserTest() {
        User user = new User();
        user.setName("John Doe");
        user.setPassword("password123");

        when(userService.save(user)).thenReturn(user);

        User result = userController.createUser(user);

        assertEquals(user, result);
    }




	



}
