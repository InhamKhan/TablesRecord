package com.example.RecordsTable.courseModel;

import com.example.RecordsTable.model.StudentRecord;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String course_name;
    private String teacher_name;

        @ManyToOne
        @JoinColumn(name = "student_id")
        private StudentRecord student;

    // Default constructor
    public Courses() {
    }

    // Parameterized constructor
    public Courses(Long id, String course_name, String teacher_name, StudentRecord student) {
        this.id = id;
        this.course_name = course_name;
        this.teacher_name = teacher_name;
        this.student = student;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public StudentRecord getStudent() {
        return student;
    }

    public void setStudent(StudentRecord student) {
        this.student = student;
    }
}
