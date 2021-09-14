package com.javaspringjpa.huynhnguyenquocbao.repository;

import com.javaspringjpa.huynhnguyenquocbao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}