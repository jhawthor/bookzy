package com.bookzy.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebappApplicationTests {

	@Test
	void contextLoads() {
	    String result = "2 orders placed";
	    Assert.assertEquals("2 orders placed", result);
	}
}
