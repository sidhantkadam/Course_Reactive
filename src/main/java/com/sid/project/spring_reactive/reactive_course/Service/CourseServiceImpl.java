package com.sid.project.spring_reactive.reactive_course.Service;

import com.sid.project.spring_reactive.reactive_course.DTO.CourseDTO;
import com.sid.project.spring_reactive.reactive_course.Entity.Course;
import com.sid.project.spring_reactive.reactive_course.Mapper.ModelMapper;
import com.sid.project.spring_reactive.reactive_course.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Flux<CourseDTO> getListCourses() {
        return courseRepo.findAll()
                .map(modelMapper::courseEntityToDto);
    }

    @Override
    public Mono<CourseDTO> createCourse(CourseDTO courseDTO) {

        Course course = modelMapper.courseDtoToEntity(courseDTO);
        return courseRepo.save(course)
                .map(modelMapper::courseEntityToDto);
    }

    @Override
    public Mono<CourseDTO> getCourseById(Integer id) {
        return courseRepo.findById(id)
                .map(modelMapper::courseEntityToDto);
    }

    @Override
    public Mono<Object> deleteCourseById(Integer id) {
        return courseRepo.findById(id).flatMap(
                course -> courseRepo.deleteById(id)
        );
    }
}
