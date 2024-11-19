package com.sid.project.spring_reactive.reactive_course.Service;

import com.sid.project.spring_reactive.reactive_course.DTO.CourseDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseService
{
    Flux<CourseDTO> getListCourses();

    Mono<CourseDTO> createCourse(CourseDTO courseDTO);

    Mono<CourseDTO> getCourseById(Integer id);

    Mono<Object> deleteCourseById(Integer id);
}
