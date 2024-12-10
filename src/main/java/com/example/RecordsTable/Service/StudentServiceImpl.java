package com.example.RecordsTable.Service;

import com.example.RecordsTable.Repository.StudentRepository;
import com.example.RecordsTable.model.StudentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Optional<StudentRecord> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentRecord saveStudentRecord(StudentRecord student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentRecord> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public List<StudentRecord> getAllRecords() {
        return studentRepository.getAllRecords();
    }





}