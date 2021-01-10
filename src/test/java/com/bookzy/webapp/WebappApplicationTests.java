package com.bookzy.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebappApplicationTests {

	@Test
	void contextLoads() {
	    String result = "app loads";
	    Assert.assertEquals("app loads", result);
	}
}
