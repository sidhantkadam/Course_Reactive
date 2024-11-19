package com.sid.project.spring_reactive.reactive_course.Repository;

import com.sid.project.spring_reactive.reactive_course.Entity.Course;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CourseRepo extends ReactiveCrudRepository<Course, Integer>
{
//    Mono<Course> findByName(String name);
}