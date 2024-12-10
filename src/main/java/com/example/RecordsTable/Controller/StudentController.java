package com.example.RecordsTable.Controller;

import com.example.RecordsTable.Repository.StudentRepository;
import com.example.RecordsTable.Service.StudentService;
import com.example.RecordsTable.model.StudentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
//    private StudentRepository testRepo;


    public StudentController(StudentService studentService) {//, StudentRepository test
        this.studentService = studentService;
//        this.testRepo = test;
    }

    @PostMapping("/create")
    public StudentRecord createStudent(@RequestBody StudentRecord Student){
        return studentService.saveStudentRecord(Student);
    }
    @GetMapping("/all")
    public List<StudentRecord> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/all/{id}")
    public ResponseEntity<StudentRecord> getStudentById(@PathVariable Long id) {
        Optional<StudentRecord> Student = studentService.getStudentById(id);
        return Student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/test")
    public List<StudentRecord> getAllRecord(){

        return studentService.getAllRecords();
    }
}
