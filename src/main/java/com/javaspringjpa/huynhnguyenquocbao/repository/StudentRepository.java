package com.javaspringjpa.huynhnguyenquocbao.repository;

import com.javaspringjpa.huynhnguyenquocbao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select s from Student  s where s.email = ?1")
    public  Student getStudentByEmail(String email);

    @Query(value = "select s from Student  s where s.firstName = ?1 and s.lastName = ?2")
    public  Student getStudentByFLName(String firstName, String lastName);
}