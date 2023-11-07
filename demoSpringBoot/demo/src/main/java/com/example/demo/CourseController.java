package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping("/Course")
	
	public List<Course123> getAllCourses(){
		
		
		return Arrays.asList(new Course123(1,"Learning MicroServices1","Mayank"));
		
		
	}

}
