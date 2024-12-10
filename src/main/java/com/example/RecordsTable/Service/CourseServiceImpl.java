package com.example.RecordsTable.Service;

import com.example.RecordsTable.Repository.CourseRepository;
import com.example.RecordsTable.courseModel.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Courses saveCourses(Courses course) {
        return  courseRepository.save(course);
    }

    @Override
    public Optional<Courses> getCoursesById(Long id) {
        return courseRepository.findById(id);
    }


    @Override
    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }
}