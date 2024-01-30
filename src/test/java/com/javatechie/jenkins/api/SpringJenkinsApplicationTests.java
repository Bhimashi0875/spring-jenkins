package com.javatechie.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	contextLoads() {
		LOGGER.info("Test case excuting...");
		LOGGER.info("Test case excuting second log statement...");
		assertEquals(true, true);
	}

}
