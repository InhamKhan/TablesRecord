package com.example.RecordsTable.Service;

import com.example.RecordsTable.courseModel.Courses;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Optional<Courses> getCoursesById(Long id);

    List<Courses> getAllCourses();

    Courses saveCourses(Courses course);
}
