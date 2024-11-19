package com.sid.project.spring_reactive.reactive_course.Mapper;

import com.sid.project.spring_reactive.reactive_course.DTO.CourseDTO;
import com.sid.project.spring_reactive.reactive_course.Entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelMapper
{
    CourseDTO courseEntityToDto(Course course);

    Course courseDtoToEntity(CourseDTO courseDTO);
}
