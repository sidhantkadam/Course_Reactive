package com.sid.project.spring_reactive.reactive_course.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course")
public class Course
{
    @Id
    private Integer id;
    @Column(value = "course_name")
    private String courseName;
    private Integer price;
}
