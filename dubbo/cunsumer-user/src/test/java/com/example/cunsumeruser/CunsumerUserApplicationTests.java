package com.example.cunsumeruser;

import com.example.cunsumeruser.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CunsumerUserApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void hello(){
		userService.hello();
	}

}
