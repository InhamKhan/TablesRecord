package com.example.RecordsTable.Repository;

import com.example.RecordsTable.model.StudentRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentRecord, Long> {

    @Query("SELECT s FROM student s")
    List<StudentRecord> getAllRecords();
}
