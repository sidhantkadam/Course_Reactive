package com.sid.project.spring_reactive.reactive_course.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CourseDTO
{
    private Integer id;
    private String courseName;
    private Integer price;
}
