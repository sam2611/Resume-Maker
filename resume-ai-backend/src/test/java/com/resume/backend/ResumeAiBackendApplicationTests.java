package com.resume.backend;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.resume.backend.service.ResumeService;

@SpringBootTest
class ResumeAiBackendApplicationTests {

	private ResumeService resumeService;

	@Test
	void contextLoads() throws IOException {
		
		resumeService.generateResumeResponse("I am Sakshi Mishra with 2 years of Experience.");
	}

}
