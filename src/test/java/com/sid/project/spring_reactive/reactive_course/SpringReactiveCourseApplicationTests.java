package com.sid.project.spring_reactive.reactive_course;

import com.sid.project.spring_reactive.reactive_course.DTO.CourseDTO;
import com.sid.project.spring_reactive.reactive_course.Service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
class SpringReactiveCourseApplicationTests {

	@Autowired
	CourseService courseService;

	@Test
	void contextLoads() {
	}

	@Test
	public void createCourse()
	{
		courseService.createCourse(CourseDTO.builder()
						.courseName("Big Data")
						.id(2)
						.price(200)
				.build());
	}
}
