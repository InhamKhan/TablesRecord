
package com.example.RecordsTable.model;

import com.example.RecordsTable.courseModel.Courses;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class StudentRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Courses> courses;

    // Default constructor
    public StudentRecord() {
    }

    // Parameterized constructor
    public StudentRecord(Long id, String name, List<Courses> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}
