package com.example.RecordsTable.Service;

import com.example.RecordsTable.model.StudentRecord;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    Optional<StudentRecord> getStudentById(Long id);

    StudentRecord saveStudentRecord(StudentRecord student);

    List<StudentRecord> getAllStudents();
    List<StudentRecord> getAllRecords();
}
