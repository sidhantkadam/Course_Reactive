package com.sid.project.spring_reactive.reactive_course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories("com.sid.project.spring_reactive.reactive_course.Repository")
public class SpringReactiveCourseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringReactiveCourseApplication.class, args);
	}

}
