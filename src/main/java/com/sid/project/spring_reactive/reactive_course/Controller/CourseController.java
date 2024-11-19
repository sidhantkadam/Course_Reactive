package com.sid.project.spring_reactive.reactive_course.Controller;

import com.sid.project.spring_reactive.reactive_course.DTO.CourseDTO;
import com.sid.project.spring_reactive.reactive_course.Service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v5")
public class CourseController
{
    @Autowired
    private CourseService courseService;


    @GetMapping("/listCourses")
    public ResponseEntity<Flux<CourseDTO>> getListCourse()
    {
        return new ResponseEntity<>(courseService.getListCourses(), HttpStatus.OK) ;
    }

    @PostMapping("/createCourse")
    public Mono<ResponseEntity<CourseDTO>> createCourse(@RequestBody CourseDTO courseDTO)
    {
        return courseService.createCourse(courseDTO).map(
                courseDTO1 -> ResponseEntity.status(HttpStatus.CREATED).body(courseDTO1)
        );
    }

    @GetMapping("/getCourse/{id}")
    public Mono<ResponseEntity<CourseDTO>> getCourseById(@PathVariable Integer id)
    {
        return courseService.getCourseById(id).map(
                courseDTO -> ResponseEntity.status(HttpStatus.FOUND)
                        .body(courseDTO)
        );
    }

    @DeleteMapping("/deleteCourse")
    public Mono<ResponseEntity<Object>> deleteById(@RequestParam Integer id)
    {
        return courseService.deleteCourseById(id).map(
                courseDto -> ResponseEntity.status(HttpStatus.OK)
                        .body(courseDto)
        );
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test()
    {
        return "its working !";
    }
}
