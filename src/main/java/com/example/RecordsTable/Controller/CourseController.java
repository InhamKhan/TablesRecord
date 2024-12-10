package com.example.RecordsTable.Controller;

import com.example.RecordsTable.Service.CourseService;
import com.example.RecordsTable.courseModel.Courses;
import com.example.RecordsTable.model.StudentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }
    @PostMapping("/addCourse")
    public Courses createCourses(@RequestBody Courses course){
        return courseService.saveCourses(course);
    }
    @GetMapping("/allCourses")
    public List<Courses> getAllCourses(){

        return courseService.getAllCourses();
    }
    @GetMapping("/allCourse/{id}")
    public ResponseEntity<Courses> getCourseById(@PathVariable Long id) {
        Optional<Courses> course = courseService.getCoursesById(id);
        return course.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

